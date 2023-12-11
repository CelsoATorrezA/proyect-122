package inf131_021023;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int v[]={54,26,93,17,77,31,44,55,20};
		int v2[]={54,26,93,17,77,31,44,55,20};
		int v3[]={54,26,93,17,77,31,44,55,20};
		int v4[]={54,26,93,17,77,31,44,55,20};
		int v5[]={54,26,93,17,77,31,44,55,20};
		int v6[]={54,26,93,17,77,31,44,55,20};
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Metodo burbuja");
		burbuja(v, 9);
		
		System.out.println("Metodo Seleccion");
		seleccion(v2, 9);
		
		System.out.println("Metodo Insercion");
		insercion(v3, 9);
		
		System.out.println("Metodo ShellSort");
		ordenacionShell(v4);
		
		System.out.println("Metodo Quicksort");
		ordenacionRapida(v5);
		
		System.out.println("Metodo Merge Sort ");
		mostrarVector(v6);
		ordenacionCombinacion(v);
		
	}
	//1
	public static void burbuja(int v[],int n){
		mostrarVector(v);
		int aux;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if(v[i] > v[j]){
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
			mostrarVector(v);
		}
	}
	//2
	public static void seleccion(int v[],int n){
		mostrarVector(v);
		int k, tmp;
		for (int i = 0; i < n-1; i++) {
			k = i;
			tmp = v[i];
			for (int j = i+1; j < n; j++) {
				if(v[j] < tmp){
					tmp = v[j];
					k = j;
				}
			}
			v[k] = v[i];
			v[i] = tmp;
			mostrarVector(v);
		}
	}
	//3
	public static void insercion(int v[],int n){
		mostrarVector(v);
		int tmp, j;
		for (int i = 1; i < n; i++) {
			tmp = v[i];
			j = i-1;
			while(j >= 0 && v[j] > tmp  ){
				v[j+1] = v[j];
				j--;
			}
			v[j+1] = tmp;
			mostrarVector(v);
		}
	}
	//4
	public static void ordenacionShell(int[] v) {
		mostrarVector(v);
	    final int N = v.length;
	    int incremento = N;

	    do {
	        incremento = incremento / 2;

	        for (int k = 0; k < incremento; k++) {
	            for (int i = incremento + k; i < N; i += incremento) {
	                int j = i;

	                while (j - incremento >= 0 && v[j] < v[j - incremento]) {
	                    int tmp = v[j];
	                    v[j] = v[j - incremento];
	                    v[j - incremento] = tmp;

	                    j -= incremento;
	                }
	            }
	            mostrarVector(v);
	        }
	    } while (incremento > 1);
	}
	//5
	public static void ordenacionRapida(int[] v) {
		mostrarVector(v);
	    final int N = v.length;
	    quickSort(v, 0, N - 1);
	    mostrarVector(v);
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
	//6
	public static void ordenacionCombinacion(int[] v) {
		
        final int N = v.length;

        if (N <= 1) {
        	mostrarVector(v);
            return;
        }

        int mitad = N / 2;

        int[] izq = Arrays.copyOfRange(v, 0, mitad);
        int[] der = Arrays.copyOfRange(v, mitad, N);

        ordenacionCombinacion(izq);
        ordenacionCombinacion(der);

        combinar(v, izq, der);
    }
    public static void combinar(int[] resp, int[] izq, int[] der) {
        int i = 0;
        int j = 0;

        for (int k = 0; k < resp.length; k++) {
            if (i < izq.length && (j >= der.length || izq[i] <= der[j])) {
                resp[k] = izq[i++];
            } else {
                resp[k] = der[j++];
            }
        }
    }
    
    public static void mostrarVector(int[] v) {
        System.out.print("[ ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
