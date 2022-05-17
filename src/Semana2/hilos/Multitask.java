package Semana2.hilos;

public class Multitask  extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Tarea Uno");
    }

    public static void main(String[] args) {
        Multitask t1 = new Multitask();
        Multitask t2 = new Multitask();
        Multitask t3 = new Multitask();

        t1.start();
        t2.start();
        t3.start();

    }
}

class Multitasking implements Runnable{
    @Override
    public void run() {
        System.out.println("Tarea Uno");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Multitasking());
        Thread t2 = new Thread(new Multitasking());

        
    }
}

class EachT extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Tarea A runneable");
    }
}

class Task2 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Tarea B runneable");
    }
}