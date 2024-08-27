package extendstest;

public class CaptionEx {
    public static void main(String[] args) {

        CaptionTv cTv = new CaptionTv();

        // 채널, 색상, 전원여부
        cTv.setChannel(8);
        cTv.setColor("black");
        cTv.power();

        cTv.channelUp();
        System.out.println("현재 채널 : " + cTv.getChannel());

        cTv.displayCaption("Hello");
        cTv.setCaption(true);
        cTv.displayCaption("HI");
    }
}
