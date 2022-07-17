package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class test02 {
	public static void main(String args[]) {
		String[] grades = {"DS7651 A0", "CA0055 D+", "AI5543 C0", "OS1808 B-", "DS7651 B+", "AI0001 F", "DB0001 B-", "AI5543 D+", "DS7651 A+", "OS1808 B-"};
		
		solution(grades);
	}
	
	public static String[] solution(String[] grades) {
		//등급으로 소팅
		Arrays.sort(grades, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return getGradeRank(o2.substring(7)) - getGradeRank(o1.substring(7));
			}
		});;
		
		//map에 담기 key : DS7651, val : A0
		String[] grade = new String[2];
		String gradeNm = "";
		LinkedHashMap<String, String> gradeMap = new LinkedHashMap<String, String>();  
		for(int i=0; i<grades.length; i++) {
			grade = grades[i].split(" ");
			gradeNm = grade[0];
			if(!gradeMap.containsKey(gradeNm)) {
				gradeMap.put(gradeNm, grade[1]);
			}
		}
		
		//map -> array 변환
		String[] key = gradeMap.keySet().toArray(new String[gradeMap.size()]);
		String[] value = gradeMap.values().toArray(new String[gradeMap.size()]);

        String[] answer = new String[gradeMap.size()];
		for(int i=0; i<gradeMap.size(); i++) {
			answer[i] = key[i] + " " + value[i];
		}
		
        return answer;
    }
	
	public static int getGradeRank(String grade) {
		int rank = 0;
		switch (grade) {
			case "A+": 	rank=12;
						break;
			case "A0": 	rank=11;
						break;
			case "A-": 	rank=10;
						break;	
			case "B+": 	rank=9;
						break;
			case "B0": 	rank=8;
						break;
			case "B-": 	rank=7;
						break;
			case "C+": 	rank=6;
						break;
			case "C0": 	rank=5;
						break;
			case "C-": 	rank=4;
						break;
			case "D+": 	rank=3;
						break;
			case "D0": 	rank=2;
						break;
			case "D-": 	rank=1;
						break;
			case "F": 	rank=0;
						break;
			
		}
		
		return rank;
	}
}
