public class LinkedListAddtionForwardOrder {
	public int carry=0;
	public Node1 newHead = null;
	public Node1 add(Node1 h1, Node1 h2){
		//first we will make sure that both the Linked list has same no of nodes
		// to ensure that we will append 0 in front of shorter list
		int h1Len = getLength(h1);
		int h2Len = getLength(h2);
		if(h1Len>h2Len){
			int diff = h1Len-h2Len;
			while(diff>0){
				Node1 n = new Node1(0);
				n.next = h2;
				h2=n;
				diff--;
			}
		}
		if(h1Len<h2Len){ 			int diff = h2Len-h1Len; 			while(diff>0){
				Node1 n = new Node1(0);
				n.next = h1;
				h1=n;
				diff--;
			}
		}
		
		return addBackRecursion(h1, h2);
	}
	public Node1 addBackRecursion(Node1 h1, Node1 h2){
		if(h1==null && h2==null){
			return null;
		}
		addBackRecursion(h1.next, h2.next);
		int a = h1.data + h2.data + carry;
		carry=0;
		//System.out.println(a);
		if(a>=10){
			carry =1;
			a = a%10;
		}
		Node1 n = new Node1(a);
		if(newHead==null){
			newHead =n;
		}else{
			n.next = newHead;
			newHead = n;
		}
		//carry=0;
		return newHead;
	}
	public int getLength(Node1 head){
		int len=0;
		while(head!=null){
			len++;
			head = head.next;
		}
		return len;
	}
	public void display(Node1 head){
		Node1 currNode = head;
		while(currNode!=null){
			System.out.print("->" + currNode.data);
			currNode=currNode.next;
		}		
	}
	public static void main(String args[]){
		LinkedListAddtionForwardOrder l = new LinkedListAddtionForwardOrder();
		Node1 h1 = new Node1(4);
		h1.next= new Node1(5);
		h1.next.next = new Node1(1);
		h1.next.next.next = new Node1(4);
		System.out.print("First Number : ");
		l.display(h1);
		Node1 h2 = new Node1(5);
		h2.next= new Node1(2);
		System.out.print("\n Second Number : ");
		l.display(h2);
		Node1 x = l.add(h1, h2);		
		System.out.print("\n Addition : ");
		l.display(x);
	}
}
class Node{
	public int data;
	public Node1 next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}	