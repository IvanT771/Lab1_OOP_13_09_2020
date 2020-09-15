public class Primes {

     public static boolean isPrimes(int n){
        for(int i=2;i<n;i++){
            if(n%i == 0){return true;}
        }
        return false;
     } 
     public static void main(String[] args) {

        for(int i=2;i<=100;i++){
            if (isPrimes(i)){
                System.out.println(" "+i);
            }
        }
     
 }
}
