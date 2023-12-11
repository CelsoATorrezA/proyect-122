package Auxiliatura1;
public class ejer4 {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;

        int[][] matriz = generarMatrizZigZag(filas, columnas);

        // Imprimir la matriz en el formato especificado
        for (int i = 0; i < filas; i++) {
            System.out.print("fila " + (i + 1) + " (");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
                if (j < columnas - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(")");
        }
    }

    public static int[][] generarMatrizZigZag(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        int valor = 1;

        for (int i = 0; i < filas; i++) {
            if (i % 2 == 0) {
                // Llenar en sentido ascendente en las filas pares
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = valor++;
                }
            } else {
                // Llenar en sentido descendente en las filas impares
                for (int j = columnas - 1; j >= 0; j--) {
                    matriz[i][j] = valor++;
                }
            }
        }

        return matriz;
    }
}
