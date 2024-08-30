package api;

public class StringEx2 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));

    }

    static int count(String src, String target) {
        // src에서 target의 문자열이 몇 번 나오는지 카운트 한 후 리턴
        int count = 0;
        int num = 0;

        while ((num = src.indexOf(target, num)) != -1) {
            count++;
            num += target.length();
        }
        return count;
    }
}
