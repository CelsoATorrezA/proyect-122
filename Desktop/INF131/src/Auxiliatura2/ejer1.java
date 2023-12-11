package Auxiliatura2;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class ejer1 {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);

		while (lee.hasNext()) {
			int n = lee.nextInt();
			lee.nextLine();
			TreeSet<String> treeSet = new TreeSet<>();
			TreeSet<String> fin = new TreeSet<>();

			for (int i = 0; i < n; i++) {
				String cad = lee.nextLine();
				StringTokenizer tokenizer = new StringTokenizer(cad);
				while (tokenizer.hasMoreTokens()) {
					treeSet.add(tokenizer.nextToken());
				}
			}

			String comp = lee.nextLine();
			int tam = treeSet.size();
			for (int j = 0; j < tam; j++) {
				String h = treeSet.pollFirst();
				if (!esNumero(h)) {
					fin.add(h);
				}
			}

			int cont = 0;
			int aux = fin.size();
			for (int i = 0; i < aux; i++) {
				String aux2 = fin.pollFirst();
				if (!aux2.equals(comp)) {
					cont++;
				} else
					break;
			}
			System.out.println(cont);
		}

	}

	private static boolean esNumero(String cadena) {
		try {
			// Intentar convertir la cadena a un número
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException e) {
			// La cadena no es un número
			return false;
		}
	}
}