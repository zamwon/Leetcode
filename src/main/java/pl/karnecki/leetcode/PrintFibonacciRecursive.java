package pl.karnecki.leetcode;

public class PrintFibonacciRecursive {
    int fibonacci(int count) {

        if(count < 1) {
            return count;
        }
        return fibonacci(count - 1) + fibonacci(count - 2);
    }
}
