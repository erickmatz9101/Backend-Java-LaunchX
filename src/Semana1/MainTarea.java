package Semana1;

public class MainTarea {
    public static void main(String[] args) {

        def();

    }

    public static void def(){
        TareaObjetos carrito = new TareaObjetos();

        carrito.setPulgadasRines(19);
        carrito.setCilindros(4);
        carrito.setModelo("Mustang");
        carrito.setColor("Azul Marino");
        carrito.setVelocidad(30);
        String msg= "Soy un carrito que te salio en el huevo kinder con estas caracteristicas:";
        msg+="\nLos rines son de este tamano: : "+ carrito.getPulgadasRines();
        msg+="\nTengo un cilindraje de: "+ carrito.getCilindros();
        msg+="\nEl modelo es: "+ carrito.getModelo();
        msg+="\nSu color es: "+carrito.getColor();
        msg+="\nLa velocidad a la que puede andar es de: "+carrito.getVelocidad();

        System.out.println(msg);


    }
}

