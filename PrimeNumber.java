public class PrimeNumber {
    public static void main(String[] args) {
        int num = 8;

        Boolean result = checkPrime(num);

        if (result) {
            System.out.println(num + " is prime number ");

        } else
            System.out.println(num + " is not a prime number ");
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
