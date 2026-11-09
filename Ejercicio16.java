import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la estatura en metros: ");
        double estatura = scanner.nextDouble();
        
        boolean tieneSobrepeso = ((peso / (estatura * estatura)) >= 25.0);
        
        System.out.println("¿Tiene sobrepeso (IMC >= 25.0)?: " + tieneSobrepeso);
        scanner.close();
    }
}