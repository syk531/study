package leetcode;

import java.util.Iterator;
import java.util.LinkedList;

public class removeNthFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head;
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(currNode != null) {
            list.add(currNode.val);
            currNode = currNode.next;
        }
        
        list.remove(list.size() - n);
        
        Iterator<Integer> iter = list.iterator();
        currNode = head;
        while(iter.hasNext()) {
            ListNode node = new ListNode(iter.next());
            currNode.next = node;
            currNode = currNode.next;
        }
        
        return head.next;
    }
}
