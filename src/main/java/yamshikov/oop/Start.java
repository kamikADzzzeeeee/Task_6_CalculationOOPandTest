package yamshikov.oop;

import yamshikov.oop.calculator.Calculator;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Scanner(System.in));
        calculator.start();
    }


}
