package com.belkanoid.hammerssystem_testovoe.presentation.menu.viewModel

import androidx.lifecycle.*
import com.belkanoid.hammerssystem_testovoe.domain.entity.Dishe
import com.belkanoid.hammerssystem_testovoe.domain.entity.Food
import com.belkanoid.hammerssystem_testovoe.domain.usecases.GetPayloadUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class MenuViewModel @Inject constructor(
    private val getPayloadUseCase: GetPayloadUseCase,
) : ViewModel() {


    private val _payload: MutableLiveData<Food> = MutableLiveData()
    val payload : LiveData<Food>
        get() = _payload

    private val _loading: MutableLiveData<Unit> = MutableLiveData()
    val loading : LiveData<Unit>
        get() = _loading

    init {
        viewModelScope.launch(Dispatchers.IO) {
            _payload.postValue(getPayloadUseCase())
            delay(50)
            _loading.postValue(Unit)
        }

    }

    fun getDishesByIds(dishesId: List<Int>): List<Dishe> {
        val allDishes = payload.value?.organization_payload?.dishes

        return allDishes?.filter { it.id in dishesId } ?: listOf()

    }

}