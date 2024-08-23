package yamshikov.oop.operations.expression;

import yamshikov.oop.operations.exception.DivisionByZeroException;

public interface ArithmeticOperationInterface {

    double operation(double n1, double n2) throws DivisionByZeroException;


}
