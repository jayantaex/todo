package com.todo.core.common.results.error

import com.todo.core.constants.AppCode

fun AppErrorHandler(error: Any): AppError {
    return when (error) {
        is AppError -> error
        is String -> AppError(error, AppCode.FUNC_ERROR)
        else -> AppError("Something went wrong")
    }
}