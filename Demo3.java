public class Demo3 {
    public static void main(String[] args){
        int firstNu = 123;
        int secondNu = 456;
        int thirdNu = 7890;

        String COLOR = "\033[33m";
        String RESET = "\033[0m";

        System.out.printf("%s(%s)%s %s-%s\n", COLOR,firstNu,RESET,secondNu,thirdNu);
    }
}