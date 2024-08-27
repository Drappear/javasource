package extendstest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 1000000, "123456");

        // 입금하다
        checkingAccount.deposit(100000);
        System.out.println("잔액 : " + checkingAccount.getBalance());

        int balance = checkingAccount.pay("123456", 20000);
        System.out.println("잔액 : " + balance);
    }
}
