package classtest;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = new Tv();

        // private 키워드가 붙은 경우 외부에서 직접 호출 불가
        // System.out.println("현재 채널 : " + tv.channel);
        // System.out.println("현재 전원 상태 : " + tv.power);
        // System.out.println("제조사 : " + tv.company);

        Tv tv2 = new Tv(8, true, "samsung");

        // 메소드 호출
        int channel = tv2.getChannel();
        System.out.println("현재 채널 : " + channel);

        // 메소드 호출
        tv2.channelUp();

        System.out.println("현재 채널 : " + tv2.getChannel());

        // tv 종료
        tv2.power();
        System.out.println("전원 : " + tv2.isPower());
    }
}
