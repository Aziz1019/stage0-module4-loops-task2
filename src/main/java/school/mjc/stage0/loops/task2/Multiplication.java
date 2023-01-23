package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int currentNumber = 0;
        if(multiplyByAndToInclusive == 0){
            return;
        }
        if(multiplyByAndToInclusive < 0){
            multiplyByAndToInclusive *= -1;
            while (currentNumber <= multiplyByAndToInclusive) {
                System.out.println(currentNumber*multiplyByAndToInclusive * -1);
                currentNumber++;
            }
        }
        else {
            while (currentNumber <= multiplyByAndToInclusive) {
                System.out.println(currentNumber*multiplyByAndToInclusive);
                currentNumber++;
            }
        }
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
//        multiplication.printMultiplied(5);
        multiplication.printMultiplied(-5);
    }
}
