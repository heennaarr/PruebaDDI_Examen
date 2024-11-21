package com.example.pruebaddi_examen

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.silla_botones) // Asegúrate de que el layout correcto esté cargado

        val editText = findViewById<EditText>(R.id.edit)
        val button2 = findViewById<Button>(R.id.button2)
        val button1 = findViewById<Button>(R.id.button)
        val textView1 = findViewById<TextView>(R.id.text1)
        val textView2 = findViewById<TextView>(R.id.text2)

        button2.setOnClickListener {
            // Mostrar el Toast cuando se presione el botón
            Toast.makeText(applicationContext, "¡Has presionado el botón!", Toast.LENGTH_SHORT).show()
        }
        button1.setOnClickListener{
            val inputText = editText.text.toString()
            if (inputText.isNotEmpty()) {
                textView1.text = inputText
                textView2.text = inputText
            }
        }    }
}
