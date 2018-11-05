import java.util.Scanner;

class LineReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack st = new Stack(10);

        System.out.println("Enter sentances to be reversed (quit to stop)");

        String line;
        do {
            line = scan.nextLine();
            st.push(line);
        }while(!line.equals("quit"));

        String pop;
        while(!((pop = st.pop()).equals("empty"))){
            if(pop.equals("quit"))
                System.out.println();
            else
                System.out.println(pop);
        }
    }
}
