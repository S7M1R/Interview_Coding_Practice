import java.util.HashMap;

public class StringUniqueChars {
    public static void main(String[] args) {
        String str = "tse";
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap();
        for (char c : charArray) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else
                charMap.put(c, 1);
        }
        boolean allUnique = true;
        for (char c : charMap.keySet()) {
            if (charMap.get(c) > 1) {
                allUnique = false;
                break;
            }
        }

        if (allUnique) {
            System.out.println("string has unique chars");
        } else
            System.out.println("string does not have unique chars");
    }

}
