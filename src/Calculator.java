import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (또는 'exit' 입력 시 종료): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            double num1;
            try {
                num1 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                continue;
            }

            System.out.print("연산자 (+, -, *, /)를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2;
            try {
                num2 = scanner.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                continue;
            }

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("오류: 0으로 나눌 수 없습니다.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("잘못된 연산자입니다. (+, -, *, / 중 하나를 입력하세요)");
                    continue;
            }

            System.out.println("결과: " + result);
        }

        scanner.close();
    }
}
