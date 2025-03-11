public class Fibonacci {
    public static void main(String[] args) {
        CreateFibonacci(5);
    }

    public static void CreateFibonacci(int num) {
        int prev = 0;
        int curr = 1;

        for (int count = 0; count < num; count++) {
            System.out.println(prev);
            curr = prev + (prev = curr);
        }
    }
}
