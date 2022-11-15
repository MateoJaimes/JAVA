import java.util.Scanner;
public class EJERCICIO_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombreMin, nombre2, apellido1, apellido2, array[];
        String nombre1;
        System.out.println("INGRESE SU NOMBRE");
        String val = input.nextLine();

        nombreMin = nombreMin(val);

        array = cadenaArray(nombreMin);

        array[1] = nombre1;

        System.out.println("El tamaño del array es de: "+ nombre1);

        for(String world : array){
            System.out.println(world);
        }
    }
    static String nombreMin(String val){
        return val.toUpperCase();
    }


    static String[] cadenaArray(String nombreMin) {
        return nombreMin.split(" ");
    }
}
