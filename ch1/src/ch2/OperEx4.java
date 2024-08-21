package ch2;

import java.util.*;;

public class OperEx4 {
    public static void main(String[] args) {
        // 사용자로부터 한 달 월급을 입력 받은 후 월급을 10년간 저축한 금액은 얼마인지 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("월급을 입력해주세요 >> ");

        int salary = sc.nextInt();
        System.out.printf("월급 : %d, 10년 저축 금액 : %d\n", salary, salary * 120);

        sc.close();
    }
}
