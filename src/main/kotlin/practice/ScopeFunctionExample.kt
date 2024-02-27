/*
package practice

class ScopeFunctionExample {
}*/

package practice
import app.model.ComputerSpec

class ScopeFunctionExample {

    private var creatorName : String? = null
    private var computerData : ComputerSpec? = null

    fun run(){
        creatorName?.let {
            println("Created by : $creatorName")
        } ?: run {
            println("this project is Open Source")
        }

        /*
        if(creatorName != null){
            println("Created by : $creatorName")
        }else{
            println("this project is Open Source")
        }
         */

        println(computerData)
        computerData?.apply {
            this.processorName = "Intel Pentium"
        } ?: run {
            println("Computer Data is null")
        }
        computerData = ComputerSpec(
            processorName = "Intel i9",
            processorTotalCore = 8,
            isHaveIGPU = true,
            totalRamInGb = 32,
            EGPUName = "RTX 4060"
        )
        computerData?.apply {
            this.processorName = "Intel Pentium"
        } ?: run {
            println("Computer Data is null")
        }
        println(computerData)

        //with
        //before
        println(computerData?.processorName)
        println(computerData?.processorTotalCore)
        println(computerData?.isHaveIGPU)
        println(computerData?.totalRamInGb)
        println(computerData?.EGPUName)

        //after
        with(computerData){
            println(this?.processorName)
            println(this?.processorTotalCore)
            println(this?.isHaveIGPU)
            println(this?.totalRamInGb)
            println(this?.EGPUName)
        }

    }


    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            ScopeFunctionExample().run()
        }
    }
}