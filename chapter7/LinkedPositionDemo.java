public class LinkedPositionDemo {

import javax.swing.text.Position;
    public static void main(String[] args) {
        LinkedPositionalList<Integer> pos = new LinkedPositionalList<Integer>();
        Position<Integer> p;
        p = pos.addLast(8);

        System.out.println("addLast(8) " + p);
        System.out.println("first() " + pos.first());

    }
}
