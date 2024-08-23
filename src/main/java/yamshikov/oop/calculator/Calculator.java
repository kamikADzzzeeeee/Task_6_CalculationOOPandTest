package yamshikov.oop.calculator;

import yamshikov.oop.commands.Commands;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator implements Starting{
    private static final String[] allOperation = new String[]{"+","-","*","/","^"};

    private final Commands commands = new Commands();
    private final Scanner scanner;

    public Calculator(Scanner scannerIn) {
        this.scanner = scannerIn;
    }

    public double addNumber() {
        System.out.println("Введите число:");
        double n = 0;
        boolean cycle = true;
        while (cycle) {
            try {
                n = Double.parseDouble(scanner.next());
                cycle = false;
            } catch (Exception e) {
                System.err.println("Неверный формат введенного числа. Повторите ввод:");
            }
        }
        return n;
    }

    public String addOperation() {
        System.out.println("Введите операцию:");
        boolean cycle = true;
        String op = "";
        while (cycle) {
            op = scanner.next();
            for (String operation : allOperation) {
                if (operation.equals(op)) {
                    cycle = false;
                    break;
                }
            }
            if (cycle) {
                System.err.println("Неверная операция. Повторите ввода:");
            }

        }
        return op;
    }

    @Override
    public void start() {
        System.out.println("Калькулятор запущен");
        System.out.println("Введите команду:");
        commands.getAllCommands();
        String command = "";
        while (!command.equals("q")) {
            command = scanner.next();
            switch (command) {
                case ("h"):
                    commands.getAllCommands();
                    break;
                case ("a"):
                    System.out.println(commands.getResultArithmeticOperation(addNumber(), addNumber(), addOperation()));
                    break;
                case ("o"):
                    System.out.println(Arrays.toString(allOperation));
                    break;
                case ("c"):
                    commands.clearConsole();
                    break;
                case ("q"):
                    System.out.println("Прекращение работы калькулятора...");
                    break;
                default:
                    System.err.println("Неверно введенная команда. Повторите ввод:");
            }
        }
    }

}
