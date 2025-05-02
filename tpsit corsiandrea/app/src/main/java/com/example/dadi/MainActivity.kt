package com.example.dadi

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button= findViewById(R.id.bottone1) //riferimento  all'ogetto bottone  nella varivabile roll button

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Rullo di dadi", Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
        }
    }
    private fun rollDice(){
        val dice = Dice(6)
        val diceroll= dice.roll()
        val resulttextView: TextView = findViewById(R.id.testo1)
        resulttextView.text = diceroll.toString()
    }

}

class Dice(private  val numSides: Int){
    fun roll(): Int{
        return  (1..numSides).random()
    }
}