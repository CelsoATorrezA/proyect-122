package Auxiliatura1;

import java.util.Scanner;
public class ejer2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int sumaEsperada = scanner.nextInt();
            int n = scanner.nextInt();
            int[] numeros = new int[n];
            for (int i = 0; i < n; i++) {
                numeros[i] = scanner.nextInt();
            }
            int numSumasPosibles = contarSubconjuntosConSuma(numeros, sumaEsperada);
            System.out.println(numSumasPosibles);
        }
        scanner.close();
    }
    private static int contarSubconjuntosConSuma(int[] numeros, int sumaObjetivo) {
        return contarSubconjuntosRecursivo(numeros, sumaObjetivo, 0, 0);
    }
    private static int contarSubconjuntosRecursivo(int[] numeros, int sumaObjetivo, int index, int sumaParcial) {
        if (index == numeros.length) {
            return (sumaParcial == sumaObjetivo) ? 1 : 0;
        }
        int incluir = contarSubconjuntosRecursivo(numeros, sumaObjetivo, index + 1, sumaParcial + numeros[index]);
        int excluir = contarSubconjuntosRecursivo(numeros, sumaObjetivo, index + 1, sumaParcial);
        return incluir + excluir; 
	}
}
