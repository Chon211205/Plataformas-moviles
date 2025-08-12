package com.example.lab4

//Bibliotecas importadas
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

//Clase principal
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4()
        }
    }
}

//Composable donde se desarrolla la app.
@Preview(showBackground = true)
@Composable
fun Lab4(){
    //Margen
    Box(
        //Modificador para utilizar toda la pantalla, ajustar el tamano del borde y asignar colores.
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF006400))
            .padding(5.dp)
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        //Funcion para insertar la imagen
        Image(
            //Inserta la imagen, extrayendo la imagen en la carpeta drawable.
            painter = painterResource(id =R.drawable.logo),
            //Indica que no hay descripcion de la imagen.
            contentDescription = null,
            //modificador para ajustar el tamano y la opacidad.
            modifier = Modifier
                .size(200.dp)
                .alpha(0.3f),
            contentScale = ContentScale.Crop
        )

        //Columna principal
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            //Universidad del valle de Guatemala
            Text(
                text = "Universidad del Valle de Guatemala",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = ""
            )

            //Programacion de plataformas moviles, seccion 30
            Text(
                text = "Programacion de plataformas moviles, seccion 30"
            )

            Text(
                text = ""
            )

            //Fila de integrantes y los nombres
            Row () {
                Column {
                    Text(
                        text = "INTEGRANTES",
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(100.dp))

                    Text(
                        text = "CATEDRATICO",
                        fontWeight = FontWeight.Bold
                    )
                }

                //Espacio de anchura
                Spacer(modifier = Modifier.width(100.dp))

                Column () {
                    Text(
                        text = "Luis Lee",
                    )

                    Text(
                        text = "Pablo Toledo"
                    )

                    Text (
                        text = "Adriana Martinez"
                    )

                    //Espacio de altura
                    Spacer(modifier = Modifier.height(67.dp))

                    Text(
                        text = "Juan Carlos Durini"
                    )
                }
            }

            //Espacios de altura.
            Spacer(modifier = Modifier.height(150.dp))

            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    text = "Luis Alfredo Lee Hsu"
                )

                Text(
                    text = "241203"
                )
            }


        }
    }

}
