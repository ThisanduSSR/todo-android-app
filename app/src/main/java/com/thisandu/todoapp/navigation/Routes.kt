package com.thisandu.todoapp.navigation

sealed class Routes(val route: String) {

    object Login : Routes("login")

    object Home : Routes("home")

    object AddTodo : Routes("add_todo")
}
