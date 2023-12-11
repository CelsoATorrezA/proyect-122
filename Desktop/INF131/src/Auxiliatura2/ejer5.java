package Auxiliatura2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class SdComparator implements Comparator<Integer> {
    public int compare(Integer num1, Integer num2) {
        int sd1 = calcularSd(num1);
        int sd2 = calcularSd(num2);
        if (sd1 != sd2) {
            return Integer.compare(sd1, sd2);
        } else {
            return Integer.compare(num1, num2);
        }
    }
    private int calcularSd(int num) {
        int sumaDigitos = 0;
        while (num != 0) {
            sumaDigitos += num % 10;
            num /= 10;
        }
        return sumaDigitos;
    }
}
public class ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] vector = new Integer[n];
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }
        Arrays.sort(vector, new SdComparator());
        System.out.print(vector[0]);
        for (int i = 1; i < n; i++) {
            System.out.print( " "+vector[i]);
        }
        System.out.println();
    }
}