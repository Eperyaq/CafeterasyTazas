
/*
* Clase Cafetera en la cual creas una cafetera
*@Param ubicacion:String - Ubicacion en la que se encuentra la cafetera
*/
class Cafetera(var ubicacion:String) {
    var cantidad:Int = 0
    var capacidadMaxima:Int = 1000


    /*
    * Constructor para crear una cafetera con la ubicación y la capacidad máxima
    * @Param ubicacion:String - Ubicación en la que se encuentra la cafetera.
    * @Param capacidadMaxima:Int - Capacidad en c.c de café que cabe en la cafetera*/
    constructor(ubicacion: String, capacidadMaxima:Int): this(ubicacion){
        this.ubicacion = ubicacion
        this.capacidadMaxima = capacidadMaxima

        cantidad = capacidadMaxima
    }

    /*
    * Constructor para crear una cafetera con todos los parámetros
    *
    * @Param ubicacion:String - Ubicacion en la que se encuentra la cafetera
    * @Param capacidadMaxima: Int - Capacidad de c.c de café que caben en la cafetera
    * @Param cantidad:int - Cantidad actual de café en la cafetera
    *
    */
    constructor(ubicacion: String, capacidadMaxima: Int, cantidad:Int): this(ubicacion){
        this.cantidad = cantidad
        this.capacidadMaxima = capacidadMaxima

        if (cantidad > capacidadMaxima){
            this.cantidad = capacidadMaxima
        }

    }

    /*
    * Se llena la cafetera hasta su capacidad máxima
    */
    fun llenar(){
        cantidad = capacidadMaxima
    }


    /*
    * Se llenan las tazas de café
    *
    * @param miTaza: Tazas- taza vacía para llenar de café
    */
    fun servirTaza(miTaza:Tazas){
        if (cantidad > miTaza.capacidad){ //si la cafetera tiene café se llena la taza y se resta para dejar el resto de café en la cafetera
            cantidad = miTaza.capacidad
            cantidad = miTaza.capacidad - cantidad
        }else if (cantidad < miTaza.capacidad){
            cantidad = miTaza.capacidad //se sirve lo que quede
            llenar()//llenamos la cafetera
            cantidad = miTaza.capacidad //terminamos de llenar
        }
    }



    /*
    * Se vacía la cafetera
    */
    fun vaciar(){
        cantidad = 0
    }




    /*
    * Agregas el valor que se le pase a la cafetera
    *
    * @Param variable:Int - cantidad de café a añadir
    */
    fun agregarCafe(variable:Int){

        cantidad = variable

        if (variable > cantidad){
            cantidad = capacidadMaxima
        }
    }
    /*
    * Funcion toString sobreescrita para que retorne un mensaje editado
    *
    * @Return Mensaje editado ajustado a las cafeteras
    */
    override fun toString(): String {
        return "Cafetera ubicada en $ubicacion, con capacdad $capacidadMaxima c.c y cantidad de $cantidad c.c"
    }

}