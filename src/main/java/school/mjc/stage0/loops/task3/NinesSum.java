package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int counter = 0;
        int sum =0;
        while (counter<lengthOfLastNumber){
            counter++;
            sum+=generateNumber(counter);
        }
        System.out.println(sum);
    }
    public int generateNumber(int numberOfDigits) {
        int result = 0;
        for (int i = 1; i<=numberOfDigits; i++){
            result = result * 10 +9;
        }
        return result;
    }
}
