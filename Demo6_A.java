public class Demo6_A {
    public static void main(String[] args) {
        String red = "\033[41m";
        String green = "\033[42m";
        String reset = "\033[0m";

        System.out.printf("%s[%10s%s%s%-10s]%3$s\n", red,"5",reset,green,"0%");
    }
}