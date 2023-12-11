package Auxiliatura3;

import java.util.ArrayList;
import java.util.Scanner;
public class J_GrafoNODirigido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int C = scanner.nextInt();
        ArrayList<ArrayList<Integer>> grafo = new ArrayList<>();
        for (int i = 0; i <= M; i++) {
            grafo.add(new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            int nodoA = scanner.nextInt();
            int nodoB = scanner.nextInt();
            grafo.get(nodoA).add(nodoB);
            grafo.get(nodoB).add(nodoA);
        }
        for (int i = 0; i < C; i++) {
            int nodoPartida = scanner.nextInt();
            int nodoLlegada = scanner.nextInt();
            if (hayRuta(grafo, nodoPartida, nodoLlegada)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
    private static boolean hayRuta(ArrayList<ArrayList<Integer>> grafo, int inicio, int fin) {
        boolean[] visitado = new boolean[grafo.size()];
        return dfs(grafo, inicio, fin, visitado);
    }
    private static boolean dfs(ArrayList<ArrayList<Integer>> grafo, int actual, int objetivo, boolean[] visitado) {
        if (actual == objetivo) {
            return true;
        }
        visitado[actual] = true;
        for (int vecino : grafo.get(actual)) {
            if (!visitado[vecino]) {
                if (dfs(grafo, vecino, objetivo, visitado)) {
                    return true;
                }
            }
        }
        return false;
    }
}