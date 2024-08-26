package classtest;

public class CardEx {
    public static void main(String[] args) {

        System.out.println("카드 width : " + Card.width);
        System.out.println("카드 height : " + Card.height);

        // 인스턴스 생성
        Card card1 = new Card("Heart", 7);
        System.out.println("card1 kind : " + card1.getKind() + ", card1 number : " + card1.getNumber());

        Card card2 = new Card("Spade", 3);
        System.out.println("card2 kind : " + card2.getKind() + ", card2 number : " + card2.getNumber());

        Card.width = 150;
        Card.height = 300;
        System.out.println("카드 width : " + Card.width);
        System.out.println("카드 height : " + Card.height);

        // Cannot make a static reference to the non-static method
        firstMethod();

        CardEx obj = new CardEx();
        obj.secondMethod();
    }

    static void firstMethod() {

    }

    void secondMethod() {

    }
}
