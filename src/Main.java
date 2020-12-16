public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        while (true) {
            str += str + "World";
            System.out.println(str);
        }
    }
}
