package pl.karnecki.leetcode;

public class SwapNumbers {
    /*
    b = b + a; // now b is sum of both the numbers
    a = b - a; // b - a = (b + a) - a = b (a is swapped)
    b = b - a; // (b + a) - b = a (b is swapped)
    */

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a is " + a + " and b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping, a is " + a + " and b is " + b);
    }
}
