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
fun TaskStatistics() {

    Row(
        modifier = Modifier.fillMaxWidth(),

        horizontalArrangement =
        Arrangement.spacedBy(12.dp)
    ) {

        Card(
            modifier = Modifier.weight(1f)
        ) {

            Column(
                modifier = Modifier.padding(16.dp),

                horizontalAlignment =
                Alignment.CenterHorizontally
            ) {

                Text(
                    text = "12",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Total Tasks"
                )
            }
        }

        Card(
            modifier = Modifier.weight(1f)
        ) {

            Column(
                modifier = Modifier.padding(16.dp),

                horizontalAlignment =
                Alignment.CenterHorizontally
            ) {

                Text(
                    text = "5",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Completed"
                )
            }
        }
    }
}
