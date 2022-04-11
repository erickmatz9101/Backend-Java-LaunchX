package Semana1.Viernes;

public class Empleado {
    double salario=40000;

}

class Programadora extends Empleado{
    int bono=1000;

    public void main(){
        Programadora Fernanda = new Programadora();
        System.out.println("El salario de la programadora es: "+Fernanda.salario);
        System.out.println("El bono de la programadora es : "+Fernanda.bono);
    }

    void mensaje(){
        System.out.println("Soy programadora");
        main();
    }

}

class Web extends Programadora{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}
