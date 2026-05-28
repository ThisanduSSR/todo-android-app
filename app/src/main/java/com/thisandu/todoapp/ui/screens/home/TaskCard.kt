package com.thisandu.todoapp.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskCard(
    title: String,
    completed: Boolean
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),

            horizontalArrangement =
            Arrangement.SpaceBetween
        ) {

            Column {

                Text(
                    text = title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(
                    modifier = Modifier.height(6.dp)
                )

                Text(
                    text =
                    if (completed)
                        "Completed"
                    else
                        "Pending",

                    color =
                    if (completed)
                        MaterialTheme.colorScheme.primary
                    else
                        MaterialTheme.colorScheme.error
                )
            }

            Checkbox(
                checked = completed,
                onCheckedChange = {}
            )
        }
    }
}
