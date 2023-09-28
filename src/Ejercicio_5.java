import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio_5 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        double cantidaddinero = 0;
        double dolar = 0;
        double euro = 0;

        screen.println("ingrese la cantidad de dinero");
        cantidaddinero= keyboard.nextDouble();
        screen.println("ingrese valor del dolar");
        dolar = keyboard.nextDouble();
        screen.println("ingrese la cantidad de dinero");
        euro = keyboard.nextDouble();
        euro = cantidaddinero/euro;
        dolar = cantidaddinero/dolar;
        screen.println("el valor del dinero en euro es:" +euro+ "el valor del dinero en dolares es" + dolar);

    }
}
