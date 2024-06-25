import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "hello world"; // Change this string to test different cases

        System.out.println("Duplicate characters in the string '" + str + "':");
        findDuplicateChars(str);
    }

    // Method to find duplicate characters in a string
    public static void findDuplicateChars(String str) {
        // Create a map to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to character array
        char[] charArray = str.toCharArray();

        // Iterate through each character in the array
        for (char ch : charArray) {
            // If the character is already present in the map, increment its count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Otherwise, add it to the map with count as 1
                charCountMap.put(ch, 1);
            }
        }

        // Print characters with count > 1 (i.e., duplicates)
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
