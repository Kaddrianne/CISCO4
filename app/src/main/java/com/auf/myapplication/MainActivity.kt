package com.auf.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val InGameName=findViewById<EditText>(R.id.IGN)

        val Roller=findViewById<TextView>(R.id.Roll10)
        val Roller2=findViewById<TextView>(R.id.Roll20)
        val Roller3=findViewById<TextView>(R.id.Roll30)

        val Roller4=findViewById<TextView>(R.id.Roll1)
        val Roller5=findViewById<TextView>(R.id.Roll2)
        val Roller6=findViewById<TextView>(R.id.Roll3)

        val CheckBoxx=findViewById<CheckBox>(R.id.checkBox)

        val RollButton=findViewById<Button>(R.id.button)

        RollButton.setOnClickListener{
            val Die=Dice()
            Roller.text="Dice 1="+Die.Dice1
            Roller2.text="Dice 2="+Die.Dice2
            Roller3.text="Dice 3="+Die.Dice3

            if(Die.Checker==true){
                Roller4.text="Lucky!"
            }
            else{
                Roller4.text="Unlucky"
            }
            if(Die.LuckyChecker==true){
                Roller5.text="Lucky!"
            }
            else{
                Roller5.text="Unlucky"
            }
            if(Die.LuckyCheck==true){
                Roller6.text="Lucky!"
            }
            else{
                Roller6.text="Unlucky"
            }
            if(CheckBoxx.isChecked){
                if(Die.Checker||Die.LuckyChecker||Die.LuckyCheck){
                    var toast=Toast.makeText(applicationContext,"Congrats! You're Lucky!"+InGameName.text,Toast.LENGTH_SHORT)
                    toast.show()
                }
                else{
                    var toast=Toast.makeText(applicationContext,"Unlucky! Try Again!"+InGameName.text,Toast.LENGTH_SHORT)
                    toast.show()
                }

            }
        }
    }
}