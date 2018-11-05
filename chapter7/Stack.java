public class Stack {

    private ArrayList<Integer> stck;
    private int tos;

    public Stack(){
        stck = new ArrayList<Integer>();
        tos = -1;
    }

    public Stack(int size) {
        stck = new ArrayList<Integer>(size);
        tos = -1;
    }

    public void push(int item) {
        stck.add(++tos, item);
        //System.out.println("added: " + item + " @ possition: " + tos );
    }

    public int pop() {
        if(stck.isEmpty())
            return -1;
        else
            //System.out.println("Popping :" + tos);
            return stck.remove(tos--);
    }
}
