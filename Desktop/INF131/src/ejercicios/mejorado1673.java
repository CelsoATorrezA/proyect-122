package ejercicios;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class mejorado1673 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lee = new Scanner(System.in);
		int N = lee.nextInt();
		int[] pd = new int[N];
		
		for (int i = 0; i < N; i++) {            
			pd[i] = lee.nextInt();
		}	
		Merge(pd,0,N-1);                       
		int[]ac = new int[N];
		ac[0] = pd[0];
		for (int i = 1; i < N; i++) {         
			ac[i] = ac[i-1] + pd[i];
		}
		int Q = lee.nextInt();                   		
		for (int i = 1; i <= Q; i++) {   
			int pm = lee.nextInt();
			int iz = 0, der = N-1;
			while(der - iz > 1) {       
				int mid = (iz + der) / 2;	
				if(pd[mid] <= pm) {
					iz = mid;
				}else {
					der = mid;
				}
			}
			System.out.println((iz+1) + " " + ac[iz]);
		}
	}
	static void Merge(int[]v,int l,int r) {
		if(l == r)
			return;
		int mid=(l + r)/2;
		Merge(v, l, mid);
		Merge(v, mid+1, r);
		Queue <Integer> L = new LinkedList<Integer>();
		Queue<Integer> R = new LinkedList<Integer>();
			
		for(int i = l ; i <= mid;i++) {
			L.offer(v[i]);			
		}
		
		for(int i = mid+1 ;i <= r;i++) {
			R.offer(v[i]);			
		}
		
		for (int i= l; i<= r;i++) {
			if(L.size() == 0) {
				v[i]=R.poll();
			}else{
				if(R.size() == 0) {
					v[i]=L.poll();
				}else {
					if(L.peek() < R.peek()) {
						v[i]=L.poll();
					}
					else {
						v[i]=R.poll();
					}
				}
			}
		}
	}
}