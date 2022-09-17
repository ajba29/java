public class AreaCalculator {
    public static void main(String[] args){
        System.out.println(area(10));
        System.out.println( area(10,20));
    }

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }else{
            double result = Math.round(3.14*(radius*radius));
            return result;
        }
    }

    public static double area(double length, double width){
        if (length < 0 || width < 0 ){
            return -1;
        }else{
            double result = Math.round(length*width);
            return result;
        }
    }
}
