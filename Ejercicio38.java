import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese aportacion del Socio A: ");
        double socioA = scanner.nextDouble();
        System.out.print("Ingrese aportacion del Socio B: ");
        double socioB = scanner.nextDouble();
        System.out.print("Ingrese la ganancia total: ");
        double gananciaTotal = scanner.nextDouble();
        
        double gananciaSocioA = gananciaTotal * (socioA / (socioA + socioB));
        
        System.out.println("La ganancia correspondiente al Socio A es: $" + gananciaSocioA);
        scanner.close();
    }
}