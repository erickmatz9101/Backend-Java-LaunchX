package Semana1.Viernes;

public class MountainBike {
    public static void main(String[] args) {

        show();
        }

    public static void show(){
        Bike bike1 = new Bike("Azul", 23);
        System.out.println(bike1.getColor());
        System.out.println(bike1.getVelocidad());
    }

    public static void show1(){
        Bike bike2 = new Bike("Rojo", 23, "Benoto");
        System.out.println(bike2.getColor());
        System.out.println(bike2.getVelocidad());
        System.out.println(bike2.getMarca());
    }

}
