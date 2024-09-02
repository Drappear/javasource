package exception;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("111-111", "홍길동", 1000000);
        try {
            account.withdraw(5000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
