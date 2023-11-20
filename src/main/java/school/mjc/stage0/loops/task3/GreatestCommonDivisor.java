package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 0;
        int smallest = (first < second) ? first : second;
        int greatest = (first >= second) ? first : second;
        for (int i = 1; i <= smallest; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        if (smallest == 0) {
            gcd = greatest;
        }
        System.out.println(gcd);
    }
}
