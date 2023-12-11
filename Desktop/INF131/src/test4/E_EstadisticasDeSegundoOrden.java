package test4;
//ACEPTADO
import java.util.Arrays;
import java.util.Scanner;

public class E_EstadisticasDeSegundoOrden {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int nrocasos = lee.nextInt();

        for (int i = 0; i < nrocasos; i++) {
            int n = lee.nextInt();
            int v[] = new int[n];
            for (int j = 0; j < n; j++) {
                v[j] = lee.nextInt(); 
            }
            Arrays.sort(v);
            int resultado = encontrarMayor(v);
            if (resultado != -100) {
                System.out.println(resultado);
            } else {
                System.out.println("NO");
            }
        }
    }
    private static int encontrarMayor(int[] vector) {
        int valorInicial = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > valorInicial) {
                return vector[i];
            }
        }

        return -100; // Retorna -100 si no se encuentra ningún valor mayor
    }
}


