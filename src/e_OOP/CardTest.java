package e_OOP;

public class CardTest {
	public static void main(String[] args) {
		//1.Card의 너비를 출력
		System.out.println(Card.width);
		//2.Card의 높이를 출력
		System.out.println(Card.height);
		//3.Card클래스의 객체를 만들어라 변수명: cd1
		Card cd1 = new Card();
		//4.cd1의 문양을 Heart로 변경하라
		cd1.kind ="Heart";
		//5.cd1의 번호를 3으로 변경하라
		cd1.number=3;
		//6.Card클래스의 객체를 만들라 변수명: cd2
		Card cd2=new Card();
		//7.cd2의 문양을 CLOVER로 변경하라
		cd2.kind = "CLOVER";
		//8.cd2의 번호를 7로 변경하라
		cd2.number=7;
		//9.아래와 같이 출력하라
		//	cd1의 모양은 xx이고 숫자는 xx이고 너비는 xx이고 높이는 xx이다
		System.out.println("cd1의 모양은 " +cd1.kind +"이고 숫자는 " +cd1.number +"이고 너비는 " + cd1.width +"이고 높이는 " +cd1.height +"이다");
		//	cd2의 모양은 xx이고 숫자는 xx이고 너비는 xx이고 높이는 xx이다
		System.out.println("cd2의 모양은 " +cd2.kind +"이고 숫자는 " +cd2.number +"이고 너비는 " + cd2.width +"이고 높이는 " +cd2.height +"이다");
		//10.cd1의 너비를 50으로 높이를 80으로 변경하라
		cd1.width = 50;
		cd1.height = 80;
		//11.아래와 같이 출력하라
		//	cd1의 모양은 xx이고 숫자는 xx이고 너비는 xx이고 높이는 xx이다
		System.out.println("cd1의 모양은 " +cd1.kind +"이고 숫자는 " +cd1.number +"이고 너비는 " + cd1.width +"이고 높이는 " +cd1.height +"이다");
		//	cd2의 모양은 xx이고 숫자는 xx이고 너비는 xx이고 높이는 xx이다
		System.out.println("cd2의 모양은 " +cd2.kind +"이고 숫자는 " +cd2.number +"이고 너비는 " + cd2.width +"이고 높이는 " +cd2.height +"이다");
	}
}

class Card{
	// 카드의 너비를 저장할 수 있는 클래스변수 width를 선언하고 100의 값으로 초기화 
	static int width=100;
	// 카드의 높이를 저장할 수 있는 클래스변수 height를 선언하고 250의 값으로 초기화 
	static int height=250;
	// 카드의 종류를 저장할 수 있는 인스턴스변수 kind를 선언
	String kind;
	// 카드의 번호를 저장할 수 있는 인스턴스변수 number를 선언
	int number;
	
	void method(){
		int v=3; // 지역변수
	}
	
	static void method2(){
		
	}
	
}
