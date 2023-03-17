package net.itinajero.app.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import net.itinajero.app.R

class FirstAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Aplicamos a este Activity este layout
        setContentView(R.layout.activity_first_app)
        // Variable que guarda la referencia al boton con id 'btnStart' declarado en nuestro layout
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.txtName)

        // Evento Click del boton
        btnStart.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
                //Log.i("Boton", "Click del boton")
                /**
                 * Los Intent se usan para navegar entre pantallas (Activity).
                 * Este Intent sera para navegar a la pantalla (Intent) llamada ResultActivity
                 */
                val intent = Intent(this, ResultActivity::class.java)
                // Nos llevamos datos en el Intent a la siguiente pantalla (algo similar a agregar datos al modelo)
                intent.putExtra("EXTRA_NAME", name)
                // Mostramos la pantalla
                startActivity(intent)
            }
        }
        //Al arrancar la pantalla
    }

}