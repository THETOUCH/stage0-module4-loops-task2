package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        if (multiplyByAndToInclusive > 0) {
            while (i <= multiplyByAndToInclusive * multiplyByAndToInclusive) {
                System.out.println(i);
                i = i + multiplyByAndToInclusive;
            }
        }
        if (multiplyByAndToInclusive < 0) {
            while (i >= multiplyByAndToInclusive * multiplyByAndToInclusive * (-1)) {
                System.out.println(i);
                i += multiplyByAndToInclusive;
            }
        }
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        }
    }
}
