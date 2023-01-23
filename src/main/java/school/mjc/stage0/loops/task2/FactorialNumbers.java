package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 0;
        int factorial = 1;
        while (currentNumber <= printToInclusive) {
            System.out.println(factorial);
            currentNumber++;
            factorial *= currentNumber;
        }

    }
}
