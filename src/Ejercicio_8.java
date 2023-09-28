import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio_8 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        double ancho_televisor;
        double alto_televisor;
        double pulgadas;
        screen.println("ingrese el ancho de su televisor: ");
        ancho_televisor= keyboard.nextDouble();
        screen.println("ingrese el alto de su televisor: ");
        alto_televisor= keyboard.nextDouble();
        pulgadas=Math.sqrt(Math.pow(ancho_televisor,2)+Math.pow(alto_televisor,2));
        screen.println("las pulgadas de su televisor son: "+pulgadas);
    }
}
