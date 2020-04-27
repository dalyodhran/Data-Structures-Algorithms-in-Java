import java.util.Scanner;

class Even{

    static boolean isEven(int num){
        int temp = num - 1;

        temp = temp >> 1;
        num = num >> 1;

        if(temp == num){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number");

        int num = scan.nextInt();

        if(isEven(num)){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}
