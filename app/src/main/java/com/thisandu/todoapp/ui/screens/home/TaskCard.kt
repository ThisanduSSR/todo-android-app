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
            .padding(bottom = 14.dp),

        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),

                horizontalArrangement =
                Arrangement.SpaceBetween
            ) {

                Text(
                    text = title,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold
                )

                Checkbox(
                    checked = completed,
                    onCheckedChange = {}
                )
            }

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                text =
                "Complete this task before deadline.",

                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            AssistChip(
                onClick = {},

                label = {

                    Text(
                        text =
                        if (completed)
                            "Completed"
                        else
                            "Pending"
                    )
                }
            )
        }
    }
}
