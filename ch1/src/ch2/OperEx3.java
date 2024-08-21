package ch2;

public class OperEx3 {
    public static void main(String[] args) {
        // 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌 때
        // 학생 한 명당 몇 개를 나눠 가질 수 있고 최종적으로 몇 개가 남는지 출력하기
        // 조건) 변수 사용

        int pencil = 534;
        int student = 30;

        int divPen = pencil / student;
        int restPen = pencil % student;

        System.out.println("한 명당 가질 수 있는 연필 = " + divPen);
        System.out.println("남은 연필 수 = " + restPen);

        // 사다리꼴의 넓이 구한 후 출력하기
        // 윗변 : 5, 아랫변 : 10, 높이 : 7
        // 조건) 변수 사용, 소수자리 수까지 출력

        double upperside = 5;
        double lowerside = 10;
        double height = 7;

        System.out.println("사다리꼴의 넓이 = " + (upperside + lowerside) * height / 2);

        // 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 출력

        int num = 15;

        System.out.println("나머지 = " + (10 - (num % 10)));
    }
}
