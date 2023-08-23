public class SortLinkedList {
    public static void main(String[] args) {
        Node head = new Node(0) ;
        head.addNode(1);
        head.addNode(0);
        head.addNode(2);
        head.addNode(1);
        head.addNode(1);
        head.addNode(2);
        head.addNode(1);
        head.addNode(2);
        System.out.println("Original Linked List: ");
        head.display();
        sortList(head) ;
        System.out.println("Sorted Linked List: ");
        head.display();
    }

    private static void sortList(Node head) {
        int[] freq = {0, 0, 0} ;
        Node tmp = head ;
        while(tmp != null) {
            freq[tmp.val]++ ;
            tmp = tmp.next ;
        }
        tmp = head ;
        int i = 0 ;
        while(tmp != null) {
            if(freq[i] == 0) {
                i++ ;
            } else {
                tmp.val = i ;
                freq[i]-- ;
                tmp = tmp.next ;
            }
        }
    }
}

class Node {
    int val ;
    Node next ;

    public Node(int val) {
        this.val = val;
        this.next = null ;
    }
    
    public void addNode(int val) {
        Node newNode = new Node(val) ;
        Node tmp = this ;
        while(tmp.next != null) {
            tmp = tmp.next ;
        }
        tmp.next = newNode ;
    }

    public void display() {
        Node tmp = this ;
        while(tmp.next != null) {
            System.out.print(tmp.val + " -> ");
            tmp = tmp.next ;
        }
        System.out.println(tmp.val);
    }
}
