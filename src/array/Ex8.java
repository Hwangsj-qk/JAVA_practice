package array;

public class Ex8 {
    // 이진탐색 binarySearch
    // 숫자가 정렬된 배열이 있습니다. 배열을 반으로 나누고,
    // 목표값이 있는 방향으로 다시 반으로 나누는 방식으로 목표값을 찾는 알고리즘을 구현해보세요.
    // 시간복잡도가 O(log n) : 만큼 반복하여 값을 찾는다.
    // 배열의 크기가 커질수록 선형탐색보다 훨씬 효율적으로 탐색을 한다.
    public static void main(String[] args) {
        // 1. 숫자로 이루어진 배열 선언
        int [] numbers = {11, 20, 36, 47, 54, 56, 72, 81, 90, 104};
        int target = 90;

        int left = 0;
        // 가장 왼족 인덱스
        int right = numbers.length -1;
        // 가장 오른쪽 인덱스
        while (left <= right) {
            int mid = (left + right)/2;
            // 가장 왼족 인덱스: 4

            if (numbers[mid] == target) {
                System.out.println("값을 찾았습니다. 타겟은 " + (mid + 1) + "번 째 있습니다. ");
                break;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
// 선생님께 여쭤보기
    }
}
