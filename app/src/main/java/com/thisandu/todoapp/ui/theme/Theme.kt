package com.thisandu.todoapp.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = PrimaryBlue,
    background = LightBackground,
    surface = CardLight
)

private val DarkColors = darkColorScheme(
    primary = PrimaryBlue,
    background = DarkBackground,
    surface = CardDark
)

@Composable
fun TodoTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme =
        if (darkTheme)
            DarkColors
        else
            LightColors,

        content = content
    )
}
