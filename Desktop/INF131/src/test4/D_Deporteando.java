package test4;
//ACEPTADO
import java.util.*;

public class D_Deporteando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cost = new int[8];
        Arrays.fill(cost, Integer.MAX_VALUE / 2);
        cost[0] = 0;
        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt();
            String s = scanner.next();
            int mask = 0;
            for (char ch : s.toCharArray()) {
                if (ch == 'B') mask |= 1;
                if (ch == 'F') mask |= 2;
                if (ch == 'W') mask |= 4;
            }
            for (int j = 0; j < 8; j++) {
                cost[j | mask] = Math.min(cost[j | mask], cost[j] + c);
            }
        }
        if (cost[7] >= Integer.MAX_VALUE / 2) {
            System.out.println(-1);
        } else {
            System.out.println(cost[7]);
        }
    }
}
  