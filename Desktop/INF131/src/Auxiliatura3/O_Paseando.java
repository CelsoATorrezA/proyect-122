package Auxiliatura3;
import java.util.Scanner;

public class O_Paseando {
 
	private static Scanner in;
	public static int n;
	public static int m;
	public static char a[][] = new char[15][15];
	public static boolean vis[][] = new boolean[15][15];
 
	public static int f(int i, int j) {
		if (i < 0 || i >= n || j < 0 || j >= m) 
			return 0;
		if (a[i][j] == '#') 
			return 0;
		if (vis[i][j] == true) 
			return 0;
		vis[i][j] = true;
		return f(i + 1, j) + f(i - 1, j) + f(i, j + 1) + f(i, j - 1) + 1;
	}
 
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while (true) {
			n = in.nextInt();
			m = in.nextInt();
			if (n == 0 && m == 0)
				break;
			int x = -1, y = -1;
			for (int i = 0; i < n; i++) {
				String linea = in.next();
				for (int j = 0; j < m; j++) {
					a[i][j] = linea.charAt(j);
					vis[i][j] = false;
					if (a[i][j] == '@') {
						x = i;
						y = j;
					}
				}
			}
			System.out.println(f(x, y));
		}
	}
}