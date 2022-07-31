package oops;

public class Bank {

    public int AccountNum;

    public void DisplayBalance() {
        System.out.println("Inside DisplayBalance Balance");
    }

    public int GetBalance() {
        return 100;
    }

    public void CloseAccount(int i) {

        System.out.println("Inside Bank CloseAccount");
    }

}
