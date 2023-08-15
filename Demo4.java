public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String COLOR1 = "\033[33m";
        String COLOR2 = "\033[34m";
        String COLOR3 = "\033[35m";
        String COLOR4 = "\033[36m";
        String COLOR5 = "\033[37m";
        String COLOR6 = "\033[32m";
        String RESET = "\033[0m";

        System.out.printf("%s%s%s/%s%s%3$s/%s%s%3$s %s%s%3$s:%s%s%3$s:%s%s%3$s\n", COLOR1,day,RESET,COLOR2,month,COLOR3,year,COLOR4,hour,COLOR5,minute,COLOR6,second);
    }
}