package extendstest;

// 은행 계좌 + 직불 카드
public class CheckingAccount extends Account {

    private String cardNo;

    public CheckingAccount(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo;
    }

    // 사용금액을 지불한다.
    // 사용금액, 카드번호
    // 카드번호 일치 시 금액 인출
    int pay(String cardNo, int amount) {
        // 카드번호 확인
        if (!cardNo.equals(this.cardNo)) {
            return -1;
        }

        // 일치 시 금액 인출
        // balance = super.getBalance() - amount;
        return withdraw(amount);
    }
}
