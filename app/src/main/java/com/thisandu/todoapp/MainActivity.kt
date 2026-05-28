package com.thisandu.todoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.thisandu.todoapp.navigation.AppNavigation
import com.thisandu.todoapp.ui.theme.TodoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            TodoTheme {

                AppNavigation()
            }
        }
    }
}
