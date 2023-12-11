package Auxiliatura3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class L_SavandoElPaisDelWano {

    static class Habitante {
        int id;
        long costo;

        public Habitante(int id, long costo) {
            this.id = id;
            this.costo = costo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<ArrayList<Integer>> grafo = new ArrayList<>();
        ArrayList<Habitante> habitantes = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            grafo.add(new ArrayList<>());
        }

        for (int i = 1; i <= n; i++) {
            long costo = scanner.nextLong();
            habitantes.add(new Habitante(i, costo));
        }

        for (int i = 0; i < m; i++) {
            int xi = scanner.nextInt();
            int yi = scanner.nextInt();

            grafo.get(xi).add(yi);
            grafo.get(yi).add(xi);
        }

        long resultado = calcularCostoMinimo(grafo, habitantes);
        System.out.println(resultado);
    }

    private static long calcularCostoMinimo(ArrayList<ArrayList<Integer>> grafo, ArrayList<Habitante> habitantes) {
        boolean[] visitado = new boolean[habitantes.size() + 1];
        long costoTotal = 0;

        for (int i = 1; i < visitado.length; i++) {
            if (!visitado[i]) {
                long costoComponente = bfs(grafo, habitantes, visitado, i);
                costoTotal += costoComponente;
            }
        }

        return costoTotal;
    }

    private static long bfs(ArrayList<ArrayList<Integer>> grafo, ArrayList<Habitante> habitantes,
                            boolean[] visitado, int inicio) {
        long costoMinimo = habitantes.get(inicio - 1).costo;
        Queue<Integer> cola = new LinkedList<>();
        cola.add(inicio);
        visitado[inicio] = true;

        while (!cola.isEmpty()) {
            int actual = cola.poll();

            for (int vecino : grafo.get(actual)) {
                if (!visitado[vecino]) {
                    cola.add(vecino);
                    visitado[vecino] = true;
                    costoMinimo = Math.min(costoMinimo, habitantes.get(vecino - 1).costo);
                }
            }
        }

        return costoMinimo;
    }
}

