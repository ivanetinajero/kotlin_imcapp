package net.itinajero.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import net.itinajero.app.firstapp.FirstAppActivity
import net.itinajero.app.imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludar = findViewById<Button>(R.id.btnSaludarApp)
        val btnImc = findViewById<Button>(R.id.btnImcApp)
        btnSaludar.setOnClickListener {
            navigateToSaludarApp()
        }
        btnImc.setOnClickListener {
            navigateToImcApp()
        }
    }

    private fun navigateToSaludarApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
}