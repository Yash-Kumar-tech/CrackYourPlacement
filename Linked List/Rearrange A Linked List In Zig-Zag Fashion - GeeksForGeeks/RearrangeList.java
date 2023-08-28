public class RearrangeList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.addNode(2);
        head.addNode(6);
        head.addNode(8);
        head.addNode(7);
        head.addNode(3);
        head.addNode(4);
        
        System.out.print("Original List: ");
        head.display();

        rearrangeList(head);
        System.out.print("Zig-Zag List: ");
        head.display();
    }

    private static void rearrangeList(Node head) {
        boolean flag = true ;
        Node curr = head ;
        int temp ;
        while(curr != null && curr.next != null) {
            if(flag) {
                if(curr.val > curr.next.val) {
                    temp = curr.val ;
                    curr.val = curr.next.val ;
                    curr.next.val = temp ;
                }
            } else {
                if(curr.val < curr.next.val) {
                    temp = curr.val ;
                    curr.val = curr.next.val ;
                    curr.next.val = temp ;
                }
            }
            curr = curr.next ;
            flag = !(flag) ;
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