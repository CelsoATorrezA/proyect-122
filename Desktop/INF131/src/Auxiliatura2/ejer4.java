package Auxiliatura2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casosPrueba = scanner.nextInt();      
        for (int i = 0; i < casosPrueba; i++) {
            int n = scanner.nextInt();
            String[] diccionario = new String[n];           
            for (int j = 0; j < n; j++) {
                diccionario[j] = scanner.next();
            }
            int[] resultado = contarAnagramas(diccionario);
            System.out.println(Arrays.toString(resultado).replaceAll("[\\[\\],]", ""));
        }
    }
    private static int[] contarAnagramas(String[] diccionario) {
        int[] resultado = new int[diccionario.length];       
        Map<String, Integer> contadorAnagramas = new HashMap<>();
        for (int i = 0; i < diccionario.length; i++) {
            char[] chars = diccionario[i].toCharArray();
            Arrays.sort(chars);
            String secuenciaOrdenada = new String(chars);
            contadorAnagramas.put(secuenciaOrdenada, contadorAnagramas.getOrDefault(secuenciaOrdenada, 0) + 1);
        }
        for (int i = 0; i < diccionario.length; i++) {
            char[] palabraActual = diccionario[i].toCharArray();
            Arrays.sort(palabraActual);
            String secuenciaActual = new String(palabraActual);
            resultado[i] = contadorAnagramas.get(secuenciaActual) - 1;
        }
        return resultado;
    }
}
