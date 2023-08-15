public class Demo6_B {
    public static void main(String[] args) {
        String titleName = " NAME";
        String titleAge = "AGE ";
        String name1 = " Alice";
        String name2 = " Bob";
        String line1 = "-".repeat(17);
        String line2 = "-".repeat(5);
        
        int ageAlice = 24;
        int ageBob = 30;

        String BLUECOLOR = "\033[34m";
        String PINKCOLOR = "\033[95m";
        String YELLOWCOLOR = "\033[33m";
        String BOLD = "\033[1m";
        String RESET = "\033[0m";

        System.out.printf("%s+%17s+%5s+%s\n", YELLOWCOLOR,line1,line2,RESET);
        System.out.printf("%s|%s%s%s%-17s%2$s%2$s%1$s|%2$s%3$s%4$s%5s%2$s%2$s%1$s|%2$s\n", YELLOWCOLOR,RESET,BOLD,BLUECOLOR,titleName,titleAge);
        System.out.printf("%s+%17s+%5s+%s\n", YELLOWCOLOR,line1,line2,RESET);
        System.out.printf("%s|%s%-17s%1$s|%2$s%s%4s %2$s%1$s|%2$s\n", YELLOWCOLOR,RESET,name1,PINKCOLOR,ageAlice);
        System.out.printf("%s|%s%-17s%1$s|%2$s%s%4s %2$s%1$s|%2$s\n", YELLOWCOLOR,RESET,name2,PINKCOLOR,ageBob);
        System.out.printf("%s+%17s+%5s+%s\n", YELLOWCOLOR,line1,line2,RESET);
    }
}