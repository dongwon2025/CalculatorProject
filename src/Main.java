import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("계산기가 실행됩니다.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char op = scanner.next().charAt(0);

            int result = 0;

            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없어 종료됩니다.");
                        break;
                    }
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하려면 아무키나 눌러주세요.(exit 입력 시 종료)");
            String answer = scanner.next();
            if (answer.equals("exit")) {
                break;
            }
        }
    }
}