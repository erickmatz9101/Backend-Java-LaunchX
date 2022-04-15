package Semana2;

abstract class Mountain{
    Mountain(){ //Constructor
        System.out.println("Se a creado una bicicleta de Montana");
    }

    abstract void cambiarVelocidad();
    void cambiarColor(){
        System.out.println("Cambiando Color a Rojo");
    }
}

class Magistroni extends Mountain{

    @Override
    void cambiarVelocidad() {
        System.out.println("Se deben desbloquear las perillas del manubrio primero");
    }
}

public class Bicicleta {
    void cambiarVelocidad(){ //Redefiniendo el metodo cambiarVelocidad
        System.out.println("Gira la perilla");
    }

    public static void main(String[] args) {
        Mountain bici1 = new Magistroni();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();
    }
}
