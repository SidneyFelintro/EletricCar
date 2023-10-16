package com.example.eletriccar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var preco: EditText
    lateinit var calcular: Button
    lateinit var km: EditText
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }
    fun setupView(){
        preco = findViewById(R.id.preco_kwh)
        calcular = findViewById(R.id.calculo)
        km = findViewById(R.id.Km)
        result = findViewById(R.id.resposta)
    }
    fun setupListeners(){
        calcular.setOnClickListener{
            val preco = preco.text.toString().toFloat()
            val km = km.text.toString().toFloat()
            val resultado = preco / km

            result.text = resultado.toString()

            Log.d("preco ->", preco.toString())
            Log.d("Km percorrido ->", km.toString())
            Log.d("resultado ->",resultado.toString())
        }
    }
}