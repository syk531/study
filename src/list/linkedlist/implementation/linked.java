package list.linkedlist.implementation;

public class linked {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addLast(5);
		numbers.addLast(10);
		numbers.addLast(15);
		numbers.addLast(20);
		numbers.addLast(30);
		System.out.println(numbers.indexOf(20));
	}
}
