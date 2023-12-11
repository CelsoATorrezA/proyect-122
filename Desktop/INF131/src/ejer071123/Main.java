package ejer071123;
//YARA BELEN AGUILERA MANZANO
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		int n = lee.nextInt();
		while(n > 0){
			PriorityQueue<Integer> cp = new PriorityQueue<Integer>();
			while(n-- > 0){
				cp.offer(lee.nextInt());
			}
			int costo = 0;		
			while(cp.size() >= 2){
				int a = cp.poll();
				int b = cp.poll();
				costo = costo + (a + b);
				cp.offer(a + b);
			}
			System.out.println(costo);
			n = lee.nextInt();
		}
	}
}