package ch4;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0; // 잔액

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("=======================================");
            System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("=======================================");
            System.out.print("필요한 메뉴를 선택하세요. >> ");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println();
                    System.out.print("넣을 금액을 입력하세요. >> ");
                    int input1 = sc.nextInt();
                    balance = balance + input1;
                    System.out.printf("%d원이 입금되었습니다.\n", input1);
                    System.out.printf("잔액 : %d\n", balance);
                    continue;
                case 2:
                    System.out.println();
                    System.out.print("출금할 금액을 입력하세요. >> ");
                    int input2 = sc.nextInt();
                    if (balance - input2 > 0) {
                        System.out.printf("%d원이 출금되었습니다.\n", input2);
                        balance = balance - input2;
                        System.out.printf("잔액 : %d\n", balance);
                    } else {
                        System.out.println("출금할 수 없습니다.");
                        System.out.printf("잔액 : %d\n", balance);
                    }
                    continue;
                case 3:
                    System.out.println();
                    System.out.printf("현재 잔고는 %d원 입니다.\n", balance);
                    continue;
                case 4:
                    System.out.println();
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;

                default:
                    break;
            }
        }

        sc.close();
    }
}
