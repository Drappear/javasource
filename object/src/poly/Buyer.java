package poly;

public class Buyer {
    int money = 1000; // 고객이 가진 돈
    int bonusPoint = 0;

    void buy(Computer computer) {
        // money 보다 물건의 가격이 작은지 확인
        if (money < computer.price) {
            System.out.println("잔액 부족");
            return;
        }

        // money = money-물건가격
        money -= computer.price;
        // bonusPoint = bonusPoint + 구입가격에 따른 포인트
        bonusPoint += computer.bonusPoint;
        System.out.println(computer + "을/를 구입하였습니다.");

    }
}
