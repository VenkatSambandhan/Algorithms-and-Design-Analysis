

public class LinkedListAddtionReverseOrder {
	public Node1 add(Node1 h1, Node1 h2){
		int carry = 0;
		Node1 newHead = null;          // output/result
		Node1 curr=null;               //stores the recent digit of the output calculated
		while(h1!=null && h2!=null){
			int a = h1.data;
			int b = h2.data;
			int total = a+b+carry;
			if(total>=10){
				carry = 1;
				total = total-10;
			}
			if(newHead==null){
				newHead = new Node1(total);
				curr = newHead;
			}else{
				Node1 n = new Node1(total);
				curr.next = n;
				curr = curr.next;
			}
			h1=h1.next;
			h2=h2.next;
		}
		while(h1!=null){                  // if there are more digits in h1
			int x= h1.data + carry;
			Node1 n = new Node1(x);
			curr.next = n;
			curr = curr.next;
			h1=h1.next;
			carry=0;
		} 
		while(h2!=null){                     // if there are more digits in h2
			int x= h2.data + carry;
			Node1 n = new Node1(x);
			curr.next = n;
			curr = curr.next;
			h2=h2.next;
			carry=0;
		}
		if(carry>0){                      // not needed I guess
			Node1 n = new Node1(1);
			curr.next = n;
			curr = curr.next;
		}
		return newHead;
	}
	public void display(Node1 head){
		Node1 currNode = head;
		while(currNode!=null){
			System.out.print("" + currNode.data);
			currNode=currNode.next;
		}
	}
	public void displayReverse(Node1 head){
		Node1 currNode = head;
		if(head==null){
			return;
		}
		display(head.next);
		System.out.print(head.data);
	}
	public static void main(String args[]){
		LinkedListAddtionReverseOrder l = new LinkedListAddtionReverseOrder();
		Node1 h1 = new Node1(1);
		h1.next= new Node1(9);
		h1.next.next = new Node1(0);
		h1.next.next.next = new Node1(0);
		System.out.print("First Number in REVERSE order: ");
		l.display(h1);
		Node1 h2 = new Node1(0);
		h2.next= new Node1(1);
		System.out.print("\n Second Number in REVERSE order : ");
		l.display(h2);
		Node1 x = l.add(h2, h1);
		System.out.print("\n Addition in REVERSE order : ");
		l.display(x);
		System.out.print("\n Actual Result in FORWARD ORDER  : ");
		l.displayReverse(x);
	}
}
class Node1{
	public int data;
	public Node1 next;
	public Node1(int data){
		this.data = data;
		this.next = null;
	}
}	
