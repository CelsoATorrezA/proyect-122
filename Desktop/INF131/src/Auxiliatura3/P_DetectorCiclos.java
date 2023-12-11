package Auxiliatura3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P_DetectorCiclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int vertices = scanner.nextInt();
            int edges = scanner.nextInt();

            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i <= vertices; i++) {
                graph.add(new ArrayList<>());
            }

            for (int e = 0; e < edges; e++) {
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                graph.get(from).add(to);
            }

            boolean hasCycle = hasCycle(graph, vertices);

            if (hasCycle) {
                System.out.println("Tiene Ciclo");
            } else {
                System.out.println("No Tiene");
            }
        }
    }

    static boolean hasCycle(List<List<Integer>> graph, int vertices) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> recursionStack = new HashSet<>();

        for (int i = 1; i <= vertices; i++) {
            if (!visited.contains(i) && isCyclic(graph, i, visited, recursionStack)) {
                return true;
            }
        }

        return false;
    }

    static boolean isCyclic(List<List<Integer>> graph, int node, Set<Integer> visited, Set<Integer> recursionStack) {
        visited.add(node);
        recursionStack.add(node);

        for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                if (isCyclic(graph, neighbor, visited, recursionStack)) {
                    return true;
                }
            } else if (recursionStack.contains(neighbor)) {
                return true;
            }
        }

        recursionStack.remove(node);

        return false;
    }
}

