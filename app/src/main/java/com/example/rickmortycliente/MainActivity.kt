package com.example.rickmortycliente

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rickmortycliente.ui.home.PersonajesScreen
import com.example.rickmortycliente.ui.theme.RickMortyClienteTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RickMortyClienteTheme {
                Scaffold(
                    topBar=
                    {
                    TopAppBar{
                        Text("Rick an Morty")
                    }
                }

                ){
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        //Greeting("Android")
                        PersonajesScreen()
                    }
                }
                // A surface container using the 'background' color from the theme

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RickMortyClienteTheme {
        Greeting("Android")
    }
}