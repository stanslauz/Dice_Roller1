package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener { rollDice(); rollDice2() }

        diceImage = findViewById(R.id.dice_image)

        val textt: ImageView = findViewById(R.id.dice_image)
        textt.setOnClickListener { rollDice() }
        val texttt: ImageView = findViewById(R.id.dice_image2)
        texttt.setOnClickListener { rollDice2()}

//        val countUp: Button = findViewById(R.id.count_up)
//        countUp.setOnClickListener { countup() }
//
        val reset: Button = findViewById(R.id.reset)
        reset.setOnClickListener { resest() }
//

    }
    private fun rollDice(){
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
    }

        diceImage.setImageResource(drawableResource)}

    private fun rollDice2(){
        val diceImage: ImageView = findViewById(R.id.dice_image2)
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)}

//
//    private  fun countup(){
//        val resulttext: TextView = findViewById(R.id.result_text)
//        if (resulttext.text == "Hello World!"){
//            resulttext.text = "1"
//        }
//        else {
//            var resultint = resulttext.text.toString().toInt()
//            if (resultint<6){
//                resultint++
//                resulttext.text = resultint.toString()
//            }
//        }
//    }

    private  fun resest(){
        val restvut: ImageView = findViewById(R.id.dice_image)
        restvut.setImageResource(R.drawable.empty_dice)

        val restvut2: ImageView = findViewById(R.id.dice_image2)
        restvut2.setImageResource(R.drawable.empty_dice)
    }

}