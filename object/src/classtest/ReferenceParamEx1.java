package classtest;

public class ReferenceParamEx1 {
    public static void main(String[] args) {

        int[] arr = { 1, 7, 8, 10, 13, 4, 3 };

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("배열 총합 = " + sumArr(arr));
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        // 정렬 알고리즘
        // 1. 선택, 2. 버블, 3. 퀵 .....
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
