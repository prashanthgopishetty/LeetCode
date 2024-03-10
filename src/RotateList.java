/**
 * Definition for singly-linked list.
 **/
 class RotateListNode {
      int val;
      RotateListNode next;
     RotateListNode() {}
      RotateListNode(int val) { this.val = val; }
      RotateListNode(int val, RotateListNode next) { this.val = val; this.next = next; }
  }
 
public class RotateList {
	public static void main(String[] args) {
		RotateListNode rln5 = new RotateListNode(5);
		RotateListNode rln4 = new RotateListNode(4, rln5);
		RotateListNode rln3 = new RotateListNode(3, rln4);
		RotateListNode rln2 = new RotateListNode(2, rln3);
		RotateListNode rln1= new RotateListNode(1, rln2);
		RotateList s = new RotateList();
		RotateListNode res = s.rotateRight(rln1, 2);
		System.out.println(res.val);
		
	}
	
	public RotateListNode rotateRight(RotateListNode head, int k) {
		if(head == null || head.next == null) {
			return head;
		}
        int length =1;
        RotateListNode current = head;
        while(current.next != null){
            current = current.next;
            length++;
        }
        int rem = k%length;
        for(int i=0; i< length-rem; i++){
        	RotateListNode temp = head;
            head = head.next;
            temp.next = null;
            current.next = temp;
            current = current.next;
            
            head = head.next;

        }
        return head;
    }
}