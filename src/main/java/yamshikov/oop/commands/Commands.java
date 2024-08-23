package yamshikov.oop.commands;

import yamshikov.oop.operations.exception.DivisionByZeroException;
import yamshikov.oop.operations.expression.*;

import java.util.Optional;

public class Commands {

    public Commands() {
    }

    private String calculation(double n1, double n2, String op) {
        String result = "";
        ArithmeticOperationInterface arithmetic = switch (op) {
            case ("+") -> new Addition();//String.valueOf(arithmeticOperation.addition(n1, n2));
            case ("-") -> new Substruction();
            case ("*") -> new Multiplication();
            case ("/") -> new Division();
            case ("^") -> new Power();
            default -> null;
        };
        Optional<ArithmeticOperationInterface> optional = Optional.ofNullable(arithmetic);
        if (optional.isPresent()) {
            try {
                result = String.valueOf(optional.get().operation(n1, n2));
            } catch (DivisionByZeroException e){
                result = e.getMessage();
            }
        } else {
            result = "Неизвестная операция";
        }
        return result;
    }

    public String getResultArithmeticOperation(double n1, double n2, String op) {
        return calculation(n1, n2, op);
    }

    public void clearConsole() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public void getAllCommands() {
        System.out.println("h - Вывести список доступных команд");
        System.out.println("a - Решить арифметический пример");
        System.out.println("o - Вывести список доступных арифметических операций");
        System.out.println("c - Очистить консоль");
        System.out.println("q - Закрыть калькулятор");
    }


}
