/**
 * MultiplyLinkedLists
 */
public class MultiplyLinkedLists {

    public static void main(String[] args) {
        Node num1 = new Node(3) ;
        num1.addNode(2);
        num1.addNode(1);
        
        Node num2 = new Node(1);
        num2.addNode(2);

        System.out.print("Num1: ") ;
        num1.display();

        System.out.print("Num2: ") ;
        num2.display();

        long prod = nultiplyLists(num1, num2) ;
        System.out.println("Product = " + prod) ;
    }

    private static long nultiplyLists(Node num1, Node num2) {
        long N = 1000000007;
        long n1 = 0, n2 = 0 ;
        while(num1 != null || num2 != null) {
            if(num1 != null) {
                n1 = ((n1) * 10) % N + num1.val ;
                num1 = num1.next ;
            }
            if(num2 != null) {
                n2 = (n2 * 10) % N + num2.val ;
                num2 = num2.next ;
            }
        }
        return ((n1 % N) * (n2 % N)) % N;
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