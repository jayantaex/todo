package com.todo.core.common.results.error
import com.todo.core.constants.AppCode

data class AppError(
    val message: String,
    val code: Int = AppCode.UNKNOWN_ERROR,
)
