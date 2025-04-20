
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int val, Node next) {
        data = val;
        this.next = next;
    } 
}

public class basicLL {
    Node head;
    void constructLL(Node newNode) {
        if(head == null) {
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void printLL() {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        basicLL List = new basicLL();
        List.constructLL(new Node(10));
        List.constructLL(new Node(20));
        List.constructLL(new Node(30));

        List.printLL();
    }








    /*public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(10);
        LL.add(20);
        LL.add(30);

        for(int num : LL) {
            System.out.print(num + " -> ");
        }
        System.out.print("null");
    }*/
}