import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio_9 {
        public static PrintStream screen = System.out;
        public static Scanner keyboard = new Scanner(System.in);

        public static void main(String[] args){
            int distancia;
            int tiempo;
            int velocidad;
            screen.println("ingrese una distancia entre dos puntos ");
            distancia= keyboard.nextInt();
            screen.println("ingrese un tiempo para llegar de un punto a otro: ");
            tiempo= keyboard.nextInt();
            velocidad= distancia/tiempo;
            screen.println("la velocidad necesaria para llegar de un punto a otro es: "+velocidad+"m/s");
        }
}
