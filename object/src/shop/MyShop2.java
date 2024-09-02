package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements Ishop {

    private String title;

    // User 리스트 생성
    List<User> users = new ArrayList<>();
    // Product 리스트 생성
    List<Product> products = new ArrayList<>();
    // cart 리스트 생성
    List<Product> carts = new ArrayList<>();

    // User 선택
    private int selectUser;

    Scanner sc = new Scanner(System.in);

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // user 2명 생성 후 users리스트 담기
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CASH));
    }

    @Override
    public void genProduct() {
        // CellPhone, SmartTv 5개 생성 후 products리스트 담기
        products.add(new CellPhone("iPhone 13", 1500000, "KT"));
        products.add(new CellPhone("Galaxy S24", 1200000, "SKT"));
        products.add(new CellPhone("LG V50", 1000000, "LG"));
        products.add(new SmartTv("Samsung Smart TV", 1500000, "UHD"));
        products.add(new SmartTv("LG Smart TV", 2500000, "4K"));

    }

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택
        // ============================
        // [1] 홍길동(CARD)
        // [2] 성춘향(CASH)
        // [X] 종료
        // 선택 >>

        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("============================");
        int idx = 1;
        for (User user : users) {
            System.out.println("[" + idx + "]" + user.getName() + "(" + user.getPayType() + ")");
            idx++;
        }
        System.out.println("[X] 종료");
        System.out.print("선택 >> ");
        // 사용자 입력이 1, 2인 경우 productList() 호출
        // x인 경우 System.exit();
        String input = sc.nextLine();
        switch (input) {
            case "1", "2":
                selectUser = Integer.parseInt(input) - 1;
                productList();
                break;
            case "x", "X":
                System.exit(0);
                break;

            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }

    }

    public void productList() {
        // 출력
        // MyShop : 상품목록 - 상품선택
        // ============================
        // [1] 상품 보여주기
        // [2] 상품 보여주기
        // [3]~[5]
        // [h] 메인화면
        // [c] 체크아웃
        // 선택 >>
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("============================");
        int i = 1;
        for (Product product : products) {
            System.out.printf("[%d]\n", i++);
            product.printDetail();
            System.out.println();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.print("선택 >> ");
        String input = sc.nextLine();

        switch (input) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                carts.add(products.get(Integer.parseInt(input) - 1));
                productList();
                break;
            case "h":
            case "H":
                start();
                break;
            case "c":
            case "C":
                checkOut();
                break;

            default:
                System.out.println("입력을 확인해주세요");
                start();
                break;
        }

        // 메뉴 받기
        // 0~4 or h or c
        // h : 메인화면 - 계정선택
        // c : checkOut() 호출
        // 0~4 : cart에 담기
    }

    public void checkOut() {
        // cart화면 출력
        System.out.println(title + " : " + users.get(selectUser).getName() + "님의 체크아웃");
        System.out.println("============================");

        int i = 1;
        int sum = 0;
        for (Product cart : carts) {
            if (cart != null) {
                System.out.printf("[%d] %s (%d)\n", i++, cart.getpName(), cart.getPrice());
                sum += cart.getPrice();
            }
        }

        // 결제방법 : CARD or CASH
        System.out.println("결제 방법 : " + users.get(selectUser).getPayType());

        // 합계 : 카트에 담긴 물건
        System.out.println("합계 : " + sum);

        // [p] 이전
        System.out.println("[p] 이전");
        // [q] 결제완료
        System.out.println("[q] 결제완료");

        System.out.print("선택 >> ");
        String input = sc.nextLine();
        // 입력값에 따라
        // p : 상품목록 화면
        // q : 종료
        switch (input) {
            case "p":
            case "P":
                productList();
                break;
            case "q":
            case "Q":
                System.exit(0);
                break;

            default:
                System.out.println("입력을 확인해주세요");
                break;
        }
    }
}
