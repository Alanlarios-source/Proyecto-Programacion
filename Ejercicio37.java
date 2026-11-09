import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio de costo: ");
        double costo = scanner.nextDouble();
        System.out.print("Ingrese el precio de venta al publico: ");
        double venta = scanner.nextDouble();
        
        boolean margenValido = (((venta - costo) / costo) >= 0.30);
        
        System.out.println("¿El margen de ganancia es mayor o igual al 30%?: " + margenValido);
        scanner.close();
    }
}