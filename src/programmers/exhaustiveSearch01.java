package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exhaustiveSearch01 {
	public static void main(String args[]) {
		int[] answers = {1,2,3,4,5};
		solution(answers);
	}
	
	public static int[] solution(int[] answers) {
        //1번 수포자 : 1, 2, 3, 4, 5 반복
		//2번 수포자 : 2, 1, 2, 3, 2, 4, 2, 5 반복 
		//3번 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 반복
		int[] people1 = {1, 2, 3, 4, 5};
		int[] people2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] people3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int[] score = new int[3];
		int answerNum = 0;
		
		for(int i=0; i<answers.length; i++) {
			answerNum = answers[i];
			
			//1번 수포자 체크
			if(answerNum == people1[i%5]) {
				score[0] = score[0]+1;
			}
			
			//2번 수포자 체크
			if(answerNum == people2[i%8]) {
				score[1] = score[1]+1;
			}
			
			//3번 수포자 체크
			if(answerNum == people3[i%10]) {
				score[2] = score[2]+1;
			}
		}
		
		int max=0;
		if(score[0] <= score[1]) {
			if(score[1] <= score[2]) {
				max = score[2];
			} else {
				max = score[1];
			}
		} else { //score[0] > score[1]
			if(score[0] <= score[2]) {
				max = score[2];
			} else {
				max = score[0];
			}
		}
		
		List<Integer> list = new ArrayList<Integer>(); 
		for(int i=0; i<score.length; i++) {
			if(score[i] >= max) {
				list.add(i+1);
			}
		}
		int[] answer = list.stream().mapToInt(i->i).toArray();
		Arrays.sort(answer);
		
        return answer;
    }
}
