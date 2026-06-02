package com.mugiwara.ligofleyends

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setupNavigation()
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvRegistrate = findViewById<TextView>(R.id.tvRegistrateAqui)

        btnLogin.setOnClickListener {
            val intent = Intent(this, PaginaPrincipal::class.java)
            startActivity(intent)
        }

        tvRegistrate.setOnClickListener {
            val intent = Intent(this, CrearCuenta::class.java)
            startActivity(intent)
        }
    }
}