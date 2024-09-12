import java.util.Arrays;

public class SoE {

    public static boolean[] SieveanMeasures(int limit) {
        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int p = 2; p * p <= limit; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int limit = 1000000;
        long timeStart = System.currentTimeMillis();

        boolean[] primus = SieveanMeasures(limit);

        int primeCounter = 0;
        
        for (int i = 1; i <= limit; i++) {
            if (primus[i]) {
                primeCounter++;
            }
        }
        long timeFinish = System.currentTimeMillis();

        System.out.println("Prime numbers found between 1 and " + limit + " is " + primeCounter);
        System.out.println("Time elapsed: " + (timeFinish - timeStart) + " milliseconds");
    }
}
