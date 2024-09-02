package shop;

public class ShopEx {
    public static void main(String[] args) {
        // 배열구조
        // MyShop shop = new MyShop();

        // 리스트 구조
        MyShop2 shop = new MyShop2();

        // 상점이름 지정
        shop.setTitle("MyShop");
        // user 생성
        shop.genUser();
        // 상품 생성
        shop.genProduct();
        // 상점 시작
        shop.start();
    }
}
