package ejercicios;

import java.util.Scanner;

public class ejercicio1673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lee = new Scanner(System.in);
		int N = lee.nextInt();
		int[] pd = new int [N];
		for (int i = 0; i < N; i++) {
			pd[i] = lee.nextInt();
		}
		int Q =lee.nextInt();
		for (int i = 0; i < Q; i++) {
			int pm = lee.nextInt();
			int suma =0;
			int cd = 0;
			for (int j = 0; j < N; j++) {
				if (pd[j]<= pm) {
					cd++;
					suma = suma +pd[j];
				}
			}
			System.out.println(cd+" "+suma);
		}
	}

}
