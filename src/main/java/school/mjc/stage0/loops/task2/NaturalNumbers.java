package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int currentNumber = 0;
        while (currentNumber <= lastPrinted) {
            System.out.println(currentNumber);
            currentNumber++;
        }
    }
}
