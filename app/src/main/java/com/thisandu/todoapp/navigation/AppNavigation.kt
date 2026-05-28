package com.thisandu.todoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.thisandu.todoapp.ui.screens.auth.LoginScreen
import com.thisandu.todoapp.ui.screens.home.HomeScreen
import com.thisandu.todoapp.ui.screens.todo.AddTodoScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,

        startDestination = Routes.Login.route
    ) {

        composable(Routes.Login.route) {
            LoginScreen()
        }

        composable(Routes.Home.route) {
            HomeScreen()
        }

        composable(Routes.AddTodo.route) {
            AddTodoScreen()
        }
    }
}
