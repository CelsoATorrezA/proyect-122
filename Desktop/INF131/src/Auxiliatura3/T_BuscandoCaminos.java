package Auxiliatura3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T_BuscandoCaminos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Crear lista de adyacencia para representar el árbol
        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }

        // Llenar la lista de adyacencia
        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        for (int i = 0; i < m; i++) {
            int k = scanner.nextInt();
            Set<Integer> vertices = new HashSet<>();
            for (int j = 0; j < k; j++) {
                vertices.add(scanner.nextInt());
            }

            if (checkPath(tree, vertices)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean checkPath(ArrayList<ArrayList<Integer>> tree, Set<Integer> vertices) {
        Set<Integer> visited = new HashSet<>();
        return dfs(tree, 1, vertices, visited);
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> tree, int current, Set<Integer> vertices, Set<Integer> visited) {
        visited.add(current);

        if (vertices.contains(current)) {
            vertices.remove(current);
            if (vertices.isEmpty()) {
                return true;
            }
        }

        for (int neighbor : tree.get(current)) {
            if (!visited.contains(neighbor)) {
                if (dfs(tree, neighbor, vertices, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}
