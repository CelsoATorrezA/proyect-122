package Auxiliatura3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class S_Foquitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int Q = scanner.nextInt();
            ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                tree.add(new ArrayList<>());
            }
            for (int i = 1; i < N; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                tree.get(u).add(v);
            }
            Set<Integer> burnedFaucets = new HashSet<>();
            for (int i = 0; i < Q; i++) {
                int burned = scanner.nextInt();
                burnedFaucets.add(burned);
            }
            int result = countUnlitFaucets(tree, 1, burnedFaucets);
            System.out.println(result);
        }
    }
    static int countUnlitFaucets(ArrayList<ArrayList<Integer>> tree, int current, Set<Integer> burnedFaucets) {
        int count = 0;

        for (int child : tree.get(current)) {
            count += countUnlitFaucets(tree, child, burnedFaucets);
        }
        if (burnedFaucets.contains(current) || count > 0) {
            count++;
        }

        return count;
    }
}