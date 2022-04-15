package Semana2;

abstract class Sombra{
    abstract void dibujarSombra();
}

class Arma extends Sombra{

    @Override
    void dibujarSombra() {
        System.out.println("Dibujando sombras en el arma color azul");
    }
}


public class Personaje extends Arma{
    public static void main(String[] args) {

        Sombra flecha = new Personaje();
        Sombra arco = new Arma();

        flecha.dibujarSombra();
        arco.dibujarSombra();
    }

    void dibujarSombra(){
        System.out.println("Dibuja una sombra Blanca");
    }
}



/*El las clases Abstractas solo estoy creando a mi metodo pero no estoy dedifiniendo sus comportamientos, eso lo hago en las otras clases donde
* lo voy a implementar.
* Por otra parte cuando declaramos la clase arma en mi ejemplo, y extendemos (heradamos) de sombra(clase padre) debo llamar al metodo que declare
* en la clase de la que estoy declarando y ahora si aqui si puedo decir como lo hace (el comportamiento que debe de tener) segun las necesidades.
* Dicho de otra manera estoy redefiniendo el comportamiento del metodo para poder utilizarlo segun las necesidades del programa*/
