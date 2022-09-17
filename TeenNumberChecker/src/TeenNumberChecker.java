public class TeenNumberChecker {
    public static void main(String[] args){
        System.out.println(hasTeen(9, 15, 99));
        System.out.println(hasTeen(9,5,3));
        System.out.println(isTeen(10));
        System.out.println(isTeen(16));
    }

    public static boolean hasTeen(int x, int y, int z){
        if (x <= 19 && x >= 13 || y <= 19 && y >= 13 || z <= 19 && z >= 13){
            return true;
        }else {return false;}
    }

    public static boolean isTeen(int x){
        if(x >= 13 && x <=19){
            return true;
        }else {return false;}
    }
}
