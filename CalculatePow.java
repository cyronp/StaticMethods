public class CalculatePow {
    public static void main(String[] args) {
        System.out.println(TotalPow(5,3));
    }
    public static int TotalPow(int num, int pow){
        int result = 0;
        int pivot = num;
        int count = 0;
        while (count <= pow){
            pivot = pivot * num;
            result = pivot;

            count++;
        }
        return result;
    }
}
