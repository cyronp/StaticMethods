public class LowerNumber {
    public static void main(String[] args) {
        System.out.println(LowestNumber(5,9));
    }
    public static int LowestNumber(int a, int b){
        int low = 0;
        if (a > b){
            low = b;
        }
        else{
            low = a;
        }
        return low;
    }
}
