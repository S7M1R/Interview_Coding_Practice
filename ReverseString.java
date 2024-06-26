public class ReverseString {
    public static void main(String[] args) {
        String input = "hello world";
        String reversed = ReversedString(input);
        System.out.println(reversed);
    }

    public static String ReversedString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
