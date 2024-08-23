package yamshikov.oop.operations.expression;

public class Power implements ArithmeticOperationInterface{

    @Override
    public double operation(double n1, double n2){
        return Math.pow(n1,n2);
    }

}
