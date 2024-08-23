package yamshikov.oop.operations.expression;

import yamshikov.oop.operations.exception.DivisionByZeroException;

public class Division implements ArithmeticOperationInterface {

    @Override
    public double operation(double n1, double n2) throws DivisionByZeroException {
        double result = 0;
        if (n2 == 0) throw new DivisionByZeroException();
        result = n1/n2;
        return result;

    }
}
