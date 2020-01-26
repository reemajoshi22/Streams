public class PrimeNumber {
    public static void main(String[] args) {

        PrimeNumber primeNumber=new PrimeNumber();
        primeNumber.isPrime(10);
        primeNumber.printPrimeTill(10);

    }

    private void printPrimeTill(int num) {

        boolean isPrime = true;
        for (int i=2;i<=num;i++){
            for(int j=2;j<i;j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                else
                    isPrime=true;
            }
            if(isPrime==true)
                System.out.println("prime numbers "+i);
        }
    }

    private void isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <=num; i++) {
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true)
            System.out.println(num+ " is a prime number");
        else
            System.out.println(num+ " Not a prime number");
    }
}
