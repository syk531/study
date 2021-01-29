package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
				music.totalPlayCnt = music.totalPlayCnt + playCnt;
				music.play.put(i, playCnt);
			} else {
				Music music = new Music(genresName, playCnt, i);
				musicMap.put(genresName, music);
			}
		}
		
		Music[] musicArr = new Music[musicMap.entrySet().size()];
		int musicArrIndex=0;
		for(Map.Entry<String, Music> entry : musicMap.entrySet()) {
			musicArr[musicArrIndex] = entry.getValue();
			musicArrIndex++;
		}
		
		Arrays.sort(musicArr, Collections.reverseOrder());
		ArrayList<Integer> answerList = new ArrayList<>();
		
		for(int i=0; i<musicArr.length; i++) {
			for(int j=0; j<musicArr[i].play.size(); j++) {
				//젇렬
				List<Entry<Integer, Integer>> playList = new ArrayList<Entry<Integer, Integer>>(musicArr[i].play.entrySet());
				
				Collections.sort(playList, new Comparator<Entry<Integer, Integer>>() {
					@Override
					public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
						return o1.getValue().compareTo(o2.getValue());
					}
				});
				
				for(int k=0; k<playList.size(); k++) {
					answerList.add(playList.get(k).getKey());
					
					if(k==1) {
						break;
					}
				}
			}
		}

        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++) {
        	answer[i] = answerList.get(i);
        }
        return answer;
    }

}

class Music implements Comparable {
	String genresName = "";
	int totalPlayCnt = 0;
	Map<Integer, Integer> play = new HashMap<Integer, Integer>(); //고유번호, 플래이횟수
	
	public Music(String genresName, int playCnt, int uniqueNum) {
		this.genresName = genresName;
		this.totalPlayCnt =+ playCnt;
		this.play.put(uniqueNum, playCnt);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Music music = (Music) o;

		if(this.totalPlayCnt < music.totalPlayCnt) {
			return -1;
		} else if(this.totalPlayCnt == music.totalPlayCnt) {
			return 0;
		} else {
			return 1;
		}
	}
}


