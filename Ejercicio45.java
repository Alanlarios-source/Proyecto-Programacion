import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un entero de tres cifras: ");
        int numero = scanner.nextInt();
        
        int centenas = numero / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;
        int sumaDigitos = centenas + decenas + unidades;
        
        System.out.println("La suma de los tres digitos es: " + sumaDigitos);
        scanner.close();
    }
}