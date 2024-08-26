package classtest;

public class Card {
    // 멤버 변수
    private String kind;
    private int number;

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // 클래스 변수
    static int width = 100;
    static int height = 250;

    public String getKind() {
        return kind;
    }

    public int getNumber() {
        return number;
    }
}
