package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int currentNumber = 0;
        if(power < 0){
            System.out.println("too much power");
            return;
        }
        int result = 1;
        while (currentNumber <= power) {
            System.out.println(result);
            currentNumber++;
            result *= 2;
        }

    }
}
