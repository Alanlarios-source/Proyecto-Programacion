import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de unidades compradas: ");
        int unidades = scanner.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();
        
        boolean aplicaDescuento = ((unidades > 50) && ((unidades * precioUnitario) > 5000.0));
        
        System.out.println("¿Aplica descuento por compra voluminosa?: " + aplicaDescuento);
        scanner.close();
    }
}