package app;

public class Main {
    public static void main(String[] args) {
        int totalSum = 0;
        int runningSum = 0;

        for (int i = 1; i <= 6; i++) {
            runningSum += i;
            totalSum += i;
            System.out.println(i + ". Num is " + i + ", sum is " + runningSum);
        }
        System.out.println("Sum of numbers is " + totalSum);
    }
}
