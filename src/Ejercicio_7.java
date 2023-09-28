import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio_7 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){

        double largo_acuario;
        double ancho_acuario;
        double alto_acuario;
        double dimension;
        double litros;
        double dimenal90;
        screen.println("ingrese el largo de su acuario: ");
        largo_acuario=keyboard.nextDouble();
        screen.println("ingrese el ancho de su acuario: ");
        ancho_acuario=keyboard.nextDouble();
        screen.println("ingrese el alto de su acuario: ");
        alto_acuario=keyboard.nextDouble();
        dimension=largo_acuario*ancho_acuario*alto_acuario;
        litros= dimension/1000;
        dimenal90=(litros*90)/100;
        screen.println("los litros necesarios para llenar el acuario son: "+dimenal90+ "litros");
    }
}
