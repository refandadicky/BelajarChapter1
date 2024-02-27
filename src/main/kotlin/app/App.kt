/*
package app

class App {

}*/
package app

import app.model.ComputerSpec
import java.lang.NumberFormatException

class App(var creatorName: String? = null) {

    private val computerData = listOf(
        ComputerSpec(
            processorName = "Intel i9",
            processorTotalCore = 8,
            isHaveIGPU = true,
            totalRamInGb = 32,
            EGPUName = "RTX 4080"
        ),
        ComputerSpec(
            processorName = "Intel i7",
            processorTotalCore = 8,
            isHaveIGPU = true,
            totalRamInGb = 16,
            EGPUName = "RTX 3060"
        ),
        ComputerSpec(
            processorName = "Intel i3",
            processorTotalCore = 6,
            isHaveIGPU = true,
            totalRamInGb = 16,
            EGPUName = "RTX 2080"
        )
    )
    private var selectedComputer: ComputerSpec? = null

    fun run(){
        printHeader()
        getSelectedComputer()

    }
    fun printHeader(){

        println("================================")
        println("Created By : $creatorName")
        println("================================")
        println(" Oreder PC app.App")
        println("================================")
        computerData.forEachIndexed { index, data ->
            println("${index + 1}.${data.processorName} : ${data.EGPUName}")
        }// lambada fuction
        println("================================")
    }

    fun getSelectedComputer(){
        println("Masukkan pilihan anda : ")
        try {
            val selectedIndex = readln().toInt()
            if (selectedIndex in 1 .. computerData.size){
                selectedComputer = computerData[selectedIndex - 1]
                print("Pilihan Anda adalah : $selectedIndex")
            }else{
                print("Pilihan Anda salah, Silahkan coba lagi")
                getSelectedComputer()
            }
        }catch (e : NumberFormatException){
            println("Pilihan anda Salah")
            getSelectedComputer()//recursive
        }
    }

    companion object{
        @JvmStatic //annotation
        fun main(args: Array<String>) {
            App("Refanda").run()
        }
    }
}