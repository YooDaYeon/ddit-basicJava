package e_OOP;

public class TvTest {
	public static void main(String[] args) {
		//ctrl + alt + 방향키 : 방향대로 복사
		//alt + 방향키 : 방향대로 이동
		Tv.color="black";
		System.out.println(Tv.color);
		Tv.changeColor();
		System.out.println(Tv.color);
		
		Tv t = new Tv();
		t.channel =20;
		t.channelUp();
		System.out.println(t.channel);
		
		System.out.println(t.power);
		t.power();
		System.out.println(t.power);
	}
}

class Tv{
	// 멤버변수
	static String color; //클래스 변수
	boolean power; //인스턴스 변수
	int channel; //인스턴스 변수
	
	static void changeColor(){ //색상을 변경
		int a=10; //지역변수 (지역 안에서만 사용 가능)
		color="yellow";
	}
	
	void power(){ //전원
		//꺼져있으면 켜지게, 켜져있으면 꺼지게
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
	

}
