
    abstract class Vehiculo(open val nombre: String) {
        abstract fun mover()
    }

    interface Sonido {
        fun hacerSonido()
    }

    class Coche(override val nombre: String) : Vehiculo(nombre), Sonido {
        override fun mover() {
            println("$nombre está conduciendo por la carretera")
        }

        override fun hacerSonido() {
            println("$nombre hace: Brum brum!")
        }
    }

    class Barco(override val nombre: String) : Vehiculo(nombre), Sonido {
        override fun mover() {
            println("$nombre está navegando por el mar")
        }

        override fun hacerSonido() {
            println("$nombre hace: Tuuut tuuut!")
        }
    }

    fun main() {
        val vehiculos = listOf(
            Coche("Ferrari"),
            Barco("Titanic")
        )

        for (vehiculo in vehiculos) {
            vehiculo.mover()
            if (vehiculo is Sonido) {
                vehiculo.hacerSonido()
            }
            println()
        }
    }
