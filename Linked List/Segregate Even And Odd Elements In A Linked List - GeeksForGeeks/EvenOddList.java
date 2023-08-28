
public class EvenOddList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.addNode(11);
        head.addNode(10);
        head.addNode(5);
        head.addNode(8);
        head.addNode(7);

        System.out.print("Original List: ");
        head.display();

        rearrangeList(head);
        
        System.out.print("Modified List: ");
        head.display();
    }

    private static void rearrangeList(Node head) {
        Node end = head ;
        Node prev = null ;
        Node curr = head ;
        while(end.next != null) {
            end = end.next ;
        }

        Node newEnd = end ;

        while(curr.val % 2 != 0 && curr != end) {
            newEnd.next = curr ;
            curr = curr.next ;
            newEnd.next.next = null ;
            newEnd = newEnd.next;
        }

        if(curr.val % 2 == 0) {
            head = curr ;
            while(curr != end) {
                if(curr.val % 2 == 0) {
                    prev = curr; 
                    curr = curr.next ;
                } else {
                    prev.next = curr.next ;
                    curr.next = null ;
                    newEnd.next = curr ;
                    newEnd = curr ;
                    curr = prev.next ;
                }
            }
        } else {
            prev = curr ;
        }

        if(newEnd != end && end.val % 2 != 0) {
            prev.next = end.next ;
            end.next = null ;
            newEnd.next = end ;
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