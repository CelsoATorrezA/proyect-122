package Auxiliatura2;
import java.util.*;

public class ejer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            String S = scanner.next(); 
            int N = scanner.nextInt();
            Map<Character, Integer> modifications = new HashMap<>();
            for (int i = 0; i < N; i++) {
                char X = scanner.next().charAt(0);
                int Y = scanner.nextInt();
                modifications.put(X, Y);
            }
            List<Character> modifiedChars = new ArrayList<>();
            for (char c : S.toCharArray()) {
                modifiedChars.add(c);
            }
            for (int i = 0; i < modifiedChars.size(); i++) {
                char currentChar = modifiedChars.get(i);
                if (modifications.containsKey(currentChar)) {
                    modifiedChars.set(i, (char) (currentChar + modifications.get(currentChar)));
                }
            }
            modifiedChars.sort(Comparator.comparingInt(Character::charValue));
            for (char c : modifiedChars) {
                System.out.print(c);
            }
            System.out.println();
        }

        scanner.close();
    }
}
