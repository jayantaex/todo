import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.todo.core.themes.DarkColorScheme
import com.todo.core.themes.DefaultTypography
import com.todo.core.themes.LightColorScheme

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit

) {
    val colorScheme: ColorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    };

    MaterialTheme(
        colorScheme = colorScheme,
        typography = DefaultTypography,
        content = content

    )
}