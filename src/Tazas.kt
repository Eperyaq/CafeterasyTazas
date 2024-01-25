
/**
 * Colores disponibles para las tazas
 */
enum class COLOR{
    Blanco,
    Negro,
    Gris,
    Azul,
    Verde
}


/*
* Clase Taza que tiene un color, cantidad de café y capacidad de café que cabe en esta.
* @param Color:String por defecto de color Blanco
* @param Capacidad:Int capacidad de café que "entra" en la taza por defecto 50 c.c
* @param Cantidad:Int cantidad de café que se puede echar en la taza por defecto 0 c.c
*
* */
class Tazas(val color:COLOR = COLOR.Blanco) {
    var capacidad:Int = 50
    var cantidad:Int = 0



    /*
    * Inicialiamos la cantidad al igual que la capacidad si la cantidad es mayor que la capacidad
    */
    init {
        if (cantidad > capacidad){
            cantidad = capacidad
        }
    }


    /*
    * LLena la taza hasta su capacidad máxima
    */
    fun llenar(){
        cantidad = capacidad
    }


    /*
    * Llena la taza hasta el valor indicado por parámetros
    * @param valor:Int, Indica el nivel de cantidad que quiere que tenga de café
    */
    fun llenar(valor:Int){
        cantidad = valor
    }


    /*
    * Funcion toString sobreescrita para que retorne un mensaje editado
    *
    * @return Cadena de caracteres de la información de la taza
    */
    override fun toString(): String {
        return "Taza de color= $color, capacidad= $capacidad cc, y cantidad $cantidad cc"
    }
}