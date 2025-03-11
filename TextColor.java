public class TextColor {
    public static void main(String[] args) {
        System.out.println("\u001B[41m" + RedText() + "\033[0m");
    }
    public static String RedText(){
        return "Hello World";
    }
}
