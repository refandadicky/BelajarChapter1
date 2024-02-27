/*package practice

class ControlFlowExample {
}*/

package practice

import app.model.ComputerSpec

class ControlFlowExample {

    val name : String? = null
    private var computerData : ComputerSpec? = null

    fun run(){
        /*//if else
        println(checkName("nope"))*/
        println(checkNama())

    }

    fun checkName(name: String): String{
        return if (name == null){
            "Your name still Empty"
        } else if (name.contains("Nope", ignoreCase = true)){
            "Oh Nope anak depok ya?"
        } else if (name.contains("Nope", ignoreCase = true)){
            "Oh Komang anak bali"
        } else{
            "ihhh gatau kamu dimana ...."
        }
    }

    private fun checkNameUsingWhen(name: String?): String{
        //when biasanya digunakan untuk nilai yang fix
        return when (name) {
            "agus"-> "Apakah kamu lahir di Agustus ?"
            "raya"-> "Apakah kamu lahir di hari raya ?"
            else -> {"Data kamu tidak ada"}
        }
    }

    private fun exampleWhen(){
        val contentType = ContentType.PHOTO
        when(contentType){
            ContentType.PHOTO -> println("Konten Photo")
            ContentType.VIDEO -> println("Konten Video")
            ContentType.REELS -> println("Konten Reels")
        }
    }

    fun printSomething(){
        /*//for - loop 1
        for(Index in 1 .. 3){
            println("Ini looping ke : $Index")
        }
        //for - loop step looping
        for(Index in 1 .. 10 step 2){
            println("Ini looping ke : $Index")
        }
        //for - loop downTo
        for(Index in 10 downTo  1 step 2){
            println("Ini looping ke : $Index")
        }
        //for-loop manual
        for (Index in computerData.indices) {
            println("$Index ${computerData[Index]}")
        }
        //equivalent
        computerData.forEach{
            println("$it")
        }
        //with index
        computerData.forEachIndexed{ index, computerSpec ->
            println("${index + 1}$computerSpec")
        }*/

        ///While && do while
        var Index = 0
        do {
            println(Index)
            Index++
        } while (Index < 5)

        Index = 0
        while (Index < 5){
            println(Index)
            Index++
        }

        // escape, and continue
        for (index in 1 .. 10){
            if(index == 5) continue
            println("Ini looping ke : $index")
        }
        // destroy the loop
        for (index in 1 .. 10){
            if(index == 5) break
            println("Ini looping ke : $index")
        }
    }

    private var nama: String? = null
    private fun checkNama(){
        //escape condition
        if (nama == null) return
        println("Nama anda adalah$nama")
        println("Anda adalah anak pemilik BCA")
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            ControlFlowExample().run()
        }
    }
}

//enum class adalah suatu class yang digunakan untuk identify sesuatu yang sudah fix
enum class ContentType{
    PHOTO,VIDEO,REELS
}