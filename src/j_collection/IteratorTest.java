package j_collection;

import java.util.*;


public class IteratorTest {
	public static void main(String[] args) {
		//Iterator 단방향 이동만 가능
		//Enumertation는 컬렉션이 나오기전에 사용되던 Iterator의 구버전이라고 생각하면 됨
		
		List<String> list = new ArrayList<String>();
		
		//1. list에 "123"추가
		list.add("123");
		//2. list에 "456"추가
		list.add("456");
		//3. list에 "789"추가
		list.add("789");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){// 다음값이 있는가?
			System.out.println(it.next());
			it.remove();
		}
		
		//ListIterator
		//Iterator의 단방향을 보완하기 위해 나옴
		//List에서만 사용할 수 있음
		ListIterator<String> li = list.listIterator();
		li.hasNext();
		System.out.println(li.next());
		li.hasPrevious();
		System.out.println(li.previous());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
