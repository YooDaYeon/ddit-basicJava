package j_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {
		//1. Set객체를 만들라 set
		Set<Integer> set = new HashSet<Integer>() ;
		
		//2. set변수에 0~10사이의 랜덤한 정수값을 추가하라
		// 반복횟수는 20
		for(int i=0; i<20; i++){
			boolean result = set.add((int)(Math.random()*45));
			System.out.println(result);
		}
		
		System.out.println(set);
		ArrayList<Integer> arrList = new ArrayList<Integer>(set);
		Collections.sort(arrList);
		System.out.println(arrList);
	}
}
