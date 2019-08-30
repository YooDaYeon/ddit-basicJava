package e_OOP;

public class ProductTest {
	public static void main(String[] args) {
		System.out.println(Init.action); //클래스 변수들 생성,초기화 후 클래스 초기화 블럭 실행
										 // 변수 로드 => 초기화블럭 20 => 100
		
		Init it=new Init(70);
		System.out.println(it.action2); //10 -> 200 -> 70
										//변수 로드 => 초기화블럭 => 생성자
		
		
		
		
		
		
		
		
	}
}

class Init{
	
	static int action=20;
	int action2=10;
	int a=5; //명시적 초기화
	
	Init(int action2){ //생성자를 이용한 초기화
		this.action2=action2;
	}
	
	static{  //클래스 초기화 블럭
		action =100;
	}
	
	{ // 인스턴스 초기화 블럭
		action2=200;
	}
	
	
	
	
}