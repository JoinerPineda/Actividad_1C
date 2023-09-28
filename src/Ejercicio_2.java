import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio_2 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        long celular = 0;
        long prefijo = 0;

        screen.println("ingrese un numero celular");
        celular=keyboard.nextLong();
        prefijo = celular/10000000;
        screen.println("El prefijo del numero celular es " + prefijo);
    }
}

