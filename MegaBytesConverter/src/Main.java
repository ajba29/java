public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(1000000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes >= 1){
            int calculateMB = (kiloBytes/1024);
            int calculateRemainingKB = (kiloBytes%1024);
            System.out.println(kiloBytes + "KB = " + calculateMB + "MB and " +
                    calculateRemainingKB + "KB");
        } else if (kiloBytes < 1) {
            System.out.println("Invalid Value");
        }

    }
}