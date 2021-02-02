package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class stack03 {
	public static void main(String args[]) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> queue = new LinkedList<Integer>();
		int answer = 0;
		int truck_weight = 0;
		int total_weight = 0;
		
		for(int i=0; i<truck_weights.length; i++) {
			while(true) {
				truck_weight = truck_weights[i];
				
				if(queue.isEmpty()) {
					queue.offer(truck_weight);
					total_weight = truck_weight;
					answer++;
					break;
				} else if(bridge_length == queue.size()) {
					total_weight = total_weight - queue.peek();
					queue.remove();
				} else {
					if(total_weight + truck_weight > weight) {
						queue.offer(0);
						answer++;
					} else {
						queue.offer(truck_weight);
						total_weight = total_weight + truck_weight;
						answer++;
						break;
					}
				}
			}
		}
		
		answer = answer + bridge_length;
        
        return answer;
    }
}
