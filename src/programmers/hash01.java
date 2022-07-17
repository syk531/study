package programmers;

import java.util.PriorityQueue;

public class hash01 {
	public static void main(String args[]) {
		hash01 h = new hash01();
		int[] scoville = {1, 2, 3, 9, 10, 12};
		h.solution(scoville, 7);
	}
	
	public int solution(int[] scoville, int K) {
        int answer = 0;
        int minScoville = 0;
        int secondMinScoville = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
 
        for(int i : scoville) {
            queue.add(i);
        }
        
        while(true) {
        	minScoville = queue.poll();
        	
        	if(minScoville >= K) {
            	break;
            } else if(queue.size() == 0) {
            	answer = -1;
            	break;
            }

            secondMinScoville = queue.poll();
            queue.add(minScoville + (secondMinScoville * 2));
            answer++;
        }
        
        return answer;
    }
}
