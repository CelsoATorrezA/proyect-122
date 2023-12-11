package Auxiliatura3;
import java.util.*;

public class Q_BloqueoVersion2 {

    static class Punto {
        int x, y, dist;

        public Punto(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static int rutaMasCorta(char[][] grid, int startX, int startY, int endX, int endY) {
        int n = grid.length;

        if (grid[startX][startY] == 'B' || grid[endX][endY] == 'B') {
            return -1; // No hay ruta posible si el origen o el destino están bloqueados
        }

        boolean[][] visitado = new boolean[n][n];

        // Movimientos posibles: arriba, abajo, izquierda, derecha
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<Punto> cola = new LinkedList<>();
        cola.add(new Punto(startX, startY, 0));
        visitado[startX][startY] = true;

        while (!cola.isEmpty()) {
            Punto actual = cola.poll();

            if (actual.x == endX && actual.y == endY) {
                return actual.dist; // Se encontró la ruta más corta
            }

            for (int i = 0; i < 4; i++) {
                int siguienteX = actual.x + dx[i];
                int siguienteY = actual.y + dy[i];

                if (siguienteX >= 0 && siguienteX < n && siguienteY >= 0 && siguienteY < n
                        && grid[siguienteX][siguienteY] != 'B' && !visitado[siguienteX][siguienteY]) {
                    visitado[siguienteX][siguienteY] = true;
                    cola.add(new Punto(siguienteX, siguienteY, actual.dist + 1));
                }
            }
        }

        return -1; // No se encontró una ruta posible
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;

            int Xo = scanner.nextInt();
            int Yo = scanner.nextInt();
            int Xf = scanner.nextInt();
            int Yf = scanner.nextInt();

            char[][] cuadricula = new char[N][N];
            for (int i = 0; i < N; i++) {
                String linea = scanner.next();
                for (int j = 0; j < N; j++) {
                    cuadricula[i][j] = linea.charAt(j);
                }
            }

            int distancia = rutaMasCorta(cuadricula, Xo, Yo, Xf, Yf);
            if (distancia != -1) {
                System.out.println("HAY RUTA POSIBLE CON DISTANCIA " + distancia);
            } else {
                System.out.println("NO HAY RUTA POSIBLE");
            }
        }
    }
}