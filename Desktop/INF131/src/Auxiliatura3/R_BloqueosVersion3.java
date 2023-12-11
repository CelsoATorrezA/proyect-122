package Auxiliatura3;
import java.util.*;
import java.util.Scanner;

public class R_BloqueosVersion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();

            if (N == 0) {
                break;
            }

            int Xo = scanner.nextInt();
            int Yo = scanner.nextInt();
            int Xf = scanner.nextInt();
            int Yf = scanner.nextInt();

            char[][] bloqueos = new char[N][N];

            for (int i = 0; i < N; i++) {
                String fila = scanner.next();
                bloqueos[i] = fila.toCharArray();
            }

            boolean[][] visitado = new boolean[N][N];

            boolean hayRuta = dfs(bloqueos, visitado, Xo, Yo, Xf, Yf);

            if (hayRuta) {
                System.out.println("HAY RUTA POSIBLE");

                // Verificar si será bloqueado al llegar
                if (bloqueos[Xf][Yf] == 'B') {
                    System.out.println("HAY RUTA POSIBLE PERO SERA BLOQUEADO");
                }
            } else {
                System.out.println("NO HAY RUTA POSIBLE");
            }
        }
    }

    static boolean dfs(char[][] bloqueos, boolean[][] visitado, int x, int y, int Xf, int Yf) {
        int N = bloqueos.length;

        if (x < 0 || x >= N || y < 0 || y >= N || visitado[x][y] || bloqueos[x][y] == 'B') {
            return false;
        }

        visitado[x][y] = true;

        if (x == Xf && y == Yf) {
            return true;
        }

        if (dfs(bloqueos, visitado, x - 1, y, Xf, Yf) ||
            dfs(bloqueos, visitado, x + 1, y, Xf, Yf) ||
            dfs(bloqueos, visitado, x, y - 1, Xf, Yf) ||
            dfs(bloqueos, visitado, x, y + 1, Xf, Yf)) {
            return true;
        }

        return false;
    }
}
