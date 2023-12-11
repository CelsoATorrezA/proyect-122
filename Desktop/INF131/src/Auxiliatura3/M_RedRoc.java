package Auxiliatura3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class M_RedRoc {

    static class Estado {
        int posicion;
        int costo;

        public Estado(int posicion, int costo) {
            this.posicion = posicion;
            this.costo = costo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] posiciones = new int[n];

        for (int i = 0; i < n; i++) {
            posiciones[i] = scanner.nextInt();
        }

        int[] resultado = minimoOperaciones(posiciones);

        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    private static int[] minimoOperaciones(int[] posiciones) {
        int n = posiciones.length;
        int[] costos = new int[32768];
        Arrays.fill(costos, Integer.MAX_VALUE);

        Queue<Estado> cola = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            cola.add(new Estado(posiciones[i], 0));
        }

        while (!cola.isEmpty()) {
            Estado actual = cola.poll();

            if (costos[actual.posicion] <= actual.costo) {
                continue; // Ya hemos encontrado una solución mejor para esta posición
            }

            costos[actual.posicion] = actual.costo;

            int opcion1 = (actual.posicion + 1) % 32768;
            int opcion2 = (actual.posicion * 2) % 32768;

            cola.add(new Estado(opcion1, actual.costo + 1));
            cola.add(new Estado(opcion2, actual.costo + 1));
        }

        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = costos[posiciones[i]];
        }

        return resultado;
    }
}
