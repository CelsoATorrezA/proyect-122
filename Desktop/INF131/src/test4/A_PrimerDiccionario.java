package test4;
//ACEPTADO
import java.util.Scanner;
import java.util.TreeSet;

public class A_PrimerDiccionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] words = line.split("[^a-zA-Z]+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    uniqueWords.add(word.toLowerCase());
                }
            }
        }

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
