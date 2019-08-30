package i_javaLang;

import java.io.Serializable;

public class ToStringTest {
	public static void main(String[] args) {
		//3. Card의 객체 생성
		// 단, 매개변수가 두개인 생성자를 이용해 DIAMOND,3으로 초기화
		Card c = new Card("DIAMOND",3);
		System.out.println(c);
		
		
		
		
		
		
	}
}

class Card implements Serializable{
	String kind;
	int number;
	
	//1. 매개변수가 두개인 생성자 생성
	Card(String kind,int number){
		this.kind = kind;
		this.number=number;
	}
	//2. 기본생성자를 만들라
//		단, 매개변수가 두개인 생성자를 이용해 SPADE,1로 초기화
	Card(){
		this("SPADE",1);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return kind +"," +number;
	}
	
	
	
	
	
}