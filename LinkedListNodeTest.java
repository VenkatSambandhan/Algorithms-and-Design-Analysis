class LinkedListNode
{
    public int data;
    public LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode(int data, LinkedListNode next) {
        this(data);
        this.next = next;
    }

    public LinkedListNode(int i, Object object, Object object2) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
        return toString(this);
    }

    public static String toString(LinkedListNode node)
    {
        if (node == null) return "";
        if (node.next == null) return String.valueOf(node.data);
        return toString(node.next) + node.data; 
    }
}

public class LinkedListNodeTest
{
    public static LinkedListNode addNumberLists(LinkedListNode n1, LinkedListNode n2, int carry){
        if (n1 == null && n2 == null){
            if (carry > 0) {
                return new LinkedListNode(carry);
            } else {
                return null;
            }
        } else if (n1 == null){
            int val = carry + n2.data;

            carry = val / 10;           

            LinkedListNode n = new LinkedListNode(val % 10);
            n.next = addNumberLists(n1,n2.next,carry);
            return n;
        } else if (n2 == null){
            int val = carry + n1.data;

            carry = val / 10;           

            LinkedListNode n = new LinkedListNode(val % 10);
            n.next = addNumberLists(n1.next,n2,carry);
            return n;
        } else {
            int val = n1.data + n2.data + carry;

            carry = val / 10;

            LinkedListNode n = new LinkedListNode(val % 10);
            n.next = addNumberLists(n1.next, n2.next, carry);
            return n;
        }
    }   

    public static void main(String[] args)
    {
//      LinkedListNode n1 = new LinkedListNode(3, new LinkedListNode(1, new LinkedListNode(5)));
//      LinkedListNode n2 = new LinkedListNode(4, new LinkedListNode(9, new LinkedListNode(2)));

//      LinkedListNode n1 = new LinkedListNode(3, new LinkedListNode(1, new LinkedListNode(5)));
//      LinkedListNode n2 = new LinkedListNode(4, new LinkedListNode(9, new LinkedListNode(7)));        

        LinkedListNode n1 = new LinkedListNode(93);
        LinkedListNode n2 = new LinkedListNode(72);

        LinkedListNode sum = addNumberLists(n1, n2, 0);

        System.err.println("n1=" + n1);
        System.err.println("n2=" + n2);
        System.err.println("sum=" + sum);

        int int1 = Integer.parseInt(n1.toString());
        int int2 = Integer.parseInt(n2.toString());
        int intSum = Integer.parseInt(sum.toString());

        if (int1 + int2 == intSum) {
            System.err.println("PASS");
        }
        else {
            System.err.println("FAIL");
        }

    }
}