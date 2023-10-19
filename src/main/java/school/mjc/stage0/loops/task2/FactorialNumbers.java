package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        System.out.println(1);
        while (i <= printToInclusive) {
            int y = 1;
            int result = 1;
            while (y <= i) {
                result = result * y;
                y++;
            }
            System.out.println(result);
            i++;
        }
    }
}
