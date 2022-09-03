public class Main {
    public static void main(String[] args) {
        printConversion(1.5);
    }

    public static double toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour <= 0){
            return -1;
        }
        else{
            double speed = Math.round(kilometersPerHour/1.609);
            return (long)(speed);
        }

    }
    public static void printConversion(double kilometersPerHour){
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour)
         + " mi/h");
    }
}