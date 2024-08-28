package extendstest;

public class Account {
    // 계좌번호(accountNo) : 101-11-12345
    // 계좌주(owner) : 홍길동
    // 잔액(balance) : 1000000 // int

    private String accountNo;
    private String owner;
    private int balance;

    public Account(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 기능
    // 예금(deposit)
    // 잔액 = 잔액 + 예금액
    // return 없음
    void deposit(int input) {
        balance += input;
    }

    // 출금(withdraw)
    // 잔액 = 잔액 - 출금액
    // 잔액 return
    int withdraw(int input) {
        if (input > balance) {
            return -1;
        }
        balance -= input;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }
}
