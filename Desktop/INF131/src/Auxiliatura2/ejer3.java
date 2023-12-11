package Auxiliatura2;

import java.util.Arrays;
import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] secuencia = new int[n];
            for (int j = 0; j < n; j++) {
                secuencia[j] = scanner.nextInt();
            }
            Arrays.sort(secuencia);
            int estadisticaSegundoOrden = encontrarEstadisticaSegundoOrden(secuencia);

            if (estadisticaSegundoOrden != -1) {
                System.out.println(estadisticaSegundoOrden);
            } else {
                System.out.println("NO");
            }
        }
    }
    private static int encontrarEstadisticaSegundoOrden(int[] secuencia) {
        for (int i = 1; i < secuencia.length; i++) {
            if (secuencia[i] > secuencia[i - 1]) {
                return secuencia[i];
            }
        }
        return -1;
    }
}