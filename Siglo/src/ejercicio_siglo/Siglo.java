package ejercicio_siglo;
public class Siglo {
    public static int siglo(int año) {        
        return (año % 100 == 0) ? (año / 100) : (año / 100) + 1;
    }

    public static int primerAño(int siglo) {
        return (siglo - 1) * 100 + 1;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();
        int elSiglo = siglo(año);
        int primerAñoDelSiglo = primerAño(elSiglo);

        System.out.println("El año " + año + " pertenece al siglo " + elSiglo);
        System.out.println("El primer año del siglo " + elSiglo + " es: " + primerAñoDelSiglo);
    }
}

