package shop;

public class SmartTv extends Product {

    public SmartTv(String pName, int price, String resolution) {
        super(pName, price);
        this.resolution = resolution;
    }

    // 해상도
    private String resolution;

    @Override
    void printExtra() {
        System.out.println("해상도 : " + resolution);
    }

}
