package classtest;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("101-11-12345", "홍길동", 1000000);

        // 예금
        account.deposit(50000);

        // 잔액
        System.out.println(account.getBalance());

        // 출금
        int balance = account.withdraw(100000);
        if (balance == -1) {
            System.out.println("잔액 부족");
        } else {
            System.out.println("출금 후 잔액 : " + balance);
        }

        printAccount(account);
    }

    static void printAccount(Account account) {

    }
}
