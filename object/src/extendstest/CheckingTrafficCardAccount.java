package extendstest;

// 은행계좌 + 직불카드 + 교통카드
public class CheckingTrafficCardAccount extends CheckingAccount {

    // 교통카드 기능 여부
    private boolean hasTrafficCard;

    public CheckingTrafficCardAccount(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance, cardNo);
    }

    public CheckingTrafficCardAccount(String accountNo, String owner, int balance, String cardNo,
            boolean hasTrafficCard) {
        super(accountNo, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    }

    // hasTrafficCard 값 변경 메소드
    public void setHasTrafficCard(boolean hasTrafficCard) {
        this.hasTrafficCard = hasTrafficCard;
    }

    // 교통비 지불
    int payTrafficCard(String cardNo, int amount) {
        // 교통카드 기능 확인
        if (!hasTrafficCard) {
            return -1;
        }
        // 카드번호 확인, 잔액 확인 후 결제
        return pay(cardNo, amount);
    }
}
