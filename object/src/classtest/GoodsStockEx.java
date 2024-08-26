package classtest;

public class GoodsStockEx {
    public static void main(String[] args) {
        GoodsStock goods1 = new GoodsStock("p1001", 100);
        GoodsStock goods2 = new GoodsStock("p2001", 15);

        // 상품 판매 -> 재고 감소
        System.out.println("현재 운동화 재고 : " + goods1.subStock(5));

        // 상품 추가 입고 -> 재고 추가
        goods2.addStock(20);

        System.out.println("현재 양말 재고 : " + goods2.getStockNum());

    }
}
