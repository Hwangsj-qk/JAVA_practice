package array;

import java.util.Scanner;

public class Ex7 {
    // 선형탐색 Linear Search
    // 정수 배열에 임의의 정수들이 존재합니다.
    // 해당 배열을 출력하고, 사용자에게 특정 값을 입력받아
    // 특정 값이 배열 내에 존재하는지 확인하는 프로그램을 작성하세요
    public static void main(String[] args) {
        // 1. 임의의 정수를 가진 배열 선언
        int[] numbers = {10, 54, 23, 45, 8,5};

        // 2. 배열 출력
        for (int number : numbers) {
            System.out.println(number + " ");
            // 임의의 정수 출력
        }
        System.out.println();

        // 3. 찾는 값을 사용자로부터 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("찾는 값을 입력하세요 : ");

        int target = scanner.nextInt();
        // 찾는값
        boolean found = false;
        // 탐색 여부를 확인하는 플래그

        // 4. 선형 탐색법으로 위치를 찾음
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target) {
                System.out.println("배열의 " + (i+1) + "번째 위치에 존재합니다. ");
                found = true;
                break;
                // 탐색을 했으므로 break까지
            }
        }
        if(!found) {
            // found가 true가 아니라면
            System.out.println("배열에 존재하지 않습니다. ");
        }
        // Big O 표기법으로 최악의 경우 O(n) 만큼 탐색한다.
    }
}
