package j_collection;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(new Integer(5));
		list1.add(new Integer(2));
		list1.add(3);
		list1.add(1);
		list1.add(4);
		
		System.out.println(list1); //toString메서드가 오버라이딩 되어있어서 값이 나옴
		
		//정렬해주는 메서드
		Collections.sort(list1);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1, 4));
		System.out.println(list2);
		//delete
		System.out.println(list2.remove(new Integer(1))); //지우면 true 값없어서 못지우면 false
		
		//select
		System.out.println(list2.get(1));
		
		//insert
		list2.add(1, 15); //2 15 3 4
		System.out.println(list2);
		
		//update
		list2.set(2, 22); //2번방 값을 22로 변경
		System.out.println(list2);
		
		System.out.println(list1.contains(4));
		System.out.println(list1.containsAll(list2));
		
		
		
		
		
		
	}
}
