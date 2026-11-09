import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un entero n: ");
        int n = scanner.nextInt();
        
        boolean perteneceAlMenosUnRango = (((n >= 1) && (n <= 10)) || ((n >= 50) && (n <= 60)));
        
        System.out.println("¿Esta entre 1 y 10 o entre 50 y 60?: " + perteneceAlMenosUnRango);
        scanner.close();
    }
}