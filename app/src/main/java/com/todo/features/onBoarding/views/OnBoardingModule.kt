package com.todo.features.onBoarding.views
import androidx.navigation3.runtime.NavEntry
import com.todo.core.navigation.Screen
import com.todo.features.onBoarding.views.screens.OnBoardingScreen

object OnBoardingModule {
    fun screen(key: Screen): NavEntry<Screen> {
        return NavEntry(key) {
            OnBoardingScreen()
        }
    }

}