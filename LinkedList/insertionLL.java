class Node {
    int data;
    Node next;

    Node(int val, Node next) {
        data = val;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertionLL {
    Node head;
    void constructLL(Node newNode) {
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
    void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }

        
    }

    void delete(int data) {
        if(head == null) {
            return ;
        }
        if(head.data == data) {
            head = head.next;
            return ;
        }

        Node temp = head;
        while(temp.next.data != data){
            temp = temp.next;
        }
        temp.next = temp.next.next;

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
        insertionLL list = new insertionLL();
        list.constructLL(new Node(6));
        list.constructLL(new Node(8));
        list.constructLL(new Node(7));
        //list.display();

        list.insert(4);
        list.insert(5);

        list.display();
        System.out.println();

        list.delete(8);

        list.display();

    }
}