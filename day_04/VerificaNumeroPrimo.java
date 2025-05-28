package day_04;

import java.util.Scanner;

public class VerificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci un numero intero positivo: ");
        int numero = scanner.nextInt();
        
        if (isPrimo(numero)) {
            System.out.println(numero + " è un numero primo.");
        } else {
            System.out.println(numero + " non è un numero primo.");
        }
        
        scanner.close();
    }
    
    public static boolean isPrimo(int n) {
  
        if (n < 2) {
            return false;
        }
        
        if (n == 2) {
            return true;
        }
        
        if (n % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; 
            }
        }
        
        return true;
    }
}