import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Undertale", "Deltarune"));
    }

    public static boolean isAnagram(String word1, String word2) {

        if (word1.toLowerCase().equals(word2.toLowerCase())) {
            return true;
        }

        char[] characters1 = word1.toLowerCase().toCharArray();
        char[] characters2 = word2.toLowerCase().toCharArray();

        Arrays.sort(characters1);
        Arrays.sort(characters2);

        return Arrays.equals(characters1, characters2);
    }
}