public class Main {
    public static void main(String[] args) {
        short numS = 10;
        byte numB = 20;
        int numI = 30;
        long numL = 50000;

        long sum = (long)((numS + numB + numI)*10);
        long total = numL + sum;

        System.out.println("Total number is: " + total);

    }
}