package swan.black.Maven.Spring.Boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServicesImpl calculatorServicesImpl;

    public CalculatorController(CalculatorServicesImpl calculatorServices) {
        this.calculatorServicesImpl = calculatorServices;
    }

    @GetMapping
    public String greet() {
        return calculatorServicesImpl.greet();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorServicesImpl.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorServicesImpl.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorServicesImpl.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Double num1, @RequestParam(value = "num2", required = false) Double num2) {
        return calculatorServicesImpl.divide(num1, num2);
    }


}
