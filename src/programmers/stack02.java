package programmers;

import java.util.ArrayList;

public class stack02 {
	public static void main(String args[]) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		solution(progresses, speeds);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] second = new int[progresses.length];
		for(int i=0; i<progresses.length; i++) {
        	int s = (int) Math.ceil((100 - progresses[i]) / (double)speeds[i]);
        	second[i] = s;
        }
		
		ArrayList<Integer> answerList = new ArrayList<>();
		int date = 0;
		int count = 0;
		for(int i=0; i<second.length; i++) {
			count++;
			if(count == 1) {
				date = second[i];
			}
			
			if(i == second.length-1 || date < second[i+1]) {
				answerList.add(count);
				count = 0;
			}
			
		}
		
		int[] answer = answerList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
