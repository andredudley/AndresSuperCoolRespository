package AstOne;
public class Nmethod {
    
    public static boolean PrimeOrNo(int num){
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int limit = 1000000;
        long timeStart = System.currentTimeMillis();

        int countPrimula = 0;
        for (int i = 1; i <= limit; i++) {
            if (PrimeOrNo(i)) {
                countPrimula++;
            }
        }

        long timeFinish = System.currentTimeMillis();

        System.out.println("Prime numbers found between 1 and " + limit + " is " + countPrimula);
        System.out.println("Time elapsed: " + (timeFinish - timeStart) + " milliseconds");
    }
}
