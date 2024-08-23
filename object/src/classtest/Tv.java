package classtest;

public class Tv {
    // 속성 -> 변수
    // 채널(번호), 전원상태(true(on)/false(off)), 제조사...

    private int channel;
    private boolean power;
    private String company;

    // 생성자
    // 클래스 이름(){}
    // 생성자 오버로딩(하나의 클래스에 생성자가 여러개 존재)

    Tv() {
        // default생성자(괄호 안에 아무것도 없는)
    }

    Tv(int channel, boolean power, String company) {
        this.channel = channel;
        this.power = power;
        this.company = company;
    }

    // 전원을 켠다/끈다
    void power() {
        this.power = !this.power;
    }

    // 채널 올림/내림
    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }

    // getter 메소드(get으로 시작)
    public int getChannel() {
        return channel; // return은 channel값을 보낸다는 의미
    }

    public String getCompany() {
        return company;
    }

    public boolean isPower() {
        return power;
    }

    // setter 메소드(set으로 시작)

}
