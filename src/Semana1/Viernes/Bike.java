package Semana1.Viernes;

/*
Overload: Sobrecarga
Override: Redefine
Overwrite: Sobreescribimos
* */

public class Bike {
    private int velocidad;
    private String color, marca;

    /*Haciendo referencia al contructor por omision*/

    public Bike(){

    }

    public Bike (String color){this.color=color;}

    public Bike (String color, int velocidad){
        this.velocidad= velocidad;
        this.color=color;
    }

    public Bike (String color, int velocidad, String marca){
        this.velocidad= velocidad;
        this.color=color;
        this.marca=marca;
    }

    /*Generando los getters*/

    public int getVelocidad(){return velocidad;}
    public  String getColor(){return color;}
    public String getMarca(){return marca;}

}

/*En este caso se ven varios ejemplos de como podemos crear a los constructores, es decir que puedo no usas ninguno de sus atributos,
* solo 1, usar 2, o inclusive usar los 3, en caso de no tener generado un cosntructor toma el que ya tenemos por defecto porque viene de la
* clase Object y el IDE nos ayudará a identidficar cual es el que estamos ocupando segun lo que yo vaya pasando como parametro, siempre
* y cuando lo tenga definido.*/
