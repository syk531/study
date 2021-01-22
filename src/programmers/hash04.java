package programmers;

import java.util.HashMap;
import java.util.Map;

public class hash04 {
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"}; 
		int[] plays = {500, 600, 150, 800, 2500};
		int[] a = solution(genres, plays);
		
		System.out.println(a);
	}
	
	public static int[] solution(String[] genres, int[] plays) {
		Map<String, Music> musicMap = new HashMap<String, Music>();
		
		String genresName = "";
		int playCnt = 0;
		
		for(int i=0; i<genres.length; i++) {
			genresName = genres[i];
			playCnt = plays[i];
					
			if(musicMap.containsKey(genresName)) {
				Music music = musicMap.get(genresName);
				music.totalPlayCnt =+ playCnt;
				music.play.put(i, playCnt);
			} else {
				Music music = new Music(genresName, playCnt, i);
				musicMap.put(genresName, music);
			}
		}
		
        int[] answer = {};
        return answer;
    }

}

class Music {
	String genresName;
	int totalPlayCnt;
	Map<Integer, Integer> play; //유니크번호, 플래이횟수
	
	public Music(String genresName, int playCnt, int uniqueNum) {
		this.genresName = genresName;
		this.totalPlayCnt =+ playCnt;
		this.play.put(uniqueNum, playCnt);
	}
}
