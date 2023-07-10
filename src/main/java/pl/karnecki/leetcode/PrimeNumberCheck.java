package pl.karnecki.leetcode;

public class PrimeNumberCheck {
    boolean isPrime(int n) {

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
