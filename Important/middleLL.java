class Solution1 {
    int getMiddle(Node head) {
        // Your code here.
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }
}


public Node findMiddleBrute(Node head) {
    int count = 0;
    Node temp = head;

    // Count total nodes
    while (temp != null) {
        count++;
        temp = temp.next;
    }

    int mid = count / 2;
    temp = head;

    // Traverse again to the middle
    for (int i = 0; i < mid; i++) {
        temp = temp.next;
    }

    return temp; // Middle node
}

public Node findMiddleViaArray(Node head) {
    Node[] nodes = new Node[1000]; // Assume max 1000 elements
    int i = 0;

    while (head != null) {
        nodes[i++] = head;
        head = head.next;
    }

    return nodes[i / 2]; // Middle element
}
