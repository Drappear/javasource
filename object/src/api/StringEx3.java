package api;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Jerry", "Choi", "Kim", "Park", "Kim" };
        String result = findKim(names);
        System.out.println(result);
    }

    static String findKim(String[] names) {
        int count = 0;
        int[] num;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                count++;
            }
        }
        if (count != 0) {
            num = new int[count];
            int idx = 0;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals("Kim")) {
                    num[idx] = i;
                    idx++;
                }
            }
        } else {
            return "Kim 을 찾을 수 없습니다.";
        }

        return "Kim 은 " + Arrays.toString(num) + "번 index에 있다.";
    }

}
