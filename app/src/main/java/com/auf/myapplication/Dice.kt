package com.auf.myapplication

class Dice {
    var Dice1=(1..9).random()
    var Dice2=(1..7).random()
    var Dice3=(1..5).random()

    val LuckyNumber=7
    val LuckyNum=6
    val LuckyNmb=2

    var Checker:Boolean=false
    var LuckyChecker:Boolean=false
    var LuckyCheck:Boolean=false

    private fun Lucky(){
        if (Dice1==LuckyNumber){
            Checker=true
        }
        else{
            Checker=false
        }
    }

    private fun Lucky2(){
        if (Dice1==LuckyNum){
            LuckyChecker=true
        }
        else{
            LuckyChecker=false
        }
    }

    private fun Lucky3(){
        if (Dice1==LuckyNmb){
            LuckyCheck=true
        }
        else{
            LuckyCheck=false
        }
    }

    var LuckyRoll=Lucky()
    var LuckyRoll2=Lucky2()
    var LuckyRoll3=Lucky3()

}