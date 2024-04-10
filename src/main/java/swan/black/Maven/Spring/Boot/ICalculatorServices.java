package swan.black.Maven.Spring.Boot;

public interface ICalculatorServices {
    String greet();

    String plus(Integer num1, Integer num2);

    String minus(Integer num1, Integer num2);

    String multiply(Integer num1, Integer num2);

    String divide(Double num1, Double num2);
}

