public class Demo5 {
    public static void main(String[] args) {
        int first = 978;
        int second = 3;
        int third = 16;
        int fourth = 1484100;

        String COLOR1 = "\033[32m";
        String COLOR2 = "\033[33m";
        String COLOR3 = "\033[34m";
        String COLOR4 = "\033[35m";
        String RESET = "\033[0m";

        System.out.printf("%s%s%s-%s%s%3$s-%s%s%3$s-%s%s%3$s\n", COLOR1,first,RESET,COLOR2,second,COLOR3,third,COLOR4,fourth);
    }
}