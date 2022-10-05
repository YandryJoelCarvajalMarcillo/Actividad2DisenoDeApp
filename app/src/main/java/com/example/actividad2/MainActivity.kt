package com.example.actividad2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
     * Esta actividad permite al usuario tirar un dado y ver el resultado
 * en pantalla.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        // Configure un oyente de clics en el botón para tirar los dados cuando el usuario toca el botón.
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Tira los dados y actualiza la pantalla con el resultado.
     */
    private fun rollDice() {
        // Crea un nuevo objeto Dice con 6 lados y hazlo rodar.
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Actualizar la pantalla con la tirada de dados.
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}