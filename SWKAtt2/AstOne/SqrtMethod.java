package AstOne;
class primeSqrtMethod{

    public static boolean PrimeOrNot(int num){
        if (num < 2) return false;
        for (int i =2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
    int limit = 1000000;
    long timeStart = System.currentTimeMillis();

    int countimusPrime = 0;
    for (int i = 1; i <= limit; i++){
        if(PrimeOrNot(i)){
            countimusPrime++;
        }
    }

    long timeFinish = System.currentTimeMillis();

    System.out.println("Prime numbers found between 1 and " + limit + " is " + countimusPrime);
    System.out.println("Time elapsed: " + (timeFinish - timeStart) + " milliseconds");
    }

}