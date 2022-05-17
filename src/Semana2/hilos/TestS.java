package Semana2.hilos;

public class TestS extends Thread
{
    @Override
    public void run() {
        for (int i=1; i<=10; i++){

            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        TestS h1 = new TestS();
        h1.start();

        HilosS h2 = new HilosS(); //define el comportamiento
        Thread hr2 = new Thread(h2); // se convierte en un hilo de tipo h2
        hr2.start();

    }

    static class HilosS implements Runnable{
        @Override
        public void run() {

            for (int i=1; i<=10; i++){

                try {
                    Thread.sleep(500);
                    System.out.println(i);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }

        }
    }
}


/*Lo que hace e ciclo for es un contador del 1 al 10 en el cual se quiere que se lleve a cabo un conteo de 500 ms (medio segundo)
* el error que sale en el sleep es porque tengo que buscar la manera de hacer una excepcion la cual esta marcada por el el try catch.
*
* Para este caso dentro del try (intenta) hacer el sleep de 500 ms
* El catch se encarga de que si por alguna razon se interrumpe lo que le pido */

/*La funcion de HilosS en este caso asemeja un metronomo porque deja un espacio de 500 ms entre cada numero antes de que aparezca en consola,
* dicho de otra manera se puede manipular la salida (el tiempo) que tarde en aparecer cada uno de los numeros del ciclo for (conteo)*/


/*En la clase HilosS lo que se puede notar es que toma el mismo comportamiento que h2 lo cual hace refreencia a lo que se tratan los hilos como
* ya s ehabia visto que pueden ejecutar tareas simultaneas pero de manera independiente, en este caso cada uno de los ciclos es un hilo
* por ello al tener el mismo metodo (comportamiento) es que se imprime en consola 2 veces el mismo numero*/
