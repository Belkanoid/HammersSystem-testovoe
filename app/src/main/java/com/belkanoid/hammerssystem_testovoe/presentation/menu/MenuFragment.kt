package com.belkanoid.hammerssystem_testovoe.presentation.menu

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.belkanoid.hammerssystem_testovoe.R
import com.belkanoid.hammerssystem_testovoe.databinding.FragmentMenuBinding
import com.belkanoid.hammerssystem_testovoe.presentation.App
import com.belkanoid.hammerssystem_testovoe.presentation.ViewModelFactory
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.CategoryAdapter
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.MenuAdapter
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.TopPromoAdapter
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.holders.CategoryHolder
import com.belkanoid.hammerssystem_testovoe.presentation.menu.viewModel.MenuViewModel
import com.belkanoid.hammerssystem_testovoe.presentation.splash.SplashFragment
import javax.inject.Inject


class MenuFragment : Fragment() {

    private var _binding : FragmentMenuBinding? = null
    private val binding : FragmentMenuBinding
        get() = _binding ?: throw RuntimeException("FragmentMenuBinding == null")

    @Inject lateinit var viewModelFactory: ViewModelFactory

    private val menuViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[MenuViewModel::class.java]
    }
    private val component by lazy {
        (requireActivity().application as App).component
    }

    private lateinit var menuAdapter : MenuAdapter
    private lateinit var categoryAdapter : CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        component.inject(this)
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        requireActivity().supportFragmentManager.beginTransaction()
            .add(R.id.container_main, SplashFragment.newInstance())
            .addToBackStack(null)
            .commit()

        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        menuViewModel.loading.observe(viewLifecycleOwner) {
            requireActivity().supportFragmentManager.popBackStack()
        }

        menuViewModel.payload.observe(viewLifecycleOwner) {
            menuAdapter.submitList(it.organization_payload.dishes)
            categoryAdapter.submitList(it.organization_payload.categories)
        }
        setupRecyclerView()


    }

    private fun setupRecyclerView() {
        binding.foodRecyclerview.apply {
            menuAdapter = MenuAdapter()
            adapter = menuAdapter
        }

        binding.categoriesRecyclerview.apply {
            categoryAdapter = CategoryAdapter()
            adapter = categoryAdapter
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        }

        binding.promoBannerRecyclerview.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            adapter = TopPromoAdapter()

        }

        categoryAdapter.apply {
            onCategoryClickListener = {
                val dishes = menuViewModel.getDishesByIds(it.dish_ids)
                menuAdapter.submitList(dishes)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

