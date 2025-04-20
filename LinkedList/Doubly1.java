
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class Doubly1 {
    Node head;
    void constructDoublyLL(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;

        }
    }
    void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }

    }

    void deleteAtFirst() {
        if(head == null) {
            return ;
        }
        if(head.next == null) {
            head = null;
        }else {
            head = head.next;
            head.prev = null;
        }
    }

    void deleteAtLast() {
        if(head == null) {
            return ;
        }

        if(head.next == null) {
            head = null;
        }else {

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;

        }
    }

    void display() {
        Node temp = head;
        System.out.print("null <=> ");
        while(temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.print("null");
        
    }
    public static void main(String[] args) {
        Doubly1 list = new Doubly1();
        list.constructDoublyLL(5);
        //list.constructDoublyLL(3);
        //list.constructDoublyLL(2);

        //list.display();

        //list.insertAtFirst(6);
        //list.insertAtLast(6);
        //list.insertAtFirst(9);

        //list.deleteAtFirst();

        list.deleteAtLast();


        list.display();
    }
}