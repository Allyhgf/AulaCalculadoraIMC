package com.example.aulacalculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular = findViewById(R.id.button_calcular)

        buttonCalcular.setOnClickListener {

            val intent = Intent(this, ResultadoActivity::class.java)

            startActivity(intent)

        }

    }
}