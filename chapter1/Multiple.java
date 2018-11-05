import java.util.Scanner;

class Multiple {

    static boolean isMultiple(long m, long n){
        if(m % n == 0)
            return true;

        return false;
    }

    static Scanner scan;



    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("Enter numbers:");

        long m = scan.nextLong();
        long n = scan.nextLong();

        if(isMultiple(m, n)){
            System.out.println("m is a multiple of n");
        } else {
            System.out.println("m is not a multiple of n");
        }

    }


}
