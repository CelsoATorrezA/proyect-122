package test4;
//ACEPTADO
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class C_ComoLlego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String origin = scanner.next();
        String destination = scanner.next();
        int minBuses = bfs(N, origin, destination);
        System.out.println(minBuses+1);
    }

    private static int bfs(int N, String origin, String destination) {
        Queue<String> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        queue.offer(origin);
        visited.add(origin);

        int minBuses = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                if (current.equals(destination)) {
                    return minBuses;
                }

                char[] currentArray = current.toCharArray();

                for (int j = 0; j < N - 1; j++) {
                    swap(currentArray, j, j + 1);

                    String next = new String(currentArray);

                    if (!visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }

                    swap(currentArray, j, j + 1);
                }
            }

            minBuses++;
        }

        return -1;
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
