package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x,y;
        boolean z;
        for (x=2; x<= printToInclusive; x++) {
            z=true;
            for (y=2;y<=x/2;y++) {
                if (x % y ==0) {
                    z = false;
                    break;
                }
            }
            if (z) System.out.println(x);
        }
    }
}
