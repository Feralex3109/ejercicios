package conversion_moneda;
import java.util.Scanner;

public class ConversionMoneda {

    public static double conversionALas8AM(double P) {
        return P;  
    }

        public static double conversionAlMediodia(double P) {
        return P * 0.9; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de dinero en moneda local: ");
        double cantidad = scanner.nextDouble();
        double cantidadALas8AM = conversionALas8AM(cantidad);
        
        System.out.println("Cantidad de dinero a las 8:00 a.m.: " + cantidadALas8AM);
        double cantidadAlMediodia = conversionAlMediodia(cantidad);
        
        System.out.println("Cantidad de dinero al mediodía: " + cantidadAlMediodia);
        scanner.close();
    }
}
