package poly;

public class Buyer {
    int money = 1000; // 고객이 가진 돈
    int bonusPoint = 0;

    // 구매한 재품을 저장하기 위한 배열
    // Computer computers[] = new Computer[3];
    // Air airs[] = new Air[3];
    Product[] products = new Product[10];
    int i = 0;

    // Product p = new Computer();
    // Product p = new Air();
    void buy(Product p) {
        // money 보다 물건의 가격이 작은지 확인
        if (money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        // money = money-물건가격
        money -= p.price;
        // bonusPoint = bonusPoint + 구입가격에 따른 포인트
        bonusPoint += p.bonusPoint;

        products[i++] = p; // 장바구니 담기

        System.out.println(p + "을/를 구입하였습니다.");

    }

    void summary() {
        // 구매한 제품에 대한 정보 출력
        // 구매한 제품의 총 금액 출력
        int sum = 0;
        String itemList = "";
        for (Product product : products) {
            if (product != null) {
                sum += product.price;

                itemList += product + ", ";
            }
        }

        // 구매한 제품 목록
        System.out.println("=============구매한 제품 목록=============");
        for (Product product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("==========================================");

        System.out.println("구매한 제품의 총액 : " + sum + "만 원");
        System.out.printf("구매한 제품은 %s 입니다.\n", itemList);
    }
}
