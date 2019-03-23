
public class Queue {
	
	Node head = null; //
	
	public Queue() {}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return head == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param newNode
	 */
	public void enqueue(Node newNode)
	{
		Node temp=head;
		if(head==null) {
			head=newNode;
			}
		else {
			
			while(temp.next==null) {
				temp=temp.next;
			}
			temp.setNext(newNode);
			
		};
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Node dequeue()
	{
		Node temp = head;
		head = head.next;
		temp = null;
		System.gc();
		return head;	
	}
}