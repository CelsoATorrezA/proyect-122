package Auxiliatura2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pesos = new int[n];
        for (int i = 0; i < n; i++) {
            pesos[i] = scanner.nextInt();
        }
        long formasDiferentes = calcularFormasDiferentes(pesos);
        System.out.println(formasDiferentes % 1000000007);
    }
    private static long calcularFormasDiferentes(int[] pesos) {
        Arrays.sort(pesos);
        Map<Integer, Integer> conteoPesos = new HashMap<>();
        for (int peso : pesos) {
            conteoPesos.put(peso, conteoPesos.getOrDefault(peso, 0) + 1);
        }
        long resultado = 1;
        for (int cantidad : conteoPesos.values()) {
            resultado = (resultado * calcularFactorial(cantidad)) % 1000000007;
        }
        return resultado;
    }
    private static long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = (resultado * i) % 1000000007;
        }
        return resultado;
    }
}
