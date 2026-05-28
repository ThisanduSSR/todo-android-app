package com.thisandu.todoapp.ui.screens.auth

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Todo App",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Manage your daily tasks easily",

            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(40.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},

            label = {
                Text("Email")
            },

            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(18.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},

            label = {
                Text("Password")
            },

            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(28.dp))

        Button(
            onClick = {},

            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp)
        ) {

            Text(
                text = "Login",
                fontSize = 18.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        TextButton(
            onClick = {}
        ) {

            Text(
                text = "Create New Account"
            )
        }
    }
}
