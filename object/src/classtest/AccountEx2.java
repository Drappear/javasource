package classtest;

import java.util.Arrays;
import java.util.Scanner;

public class AccountEx2 {
    // 멤버 변수
    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("======================================================");
            System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
            System.out.println("======================================================");
            System.out.print("메뉴 선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 계좌 생성 메소드 호출
                    creatAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    run = false;
                    break;

                default:
                    System.out.println("메뉴 번호를 확인해주세요.");
                    break;
            }
        }

    }

    static void creatAccount() {
        // 계좌 생성 메소드
        // 계좌와 관련된 정보 입력받기(계좌번호, 이름, 금액)
        System.out.print("계좌번호를 입력해주세요. >> ");
        String accountNo = sc.nextLine();
        System.out.print("이름을 입력해주세요. >> ");
        String owner = sc.nextLine();
        System.out.print("입금 금액을 입력해주세요. >>");
        int balance = Integer.parseInt(sc.nextLine());

        // accounts[인덱스] = new Account(계좌번호, 이름, 금액);
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                System.out.println("계좌 생성이 완료되었습니다.");
                break;
            } else {
                System.out.println("계좌 생성에 실패했습니다.");
            }
        }
    }

    static void accountList() {
        // 현재 생성된 계좌 목록 출력
        // accounts 배열 출력
        System.out.println("=====================================");
        System.out.println("계좌번호    |    이름   |   잔액    ");
        System.out.println("=====================================");
        for (Account account : accounts) {
            if (account != null) {
                System.out.printf("%s\t\t%s\t\t%d\n", account.getAccountNo(), account.getOwner(), account.getBalance());
            }
        }
    }

    static void deposit() {
        // 예금
        System.out.println("계좌번호를 입력해주세요. >> ");
        String accountNo = sc.nextLine();
        System.out.println("입금할 금액을 입력해주세요. >> ");
        int input = Integer.parseInt(sc.nextLine());

        // 일치하는 계좌번호 찾기
        Account account = findAccount(accountNo);
        if (account != null) {
            account.deposit(input);
        }
    }

    static void withdraw() {
        // 출금
        System.out.println("계좌번호를 입력해주세요. >> ");
        String accountNo = sc.nextLine();
        System.out.println("출금할 금액을 입력해주세요. >> ");
        int input = Integer.parseInt(sc.nextLine());

        // 일치하는 계좌번호 찾기
        Account account = findAccount(accountNo);
        if (account != null) {
            account.withdraw(input);
        }

    }

    static Account findAccount(String accountNo) {
        // 일치하는 account 리턴
        for (Account account : accounts) {
            if (account != null) {
                if (accountNo.equals(account.getAccountNo())) {
                    return account;
                }
            }
        }
        return null;
    }

}
