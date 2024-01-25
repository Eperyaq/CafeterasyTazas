import kotlin.random.Random
fun main() {

//TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina

    val cafetera1= Cafetera("Salon") // usamos el constructor primario

    val cafetera2 = Cafetera("cocina",750) //Usamos el primer constructor secundario

    val cafetera3 = Cafetera("oficina", 500, 200) //Usamos el segundo constructor secundario

    //TODO: Crear una lista de 20 tazas con capacidades aleatorias

    /*
    val capacidades = listOf(50,75,100)
    val listaDeTazas = listOf(Tazas, capacidades).random()
    No se como hacer esa parte
     */

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)


    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    println("Vaciar la cafetera2...")
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    println("Agregar 400 c.c. de café a la cafereta3...")

    //TODO: Llenar la cafetera1 de café.

    cafetera1.llenar()

    //TODO: Vaciar la cafetera2.

    cafetera2.vaciar()


    //TODO: Agregar café a la cafetera2 a la mitad de su capacidad.

    cafetera2.agregarCafe(375)

    //TODO: Agregar 400 c.c. de café a la cafereta3

    cafetera3.agregarCafe(400)

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    println("**********************************************")
    println("Servir café en las tazas...")

    //TODO: Servir café en las tazas... siempre que haya café en la cafetera y en el orden cafetera1, cafetera2 y cafetera3.

    //No puedo probarlo ya que no se como hacer la lista de tazas.
    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
}