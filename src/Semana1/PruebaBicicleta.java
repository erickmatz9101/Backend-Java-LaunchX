package Semana1;

public class PruebaBicicleta {
    public static void main(String[] args) {
        def();

    }

    public static void def(){
        Bicicleta biciMontana = new Bicicleta();
        biciMontana.setColor("Negra");
        biciMontana.setPins(6);
        biciMontana.setRodada(26);
        biciMontana.setvelocidad(13.2);
        String msg= "Soy una bici de Montaña  con estas caracteristicas: ";
        msg+="\nColor: "+biciMontana.getColor();
        msg+="\nVelocidad: "+biciMontana.getVelocidad();
        msg+="\nPines: "+biciMontana.getPins();
        msg+="Rodada: "+biciMontana.getRodada();
        System.out.println(msg);
    }


}

/*Por medio del metodo show se mandara a llamar dentro del main para poder aaceder a el y la informacion que s ele vaya agregando, recuerda
* tenemos que ser especificos y lo mas pulcros posibles a la hora de programar para poder mandar a llamar solo mis metodos dentro del main*/
