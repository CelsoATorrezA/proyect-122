package Auxiliatura1;
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        while (lee.hasNextInt()) {
            int n = lee.nextInt();
            int v[] = new int[n];
            for (int i = 0; i < v.length; i++) {
                v[i] = lee.nextInt();
            }
            if (n % 2 == 0) {
                System.out.println(-1);
            } else {
                encontrarMedia(v, n);
            }
        }
        lee.close();
    }
    public static void encontrarMedia(int[] v, int n) {
        ordenacionRapida(v);
        int posMedia = v[(n -1)/ 2];
        int men = 0;
        int max = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < posMedia) {
                men++;
            } else if (v[i] > posMedia) {
                max++;
            }
        }
        if (max == men & (max + men)==n-1) {
            System.out.println(posMedia);
        } else {
            System.out.println(-1);
        }
    }
    public static void ordenacionRapida(int[] v) {
        final int N = v.length;
        quickSort(v, 0, N - 1);
    }
    public static void quickSort(int[] v, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        int pivote = v[inicio];
        int izq = inicio + 1;
        int der = fin;
        while (izq <= der) {
            while (izq <= fin && v[izq] < pivote) {
                izq++;
            }
            while (der > inicio && v[der] >= pivote) {
                der--;
            }
            if (izq < der) {
                int tmp = v[izq];
                v[izq] = v[der];
                v[der] = tmp;
            }
        }
        int tmp = v[inicio];
        v[inicio] = v[der];
        v[der] = tmp;
        quickSort(v, inicio, der - 1);
        quickSort(v, der + 1, fin);
    }
}
