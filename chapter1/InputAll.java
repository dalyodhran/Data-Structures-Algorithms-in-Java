package chapter1;

import java.util.Scanner;

class InputAll {

    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("Enter any base type: (q to quit)");
        String temp;
        do {
            temp = scan.next();
            System.out.println(temp);
        } while(!temp.equals("q"));
    }
}
