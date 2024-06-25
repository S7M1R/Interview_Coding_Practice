public class SwapNoWithoutVariable {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 8;

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("n1 :" + n1);
        System.out.println("n2 :" + n2);

    }
}
