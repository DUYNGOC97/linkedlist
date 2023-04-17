package linkedlist;

public class Test {

        public static void main(String[] args) {
            System.out.println("testing");
            MyLinkedList list = new MyLinkedList(10);
            list.addFirst(11);
            list.addFirst(12);
            list.addFirst(13);
            list.add(4,9);
            list.add(2,10);
            list.printList();
        }
    }

//