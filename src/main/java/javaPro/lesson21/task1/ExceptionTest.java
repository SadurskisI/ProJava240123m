package javaPro.lesson21.task1;

public class ExceptionTest {

    public static void main(String[] args) {
        System.out.println("program start");
        System.out.println("call method div from main");
        int result = div(8,0);
        System.out.println("Main catch the result " + result);
        System.out.println("program end");

    }

    public static int div(int x, int y){
        System.out.printf("Method div starts with numbers %d and %d\n", x,y);
        int result;

        try {
            result = x / y;
        } catch (Exception e){
            System.out.println("Do not / by 0");
            result = 0;
        } finally {
            System.out.println("Block finally done! ");
        }

        System.out.printf("Method div end with result %d\n",result);
        return result;
    }
}
