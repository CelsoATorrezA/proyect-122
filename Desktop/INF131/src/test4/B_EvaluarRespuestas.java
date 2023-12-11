package test4;
//ACEPTADO
 import java.util.HashMap;
 import java.util.Map;
 import java.util.Scanner;

 public class B_EvaluarRespuestas {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         while (scanner.hasNextInt()) {
             int numKeywords = scanner.nextInt();
             scanner.nextLine(); // Consumir la línea vacía

             String[] keywords = scanner.nextLine().split("\\s+");
             String[] scoresStr = scanner.nextLine().split("\\s+");
             String sentence = scanner.nextLine();

             Map<String, Integer> keywordScores = new HashMap<>();
             for (int i = 0; i < numKeywords; i++) {
                 keywordScores.put(keywords[i], Integer.parseInt(scoresStr[i]));
             }

             int totalScore = calculateScore(sentence, keywordScores);
             System.out.println(totalScore);
         }
     }

     private static int calculateScore(String sentence, Map<String, Integer> keywordScores) {
         int totalScore = 0;
         String[] words = sentence.split("\\s+");
         Map<String, Boolean> keywordFound = new HashMap<>();

         for (String word : words) {
             String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

             if (keywordScores.containsKey(cleanedWord) && !keywordFound.containsKey(cleanedWord)) {
                 totalScore += keywordScores.get(cleanedWord);
                 keywordFound.put(cleanedWord, true);
             }
         }

         return totalScore;
     }
 }
