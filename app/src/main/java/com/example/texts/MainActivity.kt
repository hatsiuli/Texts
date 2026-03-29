package com.example.texts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val lbl = findViewById<TextView>(R.id.tv)
        val txt = findViewById<EditText>(R.id.editTextText)
        val num = findViewById<EditText>(R.id.editTextNumber)
        val auto = findViewById<EditText>(R.id.autoCompleteTextView)
        val eml = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val phn = findViewById<EditText>(R.id.editTextPhone)
        val pwd = findViewById<EditText>(R.id.editTextTextPassword)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val t = txt.text.toString()
            val ns = num.text.toString().trim()
            var n:Int = ns.toInt()
            n *= 2
            val a = auto.text.toString()
            val e=eml.text.toString()
            val ph=phn.text.toString()
            val p=pwd.text.toString()


            lbl.text = "$t$n$a$e$ph$p"

        }


    }
}