package com.thisandu.todoapp.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class TodoTask(
    val title: String,
    val completed: Boolean
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val tasks = listOf(
        TodoTask("Complete UI Design", false),
        TodoTask("Push Project to GitHub", true),
        TodoTask("Prepare Internship Project", false)
    )

    Scaffold(

        floatingActionButton = {

            FloatingActionButton(
                onClick = {}
            ) {

                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }

    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {

            Text(
                text = "My Tasks",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn {

                items(tasks) { task ->

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp)
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),

                            horizontalArrangement =
                            Arrangement.SpaceBetween
                        ) {

                            Text(
                                text = task.title,
                                fontSize = 18.sp
                            )

                            Checkbox(
                                checked = task.completed,
                                onCheckedChange = {}
                            )
                        }
                    }
                }
            }
        }
    }
}
