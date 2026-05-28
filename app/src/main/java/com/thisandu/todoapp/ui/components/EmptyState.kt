package com.thisandu.todoapp.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EmptyState() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "No Tasks Yet",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Tap the add button to create your first task",

            style = MaterialTheme.typography.bodyLarge
        )
    }
}
