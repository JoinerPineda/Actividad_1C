import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio_6 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        int segundosTotales = 0;
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int residuo = 0;
        int segundos = 0;

        screen.println("ingrese la cantidad de segundos totales");
        segundosTotales=keyboard.nextInt();
        dias = segundosTotales/86400;
        residuo=segundosTotales%86400;
        horas = residuo/3600;
        residuo = residuo%3600;
        minutos = residuo/60;
        segundos = residuo%60;
        screen.println("valor de segundos totales es: "+ dias + " dias " + horas +" horas " +minutos+ " minutos " + segundos + " segundos ");
    }
}
