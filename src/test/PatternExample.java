package test;

public class PatternExample {
    public static void main(String args[]) {
        String asterik = "*";

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(asterik);
            }
            System.out.println();
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
