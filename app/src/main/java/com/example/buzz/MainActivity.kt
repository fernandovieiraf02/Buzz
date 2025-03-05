package com.example.buzz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buzz.ui.theme.BuzzTheme
import com.example.buzz.ui.theme.Typography
import com.example.buzz.ui.theme.aquaVerde

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuzzTheme(darkTheme = false) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        Box(
                            modifier = Modifier
                                .background(color = aquaVerde)
                                .fillMaxWidth()
                                .requiredHeight(64.dp)
                        )
                    }
                ) { innerPadding ->
                    HomePage(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier
                .requiredHeight(64.dp)
                .padding(top = 16.dp),
            painter = painterResource(R.drawable.logo_topo),
            contentScale = ContentScale.FillHeight,
            contentDescription = null
        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 24.dp, end = 24.dp),
            painter = painterResource(R.drawable.primeira_imagem),
            contentScale = ContentScale.FillWidth,
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(top = 80.dp, start = 24.dp, end = 24.dp),
            text = "Por dentro do mundo e das notícias em um só lugar.",
            style = Typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL)
@Composable
fun GreetingPreview() {
    BuzzTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                Box(
                    modifier = Modifier
                        .background(color = aquaVerde)
                        .fillMaxWidth()
                        .requiredHeight(64.dp)
                )
            }
        ) { innerPadding ->
            HomePage(Modifier.padding(innerPadding))
        }
    }
}