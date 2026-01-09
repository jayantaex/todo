package com.todo.core.common

import androidx.navigation3.runtime.NavEntry
import com.todo.core.common.screens.PageNotFound
import com.todo.core.navigation.Screen

object CommonModule {
    fun notFoundScreen(key: Screen): NavEntry<Screen> {
        return NavEntry(key) {
            PageNotFound()
        }
        }
}