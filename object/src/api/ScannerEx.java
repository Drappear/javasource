package api;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력");
        String str = sc.next(); // 공백 전까지 입력을 받음 ex) 안녕하세요 반갑습니다 => 안녕하세요
        System.out.println(str);

        System.out.print("input num1 ");
        int num1 = sc.nextInt();
        System.out.print("+-/* 중 하나를 입력하세요");
        // String op = sc.nextLine(); // 앞의 nextInt(); 에서 숫자+엔터키로 입력을 하면
        // 숫자만 가져가고 남은 엔터키 입력값이 nextLine(); 으로 들어가게됨
        String op = sc.next();
        System.out.print("input num2 ");
        int num2 = sc.nextInt();

    }
}
