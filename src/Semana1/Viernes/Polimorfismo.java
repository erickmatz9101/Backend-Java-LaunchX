package Semana1.Viernes;

class Bike2{

    void run(){
        System.out.println("Runing....");
    }
}

public class Polimorfismo extends Bike2 {
    @Override //redefiniendo el metodo y esto es el polimorfismo
    void run() {
        System.out.println("Corriendo a 60 millas por hora");
    }

    public static void main(String[] args) {

        /*Creando objeto de la clase Bike2*/

        Bike2 bike2=new Polimorfismo();

        bike2.run();

    }
}

/*Cuando creamos el objeto de la clase Bike 2 en lugar de usar el constructor de la clase Bike 2 estamos utilizando
* el de Polimorfismo(a esto se le llama ligadura dinámica) dicho de otra manera crea al objeto con la clase Bike 2
* pero se construye utilizando lo que esta en la clase Polimorfismo*/

/*Dicho de otra manera se crea el objeto con la clase Bike2 pero hereda (extends) de la clase Polimorfismo*/
