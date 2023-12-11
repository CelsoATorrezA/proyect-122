package Auxiliatura3;

import java.util.ArrayList;
import java.util.Scanner;

public class N_Transponer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nodos = scanner.nextInt();
        int arcos = scanner.nextInt();

        ArrayList<ArrayList<Integer>> grafoOriginal = new ArrayList<>();
        ArrayList<ArrayList<Integer>> grafoTranspuesto = new ArrayList<>();
        for (int i = 0; i <= nodos; i++) {
            grafoOriginal.add(new ArrayList<>());
            grafoTranspuesto.add(new ArrayList<>());
        }
        for (int i = 1; i <= nodos; i++) {
            int numArcos = scanner.nextInt();

            for (int j = 0; j < numArcos; j++) {
                int vecino = scanner.nextInt();
                grafoOriginal.get(i).add(vecino);
            }
        }
        for (int i = 1; i <= nodos; i++) {
            for (int vecino : grafoOriginal.get(i)) {
                grafoTranspuesto.get(vecino).add(i);
            }
        }
        System.out.println(nodos + " " + arcos);
        for (int i = 1; i <= nodos; i++) {
            System.out.print(grafoTranspuesto.get(i).size() + " ");
            for (int vecino : grafoTranspuesto.get(i)) {
                System.out.print(vecino + " ");
            }
            System.out.println();
        }
    }
}
