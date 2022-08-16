package com.example.rickmortycliente.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    /*primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200

     */
    primary = miBrown200,
    primaryVariant = miBrown700,
    secondary = miOrange200
)

private val LightColorPalette = lightColors(
   //primary = Purple500,
   //primaryVariant = Purple700,
   //secondary = Teal200,

    primary = miBrown500,
    primaryVariant = miBrown700,
    secondary = miOrange400



   /* Other default colors to override
   background = Color.White,
   surface = Color.White,
   onPrimary = Color.White,
   onSecondary = Color.Black,
   onBackground = Color.Black,
   onSurface = Color.Black,
   */
)

@Composable
fun RickMortyClienteTheme(
   darkTheme: Boolean = isSystemInDarkTheme(),
   content: @Composable () -> Unit
) {
   val colors = if (darkTheme) {
       DarkColorPalette
   } else {
       LightColorPalette
   }

   MaterialTheme(
       colors = colors,
       typography = Typography,
       shapes = Shapes,
       content = content
   )
}