package com.cristhian.imageview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto:TextView = findViewById(R.id.texto)
        val imagen:ImageView = findViewById(R.id.imagen)
        var contador = 0

        imagen.setOnClickListener{
            imagen.setImageResource(R.drawable.ic_launcher)
            contador +=1
            texto.text = contador.toString()
        }
    }
}
