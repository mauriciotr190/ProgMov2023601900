package com.example.holamundo

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.*
import androidx.compose.material3.Label
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.holamundo.ui.theme.HolaMundoTheme
import androidx.compose.foundation.layout.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIPrincipal()
        }
    }
}

@Composable
fun UIPrincipal() {
    val contexto = LocalContext.current
    var nombre by rememberSaveable { mutableStateOf("")}

    Column(
        modifier = Modifier.padding(20.dp)
    ){
        Text(text = "Nombre:")
        OutlinedTextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = {
                Text("Introduce tu nombre")
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)
        ){
            Button( // parametros del boton
                onClick={
                    Toast.makeText(contexto,"Hola $nombre!!", Toast.LENGTH_SHORT).show()
                }
            ){ // contenido que vaa tener  el boton
                Text( "Saludar!")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Previsualizacion() {
    UIPrincipal()
}