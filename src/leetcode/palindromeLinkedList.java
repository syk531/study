package leetcode;

public class palindromeLinkedList {
	public static void main(String args[]) {
		ListNode node = new ListNode(2);
		ListNode node2 = new ListNode(1, node);
		
		isPalindrome(node2);
	}
	
	public static boolean isPalindrome(ListNode head) {
		ListNode node = head;
		String str = "";
		String strReverse = "";
		
		while(node != null) {
			str = str + node.val;
			strReverse = node.val + strReverse;
			node = node.next;
		}
		
		if(str.equals(strReverse)) {
			return true;
		} else {
			return false;
		}
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
