public class PrimeChecker {
    public static void main(String[] args) {
        int number = 20; // Replace with the desired number
        boolean isPrime = isPrimeUsingFlag(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static boolean isPrimeUsingFlag(int n) {
        if (n <= 1) {
            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
