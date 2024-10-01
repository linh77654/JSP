package calculator.model;

public class Calculator {
    public double calculate(double num1, double num2, String operator) throws ArithmeticException {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Không thể chia cho 0");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Phép tính không hợp lệ");
        }
    }
}
