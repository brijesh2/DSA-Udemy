package dsa.linkedlist;

public class main {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList(4);
        //ml.printAll();
        ml.appendNode(5);
        ml.printAll();
        ml.prependNode(3);
        ml.printList();
        ml.printAll();

    }
}
