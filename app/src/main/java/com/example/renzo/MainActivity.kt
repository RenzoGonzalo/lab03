package com.example.renzo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renzo.ui.theme.RenzoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RenzoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileCard(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFFE0F7FA), RoundedCornerShape(16.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Imagen del logotipo de Android
        Image(
            painter = painterResource(id = R.drawable.renzo), // Cambia ic_android si tu imagen tiene otro nombre
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nombre
        Text(
            text = "Renzo Quispe Valdez",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF004D40)
        )

        // Título
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            color = Color(0xFF00796B)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Información de contacto
        Text(text = "+11 (123) 444 555")  // Número de 9 dígitos
        Text(text = "@AndroidDev")
        Text(text = "ren225@gmail.com")  // Correo electrónico
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    RenzoTheme {
        ProfileCard()
    }
}
