package com.mugiwara.ligofleyends

import android.content.Intent
import android.widget.ImageButton
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    protected fun setupNavigation() {
        val btnMenu = findViewById<ImageButton>(R.id.btnMenu)
        btnMenu?.setOnClickListener { view ->
            val popup = PopupMenu(this, view)
            popup.menuInflater.inflate(R.menu.navegacion, popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.inicioFragment -> {
                        startActivity(Intent(this, PaginaPrincipal::class.java))
                        true
                    }
                    R.id.basesDeDatos -> {
                        startActivity(Intent(this, BasesDeDatos::class.java))
                        true
                    }
                    R.id.forosFragment -> {
                        startActivity(Intent(this, ListaForos::class.java))
                        true
                    }
                    R.id.guiasFragment -> {
                        startActivity(Intent(this, ListaGuias::class.java))
                        true
                    }
                    R.id.noticiasFragment -> {
                        startActivity(Intent(this, ListaNoticias::class.java))
                        true
                    }
                    R.id.crearGuia -> {
                        startActivity(Intent(this, CrearGuia::class.java))
                        true
                    }
                    else -> false
                }
            }
            popup.show()
        }
    }
}