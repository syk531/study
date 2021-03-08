package leetcode;

public class linkedListAddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ListNode node = new ListNode(3);
		ListNode node2 = new ListNode(4, node);
		ListNode node3 = new ListNode(2, node2);
		
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(6, node4);
		ListNode node6 = new ListNode(5, node5);
		
		addTwoNumbers(node3, node6);
		
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyNode = new ListNode(0);
        ListNode currNode1 = l1, currNode2 = l2, currNode3 = dummyNode;
        int carry = 0;
        int val1 = 0;
        int val2 = 0;
        
        while(currNode1 != null || currNode2 != null || carry > 0) {
        	ListNode node = new ListNode();
        	val1 = (currNode1 != null) ? currNode1.val : 0;
        	val2 = (currNode2 != null) ? currNode2.val : 0;
        	node.val = val1 + val2 + carry;
            carry = node.val / 10;
            node.val = node.val % 10;
            currNode3.next = node; 
            currNode3 = currNode3.next;
            
            if(currNode1 != null) {
                currNode1 = currNode1.next;
            }
            if(currNode2 != null) {
                currNode2 = currNode2.next;
            }
        }
        
        return dummyNode.next;
    }

}

 
