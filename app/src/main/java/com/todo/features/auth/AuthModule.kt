package com.todo.features.auth

import LoginScreen
import androidx.navigation3.runtime.NavEntry
import com.todo.core.navigation.Screen
import com.todo.features.auth.views.screens.RegistrationScreen

object AuthModule {
    fun loginScreen(key: Screen): NavEntry<Screen> {
        return NavEntry(key) {
            LoginScreen()
        }
    }

    fun registrationScreen(key: Screen): NavEntry<Screen> {
        return NavEntry(key) {
            RegistrationScreen()
        }
    }
}
