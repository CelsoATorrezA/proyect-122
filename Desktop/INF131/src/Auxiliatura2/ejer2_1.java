package Auxiliatura2;
//YARA BELEM AGUILERA MANZANO
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class ejer2_1 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner lee = new Scanner(new File("texto.txt"));
		TreeSet<String> ts = new TreeSet<String>();
		String nuevaLinea = "";
		while (lee.hasNext()) {
			String linea = lee.nextLine().toLowerCase();
			StringTokenizer tok = new StringTokenizer(linea);
			while (tok.hasMoreTokens()) {
				String cadena = tok.nextToken();
				char car = cadena.charAt(cadena.length()-1);
				if (car == '-' || car == '.' || car == ',') {
					nuevaLinea = nuevaLinea +cadena.substring(0,cadena.length()-1);
				}else {
					nuevaLinea  = nuevaLinea+cadena+" ";
				}
				if (car == '.' || car == ',') {
					nuevaLinea = nuevaLinea + " ";
				}
			}
		}
		StringTokenizer tok = new StringTokenizer(nuevaLinea);
		while (tok.hasMoreTokens()) {
			ts.add(tok.nextToken());
		}
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}


