import java.util.HashMap;

public class PrintDuplicateCharectorsFromString {
    public static void main(String[] args) {
        String str = "hello world";
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : charArray) {
            if (charMap.containsValue(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        for (char c : charMap.keySet()) {
            if (charMap.get(c) > 1) {
                System.out.println(c + charMap.get(c));
            }
        }
    }
}
