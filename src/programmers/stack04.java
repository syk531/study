package programmers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class stack04 {
	public static void main(String args[]) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		solution(priorities, location);
	}
	
	public static int solution(int[] priorities, int location) {
		Queue<Integer> prioritiesQueue = new LinkedList<Integer>();
		Queue<Integer> indexQueue = new LinkedList<Integer>();
		Iterator<Integer> iter = null;
		int answer = 0;
		boolean positionMoved = false;
		
		for(int i=0; i<priorities.length; i++) {
			prioritiesQueue.offer(priorities[i]);
			indexQueue.offer(i); // {0, 1, 2, 3}
		}
		
		while(true) {
			positionMoved = false;
			
			iter = prioritiesQueue.iterator();
			
			while(iter.hasNext()) {
				if(prioritiesQueue.peek() < iter.next()) {
					prioritiesQueue.offer(prioritiesQueue.poll());
					indexQueue.offer(indexQueue.poll());
					positionMoved = true;
					
					break;
				}
			}
			
			if(!positionMoved) { //제일 앞에꺼 프린트
				answer++;
				prioritiesQueue.poll();
				if(indexQueue.poll() == location) {
					break;
				}
			}
		}
		
        return answer;
    }
}
