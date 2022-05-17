package Semana2.hilos;

public class TestJoin extends  Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 5; i++) {
            try{
                Thread.sleep(500);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println(i);

        }

    }

    public static void main(String[] args) {

        TestJoin t1 = new TestJoin();
        TestJoin t2 = new TestJoin();
        TestJoin t3 = new TestJoin();

        showDetails(t1,t2,t3);

        t1.start();

        try{
            t1.join(1500);
            t1.setName("LaunchX");
            t1.setPriority(MAX_PRIORITY);
        }catch (InterruptedException ie){
            ie.printStackTrace(); //Nos da la ruta en donde fallo el programa
        }

        t2.start();

        t3.start();

    }

    public static void showDetails(TestJoin t1, TestJoin t2, TestJoin t3){
        System.out.println("Hilo1; "+ t1.getName()+
                "id"+t1.getId()+ "estado: "+t1.getState()+
                "proridad"+t1.getPriority());

        System.out.println("Hilo2; "+ t2.getName()+
                "id"+t2.getId()+ "estado: "+t2.getState()+
                "proridad"+t2.getPriority());

        System.out.println("Hilo3; "+ t3.getName()+
                "id"+t3.getId()+ "estado: "+t3.getState()+
                "proridad"+t3.getPriority());

    }

}

/*La unica diferencia de esta clase al implemetar el ciclo for es que el contador solo va del 1 al 5 y en este caso el printo lo estoy colocando
* al finalizar el ciclo for y no dentro del try como en las ocasiones anteriores esto es porque hasta que termine de hacer la ejecucucion del ciclo
* mostrara el resultado   */

/*showDetails muestra los detalles de cada hilo y que se encuentran en el estado new
* entra al estadi sttar (run)
* El hilo 1 su secuencia aparece cada 1500 milisegundos esa es la funcion de join que cada cierto tiempo le recuerde que tiene que entrar
* para continuar con la secuencia de los numeros cada cierto tirmpo*/