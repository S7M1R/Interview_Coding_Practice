public class SwapTwoNoUsingThirdVariable {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("n1 is : " + n1);
        System.out.println("n2 is : " + n2);

    }
}