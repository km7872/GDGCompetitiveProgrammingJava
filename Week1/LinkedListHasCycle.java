package Week1;
// Define the Node class
class Node {
    int val;
    Node next;

    // Constructor for Node
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListHasCycle {

    /**
     * Function to detect if there is a cycle in the linked list.
     *
     * @param head The head node of the linked list. It represents the first node in the list.
     *             If the list is empty, this will be `null`.
     * @return Returns `true` if there is a cycle in the linked list, otherwise returns `false`.
     */
    public static boolean hasCycle(Node head) {
        // Code goes here :)
        return false;
    }

    public static void main(String[] args) {
        // Test Case 1: No Cycle
        // Create a linked list: 1 -> 2 -> 3 -> null
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        System.out.println(hasCycle(node1));  // Expected Output: false

        // Test Case 2: Cycle in the middle
        // Create a linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 2 (cycle between 4 and 2)
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Cycle

        System.out.println(hasCycle(node1));  // Expected Output: true

        // Test Case 3: Cycle at the end
        // Create a linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (cycle between 5 and 3)
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;  // Cycle

        System.out.println(hasCycle(node1));  // Expected Output: true

        // Test Case 4: Empty list
        System.out.println(hasCycle(null));  // Expected Output: false

        // Test Case 5: Single node with a cycle
        // Create a linked list: 1 -> 1 (cycle)
        Node node6 = new Node(1);
        node6.next = node6;  // Cycle (points to itself)

        System.out.println(hasCycle(node6));  // Expected Output: true
    }
}
