package f_OOP2;

public class OOP2_Basic {
	public static void main(String[] args) {
		/*
		1. 상속(~은 ~이다) : is a
		  - 기본 클래스를 재사용해 새로운 클래스를 작성
		  - 적은 야으이 코드로 새로운 클래스를 작성할 수 있음
		  - 새로 작성하고자 하는 클래스의 뒤에 상속받고자 하는 클래스의 이름을 
		  	키워드 'extends'와 함께 써주기만 하면 됨
		  	class Parent{} 부모가 먼저 존재해야 자식 생성 가능
		  	class Child extends Parent{}
		  - 상속해주는 클래스를 '조상클래스', 상속받는 클래스를 '자손클래스'라 함
		    : 조상클래스 - 부모클래스, 상위클래스, 기반클래스
		    : 자손클래스 - 자식클래스, 하위클래스, 파생된클래스
		    
		  - 멤버만 상속됨
		  - 자손클래스의 멤버 개수는 조상클래스보다 항상 같거나 많음 
		  	
		2. 포함(~은 ~을 포함하고 있다) : has a
		  - 상속 이외에 클래스르를 재사용하는 또다른 방법
		  - 한 클래스의 멤버변수로 다른 클래스를 선언하는 방법
		  
		3. toString()
		  - 인스턴스의 문자열을 반환할 목적으로 정의
		  - 참조변수를 출력하면 참조변수가 가리키고 있는 인스턴스의 toString()을 호출 
		  - System.out.println(c); => System.out.println(c.toString());
		  
		4. 단일상속
		  - 자바에서는 단일상속만 가능 
		    class TVCR extends TV,VCR{ //표현 불가
		    }
		    
		  - TV와 VCR에 동일명의 method가 있다면 어떤 것을 상속받을지 알 수 없음
		  - VCR의 method명을 바꾼다면 그동안 VCR의 method를 사용하던 부분들을 모두 수정해 주어야 함
		  - 클래스간의 관계가 보다 명확해지고 코드를 더욱 신뢰할 수 있게 만들어 줌
		  
		5. Object클래스(모든 클래스의 조상)
		  - 모든 클래스의 상속 계층도 제일 위에 위치하는 조상 클래스
		  - 다른 클래스로부터 상속받지 않는 클래스는 자동으로 Object클래스를 상속 받음
		    class Tv{
		    
		    }
		    
		    * 컴파일 후 *
		    class Tv extends Object{
		    	 TV(){
		    	 	super(); //생성자 내부에서 부모생성자를 호출할 때 사용
		    	 }
		    }
		  
		  - 모든 클래스들은 Object클래스를 상속받음
		  - toString(), equals()와 같은 메서드들을 따로 정의하지 않고 사용한 것은
		    Object클래스에 정의된 것이기 때문
		  
		 6. 오버라이딩(override)
		   - 조상클래스로부터 상속받은 메서드의 내용을 재정의 하는 것
		   - 오버라이딩을 위한 조건 (선언부는 동일해야 함)
		     : 오버라이딩 하는 조상클래스의 메서드와 메서드명이 같아야함
		         매개변수의 개수가 같아야 함
		         매개변수의 타입이 같아야 함
		         리턴타입이 같아야 함
		   - 조상클래스의 메서드를 자손 클래스에서 오버라이딩 할 때 접근제어자를 조상 클래스의 메서드보다 좁은 범위로 설정 못함
		      예외) 조상클래스의 메서드보다 많이 선언할 수 없음
		   - 인스턴스 멤버를 클래스 멤버로 또는 그 반대로 변경할 수 없음         
		           
		 7. super.            - this. : 지역변수와 인스턴스변수를 구분
		   - 자식클래스의 멤버와 조상클래스의 멤버가 중복 정의되어 있을 때 서로 구별을 위해 사용    
		   - 조상멤버와 자신의 멤버를 구분하는데 사용한다는 점을 제외하고는 this와 근본적으로 같음
		     자식의 인스턴스 내에서만 사용 가능
		     
		 8. super() - 자식클래스의 생성자에서 부모클래스의 생성자를 호출할 때 사용
		   - this()와 마찬가지로 super() 역시 생성자 호출임
		   - this()는 같은 클래스의 다른 생성자를 호출
		     super()는 부모클래스의 생성자를 호출
		   - 생성자의 첫 줄에는 super()를 호출해야 함
		    
		 9. 제어자
		   - 클래스, 메서드, 변수의 선언부에 사용됨
		   - 접근제어자와 그 외 제어자
		   - 접근제어자 : private, default, protected, public
		       그외제어자 : static, final, abstract,...
		   - 접근제어자를 제일 왼쪽에 많이 둠
		   - static(클래스의, 공통적인)
		     : 클래스변수, 클래스메서드, 클래스초기화블럭
		     : 클래스변수
		       - 인스턴스에서 공통적으로 사용
		       - 클래스명.변수명 => 인스턴스 생성없이 호출
		       - 클래스가 method Area에 로드될 때 생성
		       
		   - final(마지막의, 변경할 수 없는)
		     : 변수에 사용 시 변경할 수 없는 상수가 됨
		     : 메서드에 사용 시 오버라이딩 할 수 없음
		     : 클래스에 사용 시 상속을 할 수 없는 클래스가 됨 = 다른 클래스의 조상이 될 수 없음
		    
		   - abstract(추상의,미완성의)
		     : 클래스에 사용 시 추상클래스가 됨 => 추상메서드를 포함하고 있는 클래스
		     : 메서드에 사용 시 추상메서드가 됨 => 구현부가 없는 메서드 void method();
		     
		10. 접근제어자
		  - private : 같은 클래스에서만 접근 가능
		  - default : 같은 패키지내에서만 접근 가능
		  - protected : 같은 패키지 + 다른 패키지의 자손 클래스
		  - public : 접근제한 없음
		  - 클래스에는 public과 default만 사용가능
		  - 메서드와 변수에는 모두 사용 가능
		  
		11. 캡슐화
		  - 접근제어자를 사용하는 이유
		    : 외부로부터 데이터를 보호하기 위해
		    : 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해 사용
		    
		12. 생성자의 접근제어자
		  - 인스턴스의 생성을 제한할 수 있음
		  - 생성자의 접근제어자를 private으로 지정
		    : 외부에서 생성자에 접근할 수 없으므로 인스턴스의 생성을 제한할 수 있음
		    : 다른클래스의 조상이 될 수 없음
		    : 상속을 할 수 없는 클래스라서 final을 추가해 상속할 수 없는 클래스임을 알리는 것이 좋음
		    
		13. 다형성(polymorphism)
		  - 여러가지 형태를 가질 수 있는 능력
		  - 부모타입의 참조변수로 자손타입의 인스턴스를 참소할 수 있음
		      자손타입의 참조변수로 부모타입의 인스턴스를 참조할 수 없음
		  
		14. 참조변수의 형변환
		  - 서로 상속관계에 있는 클래스에서만 형변환이 가능
		  - 자손타입 -> 조상타입(up-casting) : 형변환 생략 가능
		  - 조상타입 -> 자손타입(down-casting) : 형변환 생략 불가
		      
		15. instanceof연산자
		  - 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용    
		  - 연산결과가 true이면 참조변수가 검사한 타입으로 형변환이 가능  
		  - 클래스메서드는 클래스변수처럼 참조변수의 타입에 영향을 받음
		  - 참조변수의 타입에 영향을 받지 않는 것은 인스턴스 메서드 뿐
		  
		16. 매개변수의 다형성
		  - 참조변수의 다형적인 특징은 메서드의 매개변수에도 적용됨  
		  
		17. 여러객체배열, Vector
		  - 배열을 사용할 경우 전체 크기를 한번정하면 변경할 수 없음
		    이를 Vector클래스를 이용해 해결 가능
		  - 동적으로 크기가 관리되는 객체배열
		  
		  Vector() : 10개의 객체를 저장할 수 있는 Vector인스턴스 생성
		  add()    : Vector에 객체를 추가
		  remove() : Vector에서 객체를 제거
		  boolean isEmpty(): Vector가 비어 있는지 검사
		  int size()   : 저장된 객체의 개수 반환
		  Object get(int index) : index번째 방의 객체 반환, 자료형이 Object라 down-casting해서 사용해야함
		  
		18. 추상클래스 (abstract class)
		  - 추상클래스 : 미완성된 메서드를 포함하고 있다는 의미
			  abstract class 클래스명{
			  
			  }
		  - 추상메서드
		    : 메서드는 선언부와 구현부로 구성됨
		    : 선언부만 작성이 되고 구현부는 작성하지 않은 메서드를 추상 메서드라고 함
		    
		    abstract 리턴타입 메서드명();
		  
		  - 추상클래스로부터 상속받은 클래스는 추상 클래스가 되어야 함
		      하지만 추상클래스가 되기 싫다면 추상메서드를 오버라이드 하면 됨
		  
		19. 인터페이스(interface)
		  - 일종의 추상클래스이지만 추상메서드와 상수만을 멤버로 가짐
		  - 인터페이스의 작성
		     interface 인터페이스명{
		     	public static final 변수타입 변수명 = 값;
		     	public abstract 리턴타입 메서드명(매개변수목록);
		     }
		     
		     : 모든 멤버변수는 public static final 이어야 함 => 생략가능
		     : 모든 메서드는 public abstract 이어야 함 => 생략가능
		     
		  - 인터페이스의 상속
		    : 인터페이스는 인터페이스로부터만 상속 받을 수 있음
		      (구현된 메서드나 변수를 상속받으면 인터페이스가 아니게 됨)
		    : 인터페이스는 다중상속이 가능
		    : 인터페이스는 클래스와 달리 Object클래스와 같은 최고 조상은 없음
		  
		  - 인터페이스의 구형(추상 클래스와 비슷)
		    : 자체로는 인스턴스를 생성할 수 없음
		    : 자신이 정의된 추상메서드의 구현부를 만들어주는 클래스 작성해야 함  
		  	: 클래스의 확장(extends), 인터페이스의 구현(implements)
		    : 인터페이스의 일부 메서드만 구현했다면 추상클래스가 되어야 함
		    : ~able(~을 할 수 있는) => IMember : 앞에 I 붙이면 인터페이스 -> IMemberImpl : mpl 인터페이스를 구현한 클래스에 붙임
		  	
		  - 인터페이스의 다형성
		    : 인터페이스 타입의 참주변수로 그를 구현한 구현체의 인스턴스를 참조할 수 있다
		  
		  - 인터페이스의 장점
		    : 개발시간을 단축시킬 수 있음
		    : 표준화가 가능
		    : 서로 관계가 없는 클래스들에게 관계를 맺어줄 수 있음
		    : 독립적인 프로그래밍이 가능
		    7-26예제 필수적으로 해보시오
		  
		  - 인터페이스의 이해 
		    : 클래스를 사용하는 쪽(user)과 클래스를 제공하는 쪽(provider)이 있음
		    : 메서드를 사용하는 쪽은 사용하려는 메서드의 선언부만 알면됨
		    A - I - B : 직접관계에서 간접관계로 만들어줄 수 있음
		    
		  
		20. 내부클래스
		  - 내부클래스란?
		    : 클래스내에 선언된 클래스
		    : 서로 쉽게 접근할 수 있고 외부에서 볼 때 불필요한 클래스를 감춤으로 복잡성 줄일 수 있음
		  
		  - 인스턴스클래스(Instance class)
		    : 외부클래스의 인스턴스 멤버들과 관련된 작업을 수행
		  - 스태틱클래스(static class)
		    : 외부클래스의 클래스 멤버드로가 관련된 작업을 수행
		  - 지역클래스(local class)
		    : 외부클래스의 메서드나 초기화블럭 안에서만 사용 가능
		    : 메서드가 종료 시 사라지는 클래스
		  - 익명클래스(Anonymous class)
		    : 클래스의 선언과 동시에 객체의 생성이 이루어지는 이름없는 클래스(1회용)
		    
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		*/
		
		
		
	}
	
	
	
}
