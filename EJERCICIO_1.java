import java.util.*;

import javax.xml.soap.Text;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String array[];

        System.out.println("INGRESE UNA CADENA DE TEXTO");
        String val = input.nextLine();


        array = cadenaArray(val);
        System.out.println("El tamaño del array es de: "+ array.length);

        for(String world : array){
            System.out.println(world);
        }
    }

    static String[] cadenaArray(String val) {
        return val.split(" ");
    }
}

