package com.example.minhaidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view:View){
        val esteAno = Calendar.getInstance().get(Calendar.YEAR)
        textView2.text = "Sua idade é:" + (esteAno - anoNascimento.text.toString().toInt())


    }
}