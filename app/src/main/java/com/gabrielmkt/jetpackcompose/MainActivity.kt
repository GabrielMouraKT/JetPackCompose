package com.gabrielmkt.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Register()

        }
    }
}
//Função para logica, nao usa a anotacao @composable e nem inicia em maiusculo.
fun calc(){


}

@Composable  //Sempre que for criar uma tela utiliza a anotacao Composable e a funcao Inicia com Maiusculo
fun Register(){
    Column (

    ){
        Text(text = "Register")
    }


}

@Composable
fun Login(){


}