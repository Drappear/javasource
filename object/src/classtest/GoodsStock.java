package classtest;

// 상품재고
public class GoodsStock {
    // 속성
    // 상품 코드(goodsCode) : p1001, p1002...
    // 재고 수량(stockNum)

    private String goodsCode;
    private int stockNum;

    // 생성자
    public GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

    // 기능
    // 재고 추가(addStock), 감소(subStock)

    void addStock(int num) {
        stockNum += num;
    }

    int subStock(int num) {
        stockNum -= num;
        return stockNum;
    }

    // 상품 코드 반환
    public String getGoodsCode() {
        return goodsCode;
    }

    // 재고 수량 반환
    public int getStockNum() {
        return stockNum;
    }
}
