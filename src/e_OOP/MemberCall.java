package e_OOP;

public class MemberCall {

	int iv = 10;
	static int cv=20;
	
	int iv2=cv;
	
	static int cv2=cv; //클래스변수끼리 같이 로드되기에 수행 가능
	//static int cv2=iv;//왼쪽이 먼저 선언되었지만 인스턴스는 아직이기에 빨간불
	
	static void staticMethod(){
		System.out.println(cv); //클래스변수와 메서드는 같이 로드되기에 같이 사용가능
	}
	
	void instanceMethod(){
		System.out.println(cv);
		System.out.println(iv); //인스턴스화 된 상태는 메모리에 모두 올라간 상태라 클래스변수,메서드와 인스턴스화 한것 모두 사용 가능
	}
	
	static void staticMethod2(){
		cv = 200;
		staticMethod();
		
	}
	
	void instanceMethod2()
	{
		
	}
	
	
	
}
