package com.example.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener{rollDice()}


    }
    private fun rollDice() {
        val input: EditText = findViewById(R.id.TextInput)
        val stringInput = input.text.toString()
        val dice = Dice(stringInput.toInt())
        val dieRoll = dice.roll()
        val dieRoll2 = dice.roll()
        val result: TextView = findViewById(R.id.textView)
        result.text = dieRoll.toString()
        val result2: TextView = findViewById(R.id.textView2)
        result2.text = dieRoll2.toString()

    }


}

public class Dice(private val numSides: Int) {
    fun roll(): Int { // tells kotlin that this function will return an integer
        return (1..numSides).random()


    }

}



