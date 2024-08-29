package shop;

public class CellPhone extends Product {

    public CellPhone(String pName, int price, String carrier) {
        super(pName, price);
        this.carrier = carrier;
    }

    // 통신사
    private String carrier;

    @Override
    void printExtra() {
        System.out.println("통신사 : " + carrier);
    }

}
