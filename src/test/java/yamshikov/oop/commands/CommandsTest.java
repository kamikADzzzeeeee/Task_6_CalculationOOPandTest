package yamshikov.oop.commands;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CommandsTest {

    @Test
    public void testGetResultArithmeticOperationAddition() {
        Commands commands = new Commands();
        Random random = new Random();
        double n1 = random.nextDouble(-1000, 1000);
        double n2 = random.nextDouble(-1000, 1000);
        double res = n1 + n2;
        String resultExcepted = String.valueOf(res);
        String resultActual = commands.getResultArithmeticOperation(n1, n2, "+");
        Assert.assertEquals("Ошибка в операции сложения чисел", resultExcepted, resultActual);
    }

    @Test
    public void testGetResultArithmeticOperationSubstruct() {
        Commands commands = new Commands();
        Random random = new Random();
        double n1 = random.nextDouble(-1000, 1000);
        double n2 = random.nextDouble(-1000, 1000);
        double res = n1 - n2;
        String resultExcepted = String.valueOf(res);
        String resultActual = commands.getResultArithmeticOperation(n1, n2, "-");
        Assert.assertEquals("Ошибка в операции вычитания чисел", resultExcepted, resultActual);
    }

    @Test
    public void testGetResultArithmeticOperationMultiplication() {
        Commands commands = new Commands();
        Random random = new Random();
        double n1 = random.nextDouble(-1000, 1000);
        double n2 = random.nextDouble(-1000, 1000);
        double res = n1 * n2;
        String resultExcepted = String.valueOf(res);
        String resultActual = commands.getResultArithmeticOperation(n1, n2, "*");
        Assert.assertEquals("Ошибка в операции умножения чисел", resultExcepted, resultActual);
    }

    @Test
    public void testGetResultArithmeticOperationNormalDivision() {
        Commands commands = new Commands();
        Random random = new Random();
        double n1 = 0;
        double n2 = 0;
        while ((n1 == 0) && (n2 == 0)) {
            n1 = random.nextDouble(-1000, 1000);
            n2 = random.nextDouble(-1000, 1000);
        }
        double res = n1 / n2;
        String resultExcepted = String.valueOf(res);
        String resultActual = commands.getResultArithmeticOperation(n1, n2, "/");
        Assert.assertEquals("Ошибка в операции деления чисел", resultExcepted, resultActual);
    }


    @Test
    public void testGetResultArithmeticOperationDivisionByZero() {
        Commands commands = new Commands();
        Random random = new Random();
        double n1 = 0;
        double n2 = 0;
        while ((n1 == 0)) {
            n1 = random.nextDouble(-1000, 1000);
        }
        String resultActual = commands.getResultArithmeticOperation(n1, n2, "/");
        Assert.assertEquals("Ошибка в операции деления на ноль", "Деление на ноль", resultActual);
    }

    @Test
    public void testGetResultArithmeticOperationPower() {
        Commands commands = new Commands();
        Random random = new Random();
        double n1 = random.nextDouble(-1000, 1000);
        double n2 = random.nextDouble(-1000, 1000);
        double res = Math.pow(n1, n2);
        String resultExcepted = String.valueOf(res);
        String resultActual = commands.getResultArithmeticOperation(n1, n2, "^");
        Assert.assertEquals("Ошибка в операции возведения в степень чисел", resultExcepted, resultActual);
    }


}