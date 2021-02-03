package programmers;

import java.util.Arrays;

public class order01 {
	public static void main(String args[]) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(array, commands);
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] command = new int[3];
		
		for(int i=0; i<commands.length; i++) {
			command = commands[i]; // {2, 5, 3}
			
			int[] splitedArray = Arrays.copyOfRange(array, command[0]-1, command[1]);
			Arrays.sort(splitedArray);
			answer[i] = splitedArray[command[2]-1];
		}
		
        return answer;
    }
}
