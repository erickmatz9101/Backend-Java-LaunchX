package Semana1;

public class Bicicleta {
    //Generando las variables (caracteristicas) o propiedades de objeto
    public int pins, rodada;
    public double velocidad;
    public String color;

    //generando los metodos get

    public double getVelocidad (){return velocidad; }
    public int getPins(){return pins; }
    public int getRodada(){return rodada; }
    public String getColor(){return color;}

    //generando los metodos set y validadando los datos de entrada

    public boolean setPins( int pins){
        if (pins > 0){
            this.pins=pins;
            return true;
        }else
           return false;
    }

    public boolean setRodada(int rodada){
        if (rodada >0){
            this.rodada=rodada;
            return true;
        }else
            return false;
    }

    public boolean setColor(String color){
        if (!color.isEmpty()){ //si color (!) no esta vacio
            this.color=color;
            return true;
        }else
            return false;
    }

    public boolean setvelocidad(double velocidad){
        if (velocidad >=0){
            this.velocidad=velocidad;
            return true;
        }else
            return  false;
    }

    public String printState(){
        return "pins: "+pins+"\n"+
                "rodada: "+ rodada+"\n"+
                "color: "+color+"\n"+
                "velocidad: "+velocidad+"\n";
    }
}


/*La finalidad de poder colocar los métodos get y set de esta manera es por una buena estructura del codigo.
* En caso de los GET lo que se puede observar es que se muestra una estructura mas limpia del codigo al estar declarado en una sola linea
* Por otra parte con los metodos SET (los que nos permiten modificar los datos) estamos tomando en cuenta que es un dato de entrada que el usuario
* hara por lo cual al mismo tiempo se esta validando que el dato de entrada (por el usuario) sea del tipo que se le solicita por ejemoplo
* la rodada que es de tipo INT el usuario tendra que ingresar un entero, y esto ya lo estamos validando dentro del metodo.*/

/*La clase print State me sirve para validar unicamente que los atributos y los metodos get y set funcionen de manera adecuada*/