public class SecondDegree {
    public static void main(String[] args) {
        System.out.println(CheckTrue(5,3,0));
    }
    public static boolean CheckTrue(int a, int b, int c){
        if (b == 0){
            return false;
        }
        if (c == 0){
            return false;
        }
        if (a == 0){
            return false;
        }
        else{
            return true;
        }
    }
}
