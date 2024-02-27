package practice

//Encapsulation
private class AClass() {
    private fun run() {
        println("This is from class A")
    }

    fun runPublic() {
        println("this is from class A in public")
    }
}

class BClass() {
    fun run() {
        // we cannot call run bcs it's private :D
        //AClass().run()
        AClass().runPublic()
        println("This is from class B")
    }
}

//Abstraction

//Kakek
interface Balloon {
    fun blow()
    fun pop()
}

//Bapak
abstract class HotAirBalloon() : Balloon {
    override fun blow() {
        println("Blow the balloon using hot air")
    }

    override fun pop() {
        println("Danger !!!")
    }

    //wajib untuk di implement di turunan class nya
    abstract fun carryPassengers()
}

//Anak
class RedHotAirBalloon() : HotAirBalloon() {
    //extend
    //wajib untuk di implement di turunan class nya
    override fun carryPassengers() {
        println("Carrying 5 Passengers")
    }

    //overloading
    fun blow(name: String) {

    }
}

class BlueHotAirBalloon() : HotAirBalloon() {
    //extend
    //wajib untuk di implement di turunan class nya
    override fun carryPassengers() {
        println("Carrying 5 Passengers")
    }

    override fun blow() {
        println("blowing the baloon using blue energy")
    }

    override fun pop() {
        println("Ledakkan")
    }
}

//Polymorphism
class RedBalloon() : Balloon {
    override fun blow() {
        println("Meniup balon Merah...")
    }

    override fun pop() {
        println("Balon Merah Meledak...")
    }
}

class BlueBalloon() : Balloon {
    override fun blow() {
        println("Meniup balon Biru...")
    }

    override fun pop() {
        println("Balon Biru Meledak...")
    }
}

open class Processor(val name: String) {
    fun initProcessor() {
        println("Initialize ... $name")
    }
}

class AMDProcessor() : Processor("Ryzen 9")
class IntelProcessor() : Processor("Intel i9")


fun main() {
    RedHotAirBalloon().let {
        it.blow()
        it.pop()
        //
        it.carryPassengers()
        AMDProcessor().initProcessor()
        IntelProcessor().initProcessor()

    }
}