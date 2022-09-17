public class DecimalComparator {
    public static void main(String[] args){
        System.out.println(String.format("%.2g%", 23.1347));
    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        String.format("%.3g%n", x);
        String.format("%.3g%n", y);
        return false;
    }
}
