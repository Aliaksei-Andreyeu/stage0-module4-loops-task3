package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        System.out.println("0");
        System.out.println("1");
        int x = 0, y = 1, z = 0;
        for (int i = 0; i < lastFibonacci -2; i++) {
            z = y + x;
            x = y;
            y = z;
            System.out.println(z);
        }
    }
}
