
class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class insertionAtPos {
    Node head; 
    void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; 
        }
    }

    void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        if(pos == 1 ) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int i = 1;
        while(temp.next != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode; 
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        insertionAtPos list = new insertionAtPos();
        list.insert(5);
        list.insert(4);
        list.insert(7);

        list.display();
        System.out.print("\n");

        list.insertAtPos(3, 2);

        list.display();
    }

}