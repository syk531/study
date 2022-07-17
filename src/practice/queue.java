package practice;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1); //추가
		queue.add(3); //추가
		queue.add(2);
		queue.poll(); //첫번째값 반환하고 제거 비어있으면 null
		queue.remove(); //첫번째값 제거
		queue.peek(); //첫번째값 참조
		queue.clear();
	}
}
