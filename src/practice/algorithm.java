package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

public class algorithm {
	public static void main(String[] args) {
		//stack
		Stack<Character> stack = new Stack<>();
		stack.push('c');
		stack.push('a');
		System.out.println(stack.pop()); //최근에 추가된(top) 데이터 삭제
		System.out.println(stack.peek()); //최근에 추가된(top) 데이터 조회
		System.out.println(stack.empty()); //stack의 값이 비어있는지 확인, 비어있으면 true, 아니면 false
		System.out.println(stack.search('c')); //인자값으로 받은 데이터의 위치 반환
		
		//queue
		Queue<Integer> queue = new LinkedList<>();
		queue.add(2); // 성공하면 true 반환, 큐에 여유공간 없어서 실패하면 IllegalStateException을 발생 
		System.out.println(queue.add(1));
		System.out.println(queue.peek()); //첫번쨰 값을 참조
		System.out.println(queue.poll()); //queue의 첫번째 값을 반환하고 제거 비어있다면 null
		System.out.println(queue.remove()); //queue의 첫번째 값 제거
		queue.clear(); //queue 초기화
		
		//자바 hashmap key 값으로 정렬
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		testMap.put( 1, "apple");
		testMap.put( 4, "pineapple");
		testMap.put( 2, "orange");
		Object[] mapkey = testMap.keySet().toArray();
		Arrays.sort(mapkey);
		for (Integer nKey : testMap.keySet()) {
			System.out.println(testMap.get(nKey));
		}
		
		//자바 hashmap value 값으로 정렬
		Map<String, Integer> testMap2 = new HashMap<String, Integer>();
		testMap2.put("apple", 1);
		testMap2.put("pineapple", 4);
		testMap2.put("orange", 2);
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(testMap2.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		for(Entry<String, Integer> entry : list_entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//linked list
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.addFirst(2); //가장 앞에 데이터 추가
		linkedList.addLast(3); //가장 뒤에 데이터 추가
		linkedList.add(1, 4); //index 1뒤에 데이터 4 추가
		System.out.println(linkedList.removeFirst()); //가장 앞의 데이터 제거
		System.out.println(linkedList.removeLast()); //가장 뒤의 데이터 제거
		System.out.println(linkedList.remove(1)); //index 1 제거
		System.out.println(linkedList.size()); //list 사이즈
		System.out.println(linkedList.indexOf(4)); //1이 있는 index반환 없으면 -1
		linkedList.clear(); // 초기화
	}
}
