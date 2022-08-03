public class TestDemo{
	// Representing a node of the single likedlist 
	private class Node {
	    int data;
		Node next;
		Node(int input){
		this.data = input;
		this.next = null;
		
		}
	}
	// now Representing the head and tail of singly linked list
	public Node head = null;
	public Node tail = null;
	
	
	// add() node will add new node to the list
	public void addNode(int data){
	        // create a new Node
			Node newNode = new Node(data);
			// check if the list empty , 
			if(head == null){
				 // if list is empty , both head and tail will point to new node 
				 
				 head = newNode;
				 tail = newNode;
				 
			}
			else{
				 // new Node will added after tail such that tail's next will point to newNode 
				 tail.next = newNode;
				 // newNode will become new tail of the lis tail
				 tail = newNode;
				 
	}
	}
	
	
	private void display(){
		// Node current will point to head
		
	     Node current = head;
		 if(head == null){
			 System.out.println("list is empty");
			 return;
		 }
		 System.out.println("Node of singly linkedlist:");
		 
		 while(current != null){
			 // print each node by increasing pointer
			 
				System.out.print(current.data+" -> ");
				current = current.next;
		 }
		 System.out.println();
		 
	}
	 
		 
	
	
	
	 public static void main(String [] args){
		 TestDemo t = new TestDemo();
		 t.addNode(20);
		 t.addNode(30);
		 t.addNode(40);
		 t.addNode(50);
		 t.addNode(60);
		 t.display();
		 
		
		  
	 }
}