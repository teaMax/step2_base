package topic7_Methods.task6_PrimeChecker;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(15));
        System.out.println(isPrime(17));
    }

    static boolean isPrime(int number){
        int i = 2;
        while(i < number) {
            if(number % i == 0) return false;
            i++;
        }
        return true;
    }
}
