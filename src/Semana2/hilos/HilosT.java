package Semana2.hilos;

public class HilosT  extends Thread{

    @Override //redefiniendo el comportamiento de mi hilo estado Runeable
    public void run() { //estableciendo la accion que queremos que realice el hilo

        System.out.println("El hilo se esta ejecutando");
    }

    /*/public void start(){
        //Iniciar la ejecucucion de un hilo
        // La JVM llama al metodo run del hilo
    }
    /*/

    //Metodo sleep: detiene de forma temporal el metodo especificado

    //Metodo join: espera a que el hilo se muera

    //Metodo etPriority: Nos regresa la prioridad del hilo
    //Metodo setPriority: Establece la proridad del hilo
    //Metodo getName: Nos da el nombre del hilo
    //couurenThread: Referenia al hilo que se está ejecutando
    //getId: Regresa el id del hilo
    //Thread.State getState: Regeesa el estado del hilo actual
    //isAlive: Muestra si el hilo aun esta vivo

    public static void main(String[] args) {

        HilosT hilo = new HilosT(); //Entra al state new
        hilo.start();//Inicializando el hilo(manda a llamar al metodo run)

    }
}

class HilosR implements Runnable{

    public void run(){
        System.out.println("El hilo de Runeable esta:"+ "corriendo");

    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread();
        t.start();
    }
}


/*Al igual que todos los metodos dentro de run se definen los comportamientos de lo que quiero que haga mi metodo
* y como se explico cada hilo puede estar dividido en diversas tareas y ejecutandose de manera simuktanea*/
