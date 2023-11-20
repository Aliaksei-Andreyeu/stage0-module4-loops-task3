package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        String input = t + "";
        if (t<0){
            t*=-1;
        }
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum = sum + t % 10;
            t = t / 10;
        }
        System.out.println(sum);
    }
}
