package day_04;

public class RicercaArray {
    
    public static int cercaElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] numeri = {10, 25, 3, 47, 15, 8, 33};
        
        int elementoDaCercare = 47;
        
        int posizione = cercaElemento(numeri, elementoDaCercare);
        
        if (posizione != -1) {
            System.out.println("Elemento " + elementoDaCercare + " trovato alla posizione: " + posizione);
        } else {
            System.out.println("Elemento " + elementoDaCercare + " non trovato nell'array");
        }
        
        int elementoInesistente = 20;
        int posizione2 = cercaElemento(numeri, elementoInesistente);
        
        if (posizione2 != -1) {
            System.out.println("Elemento " + elementoInesistente + " trovato alla posizione: " + posizione2);
        } else {
            System.out.println("Elemento " + elementoInesistente + " non trovato nell'array");
        }
        
        System.out.print("Array completo: ");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i]);
            if (i < numeri.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}