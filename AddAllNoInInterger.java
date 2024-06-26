public class AddAllNoInInterger {
    public static void main(String[] args) {
        int i = 153;
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        System.out.println(sum);
    }

}
