package Auxiliatura3;

import java.util.ArrayList;
import java.util.Scanner;
public class  I_JugandoGrafos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrizAdyacencia = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizAdyacencia[i][j] = scanner.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> listaAdyacencia = matrizAdyacenciaToListaAdyacencia(matrizAdyacencia);
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            for (int j = 0; j < listaAdyacencia.get(i).size(); j++) {
                System.out.print(listaAdyacencia.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    private static ArrayList<ArrayList<Integer>> matrizAdyacenciaToListaAdyacencia(int[][] matrizAdyacencia) {
        ArrayList<ArrayList<Integer>> listaAdyacencia = new ArrayList<>();
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            listaAdyacencia.add(new ArrayList<>());
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == 1) {
                    listaAdyacencia.get(i).add(j + 1);
                }
            }
        }
        return listaAdyacencia;
    }
}