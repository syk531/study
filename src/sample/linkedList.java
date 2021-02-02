package sample;

import java.util.LinkedList;

public class linkedList {
	public static void main(String args[]) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(1);
		linkedList.addFirst(4);
		linkedList.add(1, 5);
		linkedList.addLast(9);
		
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.remove(1);
		
		System.out.println(linkedList.contains(5));
		System.out.println(linkedList.indexOf(5));
	}
}
