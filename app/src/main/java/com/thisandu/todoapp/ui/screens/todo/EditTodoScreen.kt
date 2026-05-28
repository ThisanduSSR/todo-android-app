package com.thisandu.todoapp.ui.screens.todo

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EditTodoScreen() {

    var title by remember {
        mutableStateOf("Complete Internship Project")
    }

    var description by remember {
        mutableStateOf("Finish Android Todo application")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = "Edit Task",

            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = title,

            onValueChange = {
                title = it
            },

            label = {
                Text("Task Title")
            },

            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = description,

            onValueChange = {
                description = it
            },

            label = {
                Text("Task Description")
            },

            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {},

            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Update Task")
        }
    }
}
