package practice

import kotlin.concurrent.thread

class CalculatorWrong {
    fun plus(a: Int, b: Int){
        val result = a + b
        println("Result = $result")
    }
}

class CalculatorRight {
    fun plus(a:Int, b:Int): Int{
        return a + b
    }
}

fun printResult(result: Number){
    println("The Result is $result")
}
class RockPaperScissor {

    private var playerOne: Int = -1
    private var playerTwo: Int = -1

    private fun printOptions(){
        println("""
            =================================
            GUNTING BATU KERTAS
            =================================
            OPTION
            0. GUNTING
            1. BATU
            2. KERTAS
        """.trimIndent()
        )
    }
    private fun showResult(playerOne : Int, playerTwo : Int): String{
        return if (((playerOne + 1) % 3) == playerTwo){
            "Player 2 Menang"
        }else if(playerOne == playerTwo){
            "Seri"
        }else{
            "Player 1 Menang"
        }
    }

    private fun inputPlayerOne(){
        println("Masukkan pilihan 1 (0/1/2)")
        playerOne = readln().toInt()
    }

    private fun inputPlayerTwo(){
        println("Masukkan pilihan 2 (0/1/2)")
        playerTwo = readln().toInt()
    }

    fun run(){
        printOptions()
        inputPlayerOne()
        inputPlayerTwo()
        showResult(playerOne, playerTwo)
    }
}

//fun main(args: Array<String>) {
//    RockPaperScissor().run()
//}

//OPEN - CLOSE
open class IronManSuit {
    open fun blast() {
        println("Blast using laser powered by Arc Reactor")
    }

    fun activateAI(){
        println("Jarvis is Active")
    }
}
class WarMachineSuit : IronManSuit(){
    override fun blast() {
        //super.blast()
        println("Blast from war machine suit")
        Thread.sleep(2000)
    }
}

class Capadocia {
    private lateinit var balloon : HotAirBalloon

    fun run(){
        balloon = BlueHotAirBalloon()
        balloon.apply {
            carryPassengers()
            blow()
            pop()
        }
    }
}

fun main(args: Array<String>) {
    Capadocia().run()
}

//interface Segregation
interface Animal{
    fun eat()
    fun hunt()
    fun walking()
    fun sleep()
    fun jump()
    fun breath()
    fun sound()
    fun reproduction()
}

interface Aves : Animal{
    fun fly()
    fun twit()
}
interface Fish : Animal{
    fun swim()
}

class Bird : Aves{
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun hunt() {
        TODO("Not yet implemented")
    }

    override fun walking() {
        TODO("Not yet implemented")
    }

    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun twit() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun jump() {
        TODO("Not yet implemented")
    }

    override fun breath() {
        TODO("Not yet implemented")
    }

    override fun sound() {
        TODO("Not yet implemented")
    }

    override fun reproduction() {
        TODO("Not yet implemented")
    }

}

class Catfish() : Fish{
    override fun swim() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun hunt() {
        TODO("Not yet implemented")
    }

    override fun walking() {
        TODO("Not yet implemented")
    }

    override fun sleep() {
        TODO("Not yet implemented")
    }

    override fun jump() {
        TODO("Not yet implemented")
    }

    override fun breath() {
        TODO("Not yet implemented")
    }

    override fun sound() {
        TODO("Not yet implemented")
    }

    override fun reproduction() {
        TODO("Not yet implemented")
    }

}

//Dependency Inversion
class FirebaseAnalytics() {
    fun log(event: String){
        println("Loggin to firebase : Event Name : $event")
        Thread.sleep(2000)
        println("Loggin Success")
    }
}
class NewRelicAnalytics() {
    fun log(event: String){
        println("Loggin to NewRelic : Event Name : $event")
        Thread.sleep(2000)
        println("Loggin Success")
    }
}
class MoEngageAnalytics() {
    fun log(event: String){
        println("Loggin to MoEngage : Event Name : $event")
        Thread.sleep(2000)
        println("Loggin Success")
    }
}

interface Analytics{
    fun logEvent(event: String)
}

//apnostic class
class Appanalytics :

class App(private val analytics: FirebaseAnalytics){

    private fun openPageLogin(){
        println("Open Page Login...")
        analytics.log("login")
    }

    private fun openPageHome(){
        println("Open Page Home...")
        analytics.log("home")
    }

    fun run() {
        openPageLogin()
        openPageHome()
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App(FirebaseAnalytics()).run()
        }
    }

}