package Auxiliatura3;

import java.util.Scanner;

public class K_DispositivosPortatiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();

        int[][] dispositivos = new int[S][S];

        while (true) {
            int tipo = scanner.nextInt();

            if (tipo == 1) {
                int X = scanner.nextInt();
                int Y = scanner.nextInt();
                int A = scanner.nextInt();
                dispositivos[X][Y] += A;
            } else if (tipo == 2) {
                int L = scanner.nextInt();
                int B = scanner.nextInt();
                int R = scanner.nextInt();
                int T = scanner.nextInt();

                int total = calcularTotal(dispositivos, L, B, R, T);
                System.out.println(total);
            } else if (tipo == 3) {
                break;
            }
        }
    }

    public static int calcularTotal(int[][] dispositivos, int L, int B, int R, int T) {
        int total = 0;

        for (int i = L; i <= R; i++) {
            for (int j = B; j <= T; j++) {
                total += dispositivos[i][j];
            }
        }

        return total;
    }
}