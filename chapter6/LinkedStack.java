public class LinkedStack <E> implements Stack<E> {

    private SingleLinkedList<E> list = new SingleLinkedList<>();

    public LinkedStack() { }

    public int size() { return list.size(); }

    public boolean isEmpty() { return list.isEmpty(); }

    public void push(E e) { list.addFirst(e); }

    public E top() { return list.first(); }

    public E pop() { return list.removeFirst(); }
}
