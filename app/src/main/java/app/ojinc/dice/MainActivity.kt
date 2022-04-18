package app.ojinc.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val roll: Button = findViewById(R.id.button)
        roll.setOnClickListener { rollDice() }
    }

     private fun rollDice(){
         val myArr = arrayOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)
         val diceOne: ImageView = findViewById(R.id.dice1)
         val diceTwo: ImageView = findViewById(R.id.dice2)
         val diceThree: ImageView = findViewById(R.id.dice3)
         val info: TextView = findViewById(R.id.InfoText)
         val myStr = arrayOf("You Win", "You Lose")
         val randomImage1 = myArr.random()
         val randomImage2 = myArr.random()
         val randomImage3 = myArr.random()
         diceOne.setImageResource(randomImage1)
         diceTwo.setImageResource(randomImage2)
         diceThree.setImageResource(randomImage3)
         if(randomImage1 == R.drawable.dice6 && randomImage2 == R.drawable.dice6 ||
             randomImage1 == R.drawable.dice6 && randomImage3 == R.drawable.dice6 ||
             randomImage2 == R.drawable.dice6 && randomImage3 == R.drawable.dice6
         ){
             info.text = myStr[0]
         } else {
             info.text = myStr[1]
         }
    }
}