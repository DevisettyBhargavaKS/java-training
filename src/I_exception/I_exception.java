package I_exception;

public class I_exception {
    public static void main(String[] args) {
        try {
            int a = 12 / 0;
            System.out.println("exception");
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("error");
            } else {
                System.out.println(e);
            }
        }
    }
}
