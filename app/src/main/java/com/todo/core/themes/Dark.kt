package com.todo.core.themes

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import com.todo.core.colors.AppColors

val DarkColorScheme: ColorScheme = darkColorScheme(
    primary = AppColors.primary,
    onPrimary = AppColors.black,
    error = AppColors.error,
    onError = AppColors.white,
    secondary = AppColors.secondary,
    onSecondary = AppColors.black,
)