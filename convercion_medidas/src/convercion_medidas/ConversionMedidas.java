package convercion_medidas;
import java.util.Scanner;

public class ConversionMedidas {

    public static final double METROS_A_PIES = 3.28084;
    public static final double METROS_A_PULGADAS = 39.3701;
    public static final double METROS_A_CENTIMETROS = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de metros: ");
        
        double metros = scanner.nextDouble();
        double pies = metros * METROS_A_PIES;
        double pulgadas = metros * METROS_A_PULGADAS;
        double centimetros = metros * METROS_A_CENTIMETROS;

        System.out.println(metros + " metros es equivalente a:");
        System.out.println(pies + " pies");
        System.out.println(pulgadas + " pulgadas");
        System.out.println(centimetros + " centímetros");

        scanner.close();
    }
}
