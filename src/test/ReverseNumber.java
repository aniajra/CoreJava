package test;

public class ReverseNumber {

    public static void main(String args[]) {
        int num = 10000;
        int revnum = 0;
        int rem = 0;

        while (num > 0) {
            System.out.println("The num value = "+num);
            rem = num % 10;
            revnum = revnum * 10 + rem;
            System.out.println(revnum);
            num = num / 10;
            System.out.println("The new num value = "+num);
        }
        System.out.println("The Result is " + revnum);
    }
}
