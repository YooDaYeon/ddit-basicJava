package e_OOP;

public class OOPBasic {
	public static void main(String[] args) {
		/*
		OOP : Object Oriented Programming(객체 지향 프로그래밍)
		
		1. 객체지향언어
		  - 기존의 프로그램언어에 몇가지 새로운 규칙을 추가한 보다 발전된 형태
		  - 규칙들을 이용해서 코드간에 서로 관계를 맺어 줌으로써 보다 유기적으로 프로그램을 구성
		  - 객체지향 언어의 특징
		    : 코드의 재사용성이 높음
		    : 코드의 관리가 용이함
		    : 신뢰성이 높은 프로그래밍을 가능하게 함
		
		2. 클래스와 객체
		  1) 클래스란?
		    : 객체를 정의해 놓은 것
		    : 객체의 설계도 또는 틀
		    
		    클래스		객체
		   Tv설계도    Tv
		   
		  2) 객체란?
		    : 실제로 존재 하는 것, 사물 또는 개념
		    : 객체의 구성요소
		        - 속성(멤버변수, 특성, 필드, 상태)
		             크기, 길이, 색상, 무게, 전원, 채널, 볼륨..
		        - 메서드 
				   켜기, 끄기, 볼륨 높이지, 채널 변경..
		
		3. 인스턴스란?
		  - 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화라고 함
		  - Tv클래스로부터 만들어진 객체를 Tv클래스의 인스턴스라고 함
		  - 인스턴스 생성방법
		     클래스명 변수명; => 클래스의 객체를 참조하기 위한 참조변수 선언
		     변수명 = new 클래스명(); => 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
		    
		  - 인스턴스는 참조변수를 통해서만 다룰 수 있음
		     참조변수의 타입은 인스턴스의 타입과 일치해야 함
		  
		4. 선언 위치에 따른 변수의 종류
		  - 지역변수, 전역변수(클래스 변수, 인스턴스 변수)
		  - 인스턴스 변수 
		    : 클래스의 영역에 선언되며, 클래스의 인스턴스를 생성할 때 만들어짐
		    : 인스턴스 변수의 값을 읽어 오거나 변경하기 위해서는 먼저 인스턴스화를 진행해야 함
		    : 인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있음
		        그러므로 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우 인스턴스변수로 선언함
		        
		  - 클래스변수
		    : 모든 인스턴스가 공통된 저장공간을 공유하게 됨
		        한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야 하는 경우 클래스변수로 선언함
		    : 인스턴스 변수 앞에 static만 붙이면 됨
		    
	      - 지역변수
	        : 메서드내에 선언되며 메서드 내에서만 사용가능
	        : 메서드 종료 시 소멸됨
	        
	    5. 메서드
	      - 어떠한 작업을 수행하기 위한 명령문의 집합
	      - 주로 어떤 값을 입력받아서 처리하고 그 결과를 돌려줌
	      - 입력되는 값이 없을수도 결과를 반환하지 않을 수도 있음 
	      - 반복적으로 사용되는 코드를 줄이기 위해 사용됨
	      - 작성방법
	           반환타입 메서드명(변수타입 변수명,...){ //매개변수
	           	수행될 문장
	           	return; // 생략가능
	        }
	        
	        void changeColor(String color){
	            color2=color;   
	        }
	        
	        int add(int a,int b){
	        	int result = a+b;
	        	return result; //반환값
	        }
	        
	     6. return
	       - 메서드가 정상적으로 종료되는 경우   
	         : 메서드 블럭{}내의 마지막 부분까지 수행했을 때
	         : 메서드의 블럭{}내에서 return문을 만났을 때
	       - 반환값
	         : 없는 경우에는 return문만 써주면 됨
	           return; // 생략가능
	         : 있는 경우에는 return문 뒤에 반환값을 써주면 됨
	           return 5;
	       - 메서드의 반환타입과 return값의 타입은 같아야 됨
	       
	     7. 메서드의 호출
	       - 클래스메서드 호출
	            클래스명.메서드명(변수타입 변수명);          
		   - 인스턴스 메서드 호출
		       클래스명 참조변수 = new 클래스명();
		       참조변수.메서드명(변수타입 변수명);
		       
		 8. JVM메모리구조
		   - 메서드영역(method area)
		     : 프로그램 사용 중 class의 정보 저장
		     : 클래스변수, 클래스메서드도 같이 로드됨
		   - 호출스택(call stack)
		     : 메서드 작업에 필요한 메모리 공간 제공        
		     : 메서드가 호출되면 호출스택에 호출된 메서드를 위한 메모리가 할당되며
		         메서드가 작업을 수행하는 동안 지역변수들과 연산의 중간결과 등을 저장
		   - 힙영역(heap)
		     : 인스턴스가 생성되는 공간
		     : 인스턴스변수, 인스턴스메서드도 같이 로드됨
		     
		 9. 매개변수
		   - 메서드를 호출할 때 매개변수로 지정한 값(인자값)을 메서드의 매개변수에 복사해서 넘겨줌
		   - 기본형 매개변수
		     : 단순하게 저장된 값만 복사됨
		     : 변수의 값을 읽기만 가능
		   - 참조형 매개변수
		     : 인스턴스의 주소가 복사됨
		     : 변수의 값을 읽고 변경할 수 있음
		     
		     
		 10. 메서드의 종류
		   - 클래스메서드
		 	 : 객체생성 없이 '클래스명.메서드명()'으로 호출
		 	 : 인스턴스 변수나 인스턴스 메서드와 관련없는 작업을 수행
		 	 : 클래스메서드 내에서는 인스턴스 변수를 사용할 수 없음
		 	 : 메서드내에서 인스턴스 변수를 사용하지 않는다면 static을 붙이는 것을 고려
		   - 인스턴스메서드
		     : 인스턴스를 생성 후, '참조변수.메서드명()'로 호출
		     : 인스턴스변수나 인스턴스 메서드와 관련된 작업 수행
		     : 메서드 내에서 인스턴스 변수나 메서드를 사용할 수 있음
		     
		 11. 클래스 멤버와 인스턴스 멤버간의 참조와 호출
		   - 같은 클래스의 멤버간에는 객체 생성이나 참조변수 없이 참조할 수 있음
		   - 클래스 멤버에서는 인스턴스 멤버를 호출할 수 없음
		     : 인스턴스의 멤버가 존재하는 시점에는 클래스멤버들이 항상 존재
		         클래스멤버들이 존재하는 시점에는 인스턴스 멤버들이 않을 수도 있음
		 
		 12. 메서드 오버로딩
		   - 한 클래스내에 같은 이름의 메서드를 여러개 정의하는 것을 '메서드 오버로딩'이라고 함 
		   - println()가 가장 대표적인 예
		   - 조건
		     : 메서드의 명은 동일해야 함
		     : 매개변수의 타입 or 개수가 달라야 함
		     : return타입은 상관없음
		   - 오버로딩의 장점
		     : 메서드의 이름으로만 구별 된다면,  모든 메서드의 명칭이 달라야 함
		     : 근본적으로 같은 기능을 하는 것인데 다른 이름으로 표현되면 기억하기 어려움
		     : 메서드 이름을 짓는데 고민을 덜 수 있음  
		 
		 13. 재귀호출 (recursive call)
		   - 메서드 내부에서 메서드 자신을 다시 호출하는 것
		   
		 14. 생성자
		   - 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
		   - 특징
		     : 메서드처럼 클래스 내에 선언됨
		     : 리턴값이 없음
		       (생성자도 메서드이기 때문에 리턴값이 없는 void를 적어야 하지만 
		        모든 생성자가 리턴값이 없어서 생략)
		     : 생성자의 명칭은 클래스의 명과 동일해야 함
		   - 정의방법
		     : 기본생성자
		         클래스명(){
		         
		       }
		     : 매개변수가 있는 생성자
		         클래스명(변수타입 변수명, 변수타입 변수명,..){
		         
		       }
		    
		   - 생성자에서 다른 생성자 호출하기 this()
		     : 같은 클래스의 멤버들간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출 가능
		     : 조건
		         생성자의 이름으로 클래스명 대신 this를 사용  
		         한 생성자에서 다른 생성자를 호출할 때는 첫 줄에서만 호출 가능 
		      
		 15. 변수의 초기화
		   - 변수를 선언하고 처음으로 값을 저장하는 것을 '변수의 초기화'라고 함
		   - 초기화 방법
		     : 명시적 초기화 => 변수의 선언과 동시에 초기화 int a=5;
		     : 생성자를 이용한 초기화
		   - 초기화 블럭을 이용한 초기화
		     : 클래스초기화 블럭
		     : 인스턴스초기화 블럭     
		      
		      
		      
		      
		      
		      
		      
		      
		
		
		*/
		
		
		
		
		
		
		
	}
}
