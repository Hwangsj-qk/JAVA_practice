package operator.ex;

public class Ex7 {
    public static void main(String[] args) {
        // int형 변수 score를 선언하고
        // score가 80점 이상이고 100점 이하면 true를 출력, 아니면 false를 출력하세요.

        int score = 70;

        if((score >= 80) && (score <= 100)) {
            System.out.println("결과: " + true);
        } else {
            System.out.println("결과: " + false);
        }
    }
}
