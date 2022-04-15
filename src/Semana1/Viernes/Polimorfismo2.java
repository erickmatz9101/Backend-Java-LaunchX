package Semana1.Viernes;

class Animal2{
    void eat(){

        System.out.println("Comiendo....");

    }
}

class Dog extends Animal2{
    void eat(){
        System.out.println("Comiendo croquetas");

    }
}

class Cachorro extends Animal2{  //Creando animal

    void eat(){
        System.out.println("Tomando agua"); //tomando agua
    }

}



public class Polimorfismo2 {
    public static void main(String[] args) {
        Animal2 dander;
        dander =new Animal2();
        dander.eat();
        dander= new Dog();
        dander.eat();
        dander = new Cachorro();
        dander.eat();


    }

}


/*Cuando creamos los objetos en este caso va cambiando el comportamiento conforme le estoy diciendo de quien esta heredando, por ejemplo cuando se crea cachorro hereda de la clase
* Animal (creando un animal) pero cuendo llamo a la funcion comer(eat) que es de la clase Poliformismo 2 a salida sera toma agua
*
* Creando animal
* Toma agua*/
