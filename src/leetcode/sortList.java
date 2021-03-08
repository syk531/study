package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class sortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode sortList(ListNode head) {
		HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        
        if(head == null) {
            return head;
        }
        
        ListNode curNode = head;
        while(curNode != null) {
            map.put(curNode, curNode.val);
            curNode = curNode.next;
        }
        
        List<Entry<ListNode, Integer>> listEntry = new ArrayList<Entry<ListNode, Integer>>(map.entrySet());
        Collections.sort(listEntry, new Comparator<Entry<ListNode, Integer>>() {
            public int compare(Entry<ListNode, Integer> obj1, Entry<ListNode, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        
        int length = listEntry.size();
        for(int i=0; i<length-1; i++) {
            listEntry.get(i).getKey().next = listEntry.get(i+1).getKey();
        }
        
        listEntry.get(length-1).getKey().next = null;
        
        return listEntry.get(0).getKey();
    }

}
