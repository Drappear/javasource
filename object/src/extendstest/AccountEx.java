package extendstest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 1000000, "123456");

        // 입금하다
        checkingAccount.deposit(100000);
        System.out.println("잔액 : " + checkingAccount.getBalance());

        int balance = checkingAccount.pay("123456", 20000);
        System.out.println("잔액 : " + balance);

        //
        System.out.println();
        //

        // 마이너스 통장
        CreditLineAccount creditLineAccount = new CreditLineAccount("111", "홍길동", 100000, 5000000);
        System.out.println("마이너스 통장 잔액 확인 : " + creditLineAccount.getBalance());

        balance = creditLineAccount.withdraw(4000000);
        System.out.println("잔액 : " + balance);

        //
        System.out.println();
        //

        BonusPointAccount bonusPointAccount = new BonusPointAccount("222", "홍길동", 10000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        bonusPointAccount.deposit(200000);
        System.out.println("잔액 : " + bonusPointAccount.getBalance());
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        //
        System.out.println();
        //

        CheckingTrafficCardAccount checkTraffic = new CheckingTrafficCardAccount("123", "홍길동", 100000,
                "333");

        System.out.println(checkTraffic.isHasTrafficCard() ? "교통카드 기능 o" : "교통카드 기능 x");
        // 교통카드 기능 추가
        checkTraffic.setHasTrafficCard(true);
        // 교통비 지불
        balance = checkTraffic.payTrafficCard("333", 3000);
        if (balance == -1) {
            System.out.println("교통카드 기능이 없습니다.");
        } else {
            System.out.println("교통비 지불 후 잔액 : " + balance);
        }

    }
}
