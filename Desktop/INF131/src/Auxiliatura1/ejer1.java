package Auxiliatura1;

import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        while (lee.hasNextInt()) {
            int n = lee.nextInt();
            int v[] = new int[n];

            for (int i = 0; i < v.length; i++) {
                v[i] = lee.nextInt();
            }

            int ultNum = v[n - 1];
            int c = contarIgualesAlUltimo(v, ultNum);
            System.out.println(c);
        }
        lee.close();
    }
    private static int contarIgualesAlUltimo(int[] secuencia, int ultimoNumero) {
        int contador = 0;
        for (int i = 0; i < secuencia.length; i++) {
            if (secuencia[i] == ultimoNumero) {
                contador++;
            }
        }
        return contador;
    }
}
