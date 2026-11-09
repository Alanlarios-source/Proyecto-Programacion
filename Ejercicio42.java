import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero de 2 digitos (10-99): ");
        int numero = scanner.nextInt();
        
        int decenas = numero / 10;
        int unidades = numero % 10;
        boolean digitosIguales = (decenas == unidades);
        
        System.out.println("¿Los digitos son iguales?: " + digitosIguales);
        scanner.close();
    }
}