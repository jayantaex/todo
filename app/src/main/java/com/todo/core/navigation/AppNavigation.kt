package com.todo.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.ui.NavDisplay
import com.todo.core.common.CommonModule
import com.todo.features.auth.AuthModule
import com.todo.features.onBoarding.views.OnBoardingModule

@Composable
fun AppNavigation() {
    val backStack = remember { mutableStateListOf<Screen>(Screen.OnBoarding) }

    NavDisplay(
        backStack = backStack,
        onBack = {
            if (backStack.size > 1) {
                backStack.removeAt(backStack.size - 1)
            }
        }
    ) { key ->
        when (key) {
            is Screen.OnBoarding -> OnBoardingModule.screen(key)
            is Screen.Login -> AuthModule.loginScreen(key)
            is Screen.Registration -> AuthModule.registrationScreen(key)
        }
    }
}
