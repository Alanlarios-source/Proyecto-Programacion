import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sueldo mensual: ");
        double sueldo = scanner.nextDouble();
        System.out.print("Ingrese los años de antiguedad laboral: ");
        int antiguedad = scanner.nextInt();
        System.out.print("Ingrese las deudas actuales: ");
        double deudas = scanner.nextDouble();
        
        boolean seAprueba = (((sueldo > 15000.0) && (antiguedad > 3)) && (deudas < 5000.0));
        
        System.out.println("¿Se aprueba el prestamo hipotecario?: " + seAprueba);
        scanner.close();
    }
}