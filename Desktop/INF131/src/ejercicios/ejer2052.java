package ejercicios;

import java.util.Scanner;

public class ejer2052 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int n = lee.nextInt();
        int[] num = new int[n];
        String[] cad = new String[n];
        for (int i = 0; i < n; i++) {
            num[i]= lee.nextInt();
            cad[i] =lee.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <n; j++) {
                if (num[i] > num[j] || (num[i] == num[j] && cad[i].compareTo(cad[j]) < 0)) {
                    int tempNumero = num[i];
                    num[i] = num[j];
                    num[j] = tempNumero;

                    String tempCadena = cad[i];
                    cad[i] = cad[j];
                    cad[j] = tempCadena;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(num[i] + " " + cad[i]);
        }
    }
}

