package com.belkanoid.hammerssystem_testovoe.di

import androidx.lifecycle.ViewModel
import com.belkanoid.hammerssystem_testovoe.presentation.menu.viewModel.MenuViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MenuViewModel::class)
    fun bindsMenuViewModel(viewModel: MenuViewModel) : ViewModel
}