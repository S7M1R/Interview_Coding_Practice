import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class anagramString {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "testin";
        boolean result = checkAngagram(str1, str2);
        if (result) {
            System.out.println("it is anagram");
        } else
            System.out.println("it is not an anagram");
    }

    public static boolean checkAngagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean compare = Arrays.equals(charArray1, charArray2);
        if (!compare) {
            return false;
        } else
            return true;

    }

}
