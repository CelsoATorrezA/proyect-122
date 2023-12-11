package clase081123;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main_1382 {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		ArrayList<String> palIng = new ArrayList<String>();
		TreeMap<String, String> tm = new TreeMap<String, String>();
		String linea = lee.nextLine();
		while (!linea.equals("::")) {
			palIng.add(linea);
			linea= lee.nextLine();
		}
		while (lee.hasNext()) {
			linea = lee.nextLine().toLowerCase();
			String[] pal = linea.split(" ");
			for (int i = 0; i < pal.length; i++) {
				if (!palIng.contains(pal[i])) {
					String key = pal[i].toUpperCase();
					String cadInicial = "";
					for (int j = 0; j < i; j++) {
						cadInicial = cadInicial + pal[j]+" ";
					}
					String cadFinal ="";
					for (int j = i+1; j < pal.length; j++) {
						cadFinal = cadFinal + " " + pal[j] ;
					}
					String titulo = cadInicial + key + cadFinal;
					tm.put(key, titulo);
				}
			}	
		}
		for (String indicekwic : tm.values()) {
			System.out.println(indicekwic);
		}

	}

}
