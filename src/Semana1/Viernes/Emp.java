package Semana1.Viernes;

class Persona{
    int id;
    String nombre;

    /*Constructor*/
    Persona(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
}

public class Emp extends Persona {
    double salario;
    Emp(int id, String nombre, double salario){ //Constructor de Emp
        super(id, nombre);
        this.salario=salario;
    }

    void display(){
        System.out.println(id+" "+nombre+""+salario);
    }
}

class TestPersonaEmpleado{
    public static void main(String[] args) {
        Emp e = new Emp(1,"David",4550.32);
        e.display();
    }
}

/*La palabra EXTENDS es la que me indica de quine estamos heredando, en este caso le indico que mi clase Emp(empleado) herede los atributos
* de la clase persona y para ello no debo olvidar que lo hago por medio de la palabra SUPER a la cual le paso como parametro los atributos
* que deseo heredar. Pero tambien puedo inicializar los atributos que son propios de esa clase (salario)*/

/*Este codigo ejemplo es lo que se le conoce como un monolito, debido a que todas las clases incluyendo el main se encuenran en un solo lugar (archivo), es funcional
* hasta cierto punto para un codigo basico pero no escalable*/

