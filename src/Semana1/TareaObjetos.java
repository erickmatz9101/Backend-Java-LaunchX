package Semana1;

public class TareaObjetos {
    public int pulgadasRines, cilindros;
    public String modelo, color;
    public double velocidad;


    //Generando los meétodos get de las variables

    public int getPulgadasRines(){return pulgadasRines;}
    public int getCilindros(){return cilindros;}
    public String getModelo(){return modelo;}
    public String getColor(){return color;}
    public double getVelocidad(){return velocidad;}


    //Generando los metodos set para validar los datos de entrada

    public boolean setPulgadasRines( int pulgadasRines){
        if (pulgadasRines > 0){
            this.pulgadasRines=pulgadasRines;
            return true;
        }else
            return false;
    }

    public boolean setCilindros(int cilindros){
        if (cilindros >0){
            this.cilindros=cilindros;
            return true;
        }else
            return false;
    }

    public boolean setModelo(String modelo){
        if (!modelo.isEmpty()){
            this.modelo=modelo;
            return true;
        }else
            return false;
    }

    public boolean setColor (String color){
        if (!color.isEmpty()){
            this.color=color;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if (velocidad>=0){
            this.velocidad=velocidad;
            return true;
        }else
            return false;
    }

    public String printState(){
        return "pulgadaRines: "+pulgadasRines+"\n"+
                "cilindros: "+ cilindros+"\n"+
                "modelo: "+modelo+"\n"+
                "color: "+color+"\n"+
                "velocidad:"+velocidad+"\n";
    }




}
