import java.io.PrintStream;
import java.util.Scanner;

public class Ejercicio_3 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        float horas;
        float valhora;
        float retencion;
        float salbruto;
        float salneto;
        float retfuente;

        screen.println("ingrese las horas trabajadas");
        horas = keyboard.nextFloat();
        screen.println("ingrese el valor por hora de trabajo");
        valhora = keyboard.nextFloat();
        screen.println("ingrese el porcentaje de retencion");
        retencion = keyboard.nextFloat();
        salbruto = horas*valhora;
        retfuente = salbruto*(retencion/100);
        salneto = salbruto - retfuente;
        screen.println("el salario bruto es: "+salbruto+"la retencion en la fuente es: "+retfuente+"el salario neto es: "+salneto);
    }

}
