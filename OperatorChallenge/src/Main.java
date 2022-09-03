public class Main {
    public static void main(String[] args) {
        double numberD = 20.00;
        double numberDD = 80.00;

        double totalD = (numberD + numberDD)*100;

        double remainderD = totalD % 40;

        boolean isZero = (remainderD == 0) ? true : false;

        System.out.println(isZero);

        if (!isZero){
            System.out.println("Got some remainder boiiiiii");
        }
    }
}