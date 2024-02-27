package practice

import java.lang.NumberFormatException

//define with type data
val index : Int = 0 //immuteable -> tidak bisa kita diubah nilainya
var aString : String = "11/100" //muteable -> bisa kita diubah nilainya

//define without type data
val annotherString = "loren ipsum"
val anNumber = 19
val anNumber2 = 19.2
val anNumber4 = 19123456789

//konstanta
const val anNumber3 = 19.123456

//array and object
val arrData = arrayOf("0", "2", "3")
val arrayData : Array<String> = arrayOf("adaad","refeg")


//list : immutable
val listData : List<String> = listOf("1", "2", "3");
// list : mutable
var mutableList = mutableListOf("12", "13", "14")


fun main(args: Array<String>) {
    try {
        println(mutableList) // 12,13,14
        mutableList.add("15")
        println(mutableList) // 12,13,14,15
        mutableList.removeAt(0)
        println(mutableList) // 13,14,15
        mutableList.remove("13")
        println(mutableList) // 14,15
    }catch (e : Exception){
        println("Code Eror")
    }


    /*    println(practice.getIndex)
        println(practice.getAString)
        practice.getAString = "kucing oren"
        println(practice.getAString)
        println(practice.getArrData)
        println(practice.getListData)
        println(practice.getMutableList)
        practice.getMutableList.add("6")
        println(practice.getMutableList)*/
    printHeader()
}

fun printHeader(){
    println("================================")
    println(" Oreder PC app.App")
    println("================================")
    println(" 1. Bundle Ryzen 5 + RTX 3060")
    println(" 2. Bundle Intel i5 + RTX 4080")
    println(" 3. Bundle Ryzen 5 + RTX 3060")
    println(" 4. Bundle Intel i7 + RTX 4080")
    println("================================")
    println("Masukkan pilihan anda : ")
    try {
        val userPick = readln().toInt()
        print("Pilihan Anda adalah : $userPick")
    }catch (e : NumberFormatException){
        println("Pilihan anda Salah")
    }
}