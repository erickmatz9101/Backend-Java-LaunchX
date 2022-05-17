package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {

        try{
            FileOutputStream fos = new
                    FileOutputStream("C:\\hola.txt"); //escribiendo archivo de texto en el disco local txt
            fos.write(65); //pasando codigo ASSCII es una letra A
            fos.close();//cerrando el ciclo


        }catch (IOException ioe){

            ioe.printStackTrace();

        }
    }
}
