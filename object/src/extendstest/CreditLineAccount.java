package extendstest;

// 은행계좌 + 마이너스 가능한 계좌
public class CreditLineAccount extends Account {
    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String accountNo, String owner, int balance, int creditLine) {
        super(accountNo, owner, balance); // 부모의 생성자 호출
        this.creditLine = creditLine;
    }

    @Override
    int withdraw(int input) {
        if (getBalance() + creditLine < input) {
            return -1;
        }
        // 잔액 + 마이너스 한도 - 사용금액
        setBalance(getBalance() - input);
        return getBalance();
    }

}
