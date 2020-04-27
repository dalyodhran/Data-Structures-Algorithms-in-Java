public class SingleLinkedListDemo {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<String>();
        list.addFirst("is");
        list.addFirst("a ");
        list.addFirst("sentance ");
        list.addFirst("in ");
        list.addFirst("a ");
        list.addFirst("linked ");
        list.addFirst("list ");
        list.addFirst(".");
        list.addLast("This ");

        SingleLinkedList<Integer> list1 = new SingleLinkedList<Integer>();
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        list1.addFirst(4);
        list1.addFirst(5);
        list1.addFirst(6);
        list1.addFirst(7);
        list1.addFirst(8);
        list1.addLast(9);

        System.out.println(list.equals(list1));
        // while(!list.isEmpty()) {
        //     System.out.print(list.removeFirst());
        // }
    }
}
