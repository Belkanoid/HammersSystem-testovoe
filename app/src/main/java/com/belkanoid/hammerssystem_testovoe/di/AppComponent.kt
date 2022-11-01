package com.belkanoid.hammerssystem_testovoe.di

import com.belkanoid.hammerssystem_testovoe.presentation.menu.MenuFragment
import dagger.Component

@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class,
    ]
)
interface AppComponent {

    fun inject(menuFragment: MenuFragment)

}