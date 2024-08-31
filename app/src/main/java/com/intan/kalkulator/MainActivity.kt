package com.intan.kalkulator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class kalkulator : AppCompatActivity() {
    private lateinit var etAngka1: EditText
    private lateinit var etAngka2: EditText
    private lateinit var btnKali: Button
    private lateinit var btnTambah: Button
    private lateinit var btnKurang: Button
    private lateinit var textView7: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etAngka1 = findViewById(R.id.etAngka1)
        etAngka2 = findViewById(R.id.etAngka2)
        btnTambah = findViewById(R.id.btnTambah)
        btnKurang = findViewById(R.id.btnKurang)
        btnKali = findViewById(R.id.btnKali)
        textView7 = findViewById(R.id.textView7)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnKurang.setOnClickListener() {
            val hasil = etAngka1.text.toString().toInt() - etAngka2.text.toString().toInt()
            textView7.setText("hasil pengurangan : " + hasil)
        }

        btnTambah.setOnClickListener() {
            val hasil = etAngka1.text.toString().toInt() + etAngka2.text.toString().toInt()
            textView7.setText("hasil penjumlahan : " + hasil)
        }

        btnKali.setOnClickListener() {
            val hasil = etAngka1.text.toString().toInt() * etAngka2.text.toString().toInt()
            textView7.setText("hasil kali  : " + hasil)
        }


    }
}
