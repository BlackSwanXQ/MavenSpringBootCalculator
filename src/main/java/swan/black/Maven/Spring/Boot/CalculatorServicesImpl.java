package swan.black.Maven.Spring.Boot;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServicesImpl implements ICalculatorServices {
    @Override
    public String greet() {
        return "<h1> Добро пожаловать в калькулятор!</h1>";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1> Ошибка! </h1>";
        }
        int totalNum = num1 + num2;
        return "<h1>" + "%d + %d = %d".formatted(num1, num2, totalNum) + "</h1>";
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1> Ошибка! </h1>";
        }
        int totalNum = num1 - num2;
        return "<h1>" + "%d - %d = %d".formatted(num1, num2, totalNum) + "</h1>";
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "<h1> Ошибка! </h1>";
        }
        int totalNum = num1 * num2;
        return "<h1>" + "%d * %d = %d".formatted(num1, num2, totalNum) + "</h1>";
    }

    @Override
    public String divide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "<h1> Ошибка! </h1>";
        } else if (num2 == 0) {
            return "<h1> Деление на ноль недопустимо. </h1>";
        }
        double totalNum = (double) num1 / num2;
        return "<h1>" + "%s / %s = %s".formatted(num1, num2, String.format("%.3f", totalNum)) + "</h1>";
    }
}
