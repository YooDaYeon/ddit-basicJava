package y_exam;

public class Exam_02 {
	public static void main(String[] args){
		
		/*
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		
					1byte	2byte	4byte	8byte
			논리형	boolean
			문자형			char
			정수형	byte	short	int		long
			실수형					float	double
		
			
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
				(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
				초기화 하는 한 줄의 코드를 적으시오	
		*/	
			 long regNo = 9401022564895l; // int형의 범위를 넘었기에 long사용
			 
		/*
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
				int i = 100;
				long l =100L;
				final float PI = 3.14f;
				- 리터럴 :100,100L,3.14f
				- 변수 :i,l
				- 키워드 :int,long,float,final
				- 상수 :PI
				
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
				a. int
				b. Byte
				c. double
				d. boolean
				
				정답 : b. 자바는 대소문자를 구분하기에 앞이 대문자인 Byte가 아닌 것이다
				
		  	 
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
			류’라고 적으시오.
			System.out.println(“1” + “2”) → (String + String => String => 12 )
			System.out.println(true + “”) → (boolean + String => String+String=>"true"+"" => true)
			System.out.println(‘A' + 'B') → (char + char => int + int => 65 + 66 => 131 )
			System.out.println('1' + 2) → (char + int => int + int => 49 + 2 => 51 )
			System.out.println('1' + '2') → (char + char => int + int => 49 + 50 => 99 )
			System.out.println('J' + “ava”) → (char + String => String + String => Java )
			System.out.println(true + null) → (boolean + null ) => boolean은 true와 false만 가질 수 있고
																	값을 더한다는 행위를 할 수 없다
			
			*/
			 System.out.println("1" + "2"); 
			 System.out.println(true + "");
			 System.out.println('A' + 'B');
			 System.out.println('1' + 2);
			 System.out.println('1' + '2');
			 System.out.println('J' + "ava");
		    //System.out.println(true + null);
			
	
			 /*
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
				a. if
				b. True
				c. NULL
				d. Class
				e. System	
				
				정답 : b,c,d,e => 자바는 대소문자 구분하는데 키워드는 모두 소문자이다
								그래서 대문자 들어간 단어들이 키워드가 아닌 것이다
				
				  
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
				a. $ystem => 가능 : $는 가능한 특수기호
				b. channel#5 => 불가능 : #은 불가능한 특수기호
				c. 7eleven => 불가능 : 맨처음에 숫자 불가능
				d. If => 가능 : if가 예약어라서 대문자인 IF는 변수로 가능
				e. 자바 => 가능 : 사용은 가능하나 개발자끼리 암묵적으로 한글 사용 금지
				f. new => 불가능 : 예약어
				g. $MAX_NUM => 가능 : $는 가능한 특수기호
				h. hello@com => 불가능 : @는 불가능한 특수기호	
				
					  
	    [2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
				르시오)
				a. int => 정답 
				b. long
				c. short
				d. float => 정답
				e. double
				
				참조형 변수는 4byte이기에 a,d가 정답
								  
				  
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
				byte b = 10; 
				char ch = 'A'; 
				int i = 100; 
				long l = 1000L; 
											
				a. b = (byte)i; => 불가능 : 큰 범위가 작은범위로 들어가려면 캐스트 필수
				b. ch = (char)b; => 불가능 : 범위가 서로 안 맞기에 캐스트 필수
				c. short s = (short)ch; => 불가능 : 범위가 서로 안 맞기에 캐스트 필수
				d. float f = (float)l; => 가능 : float이 long 포함하기에 큰범위에 작은 범위 넣을 때는 생략 가능
				e. i = (int)ch;	=> 가능 : int인 i 범위가 ch보다 크기 때문에 큰범위에 작은 범위 넣을 때는 생략 가능
				
				기본형의 형변환
				byte < short < int < long < float < double  : 포함 관계
				        char <
				작은범위를 큰범위에 넣을 땐 생략가능, 큰범위를 작은범위에 넣을 땐 캐스트  , 범위 안 맞을 때 캐스트      
		*/
			 	byte b = 10; 
				char ch = 'A'; 
				int i = 100; 
				long l = 1000L; 
				
				b = (byte)i;
				ch = (char)b;
				short s = (short)ch;
				float f = l;
				i = ch;
			 
		/*	 
		
		[2-10]  char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오 )
				정답 : 2byte -> 16bit -> 0 ~ 2의 16승 -1
				
				
		[2-11] 다음중 변수를 잘못 초기화 한 것은 ? (모두 고르시오)		
				a. byte b = 256; => 정답 : byte의 범위 (-128~127)를 넘기에 잘못 초기화 함
				b. char c = '';  => 정답 : char는 값으로 한개의 문자를 꼭 넣어야 함
				c. char answer = 'no'; => 정답 : char에는 한개의 문자만 가능
				d. float f = 3.14; => float는 초기화 할 때 값뒤에 f를 붙여서 3.14f로 써야 함
				e. double d = 1.4e3f; => double 은 8byte고 float 은 4byte인데 큰 곳에 작은 것을 넣으니 정상
				
		*/
				 //byte b = 256;
				 char c = 'A';
				 char answer = 'n';
				 float fa = 3.14f;
				 double d = 1.4e3;  
		
		/*		 
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
			a. boolean - false => boolean에는 true와 false 두 개의 값만 있음
		    b. char - '\u0000' => 유니코드 값으로 초기화함
		    c. float - 0.0 => 정답 : 0.0에 f를 붙여 0.0f로 써야 함
		    d. int - 0 => 정수형 기본값으로 정상
		    e. long - 0 => 정답 : 정수형의 기본값은 int형 이기에 long을 쓰려면 0뒤에 L을 붙여 0L로 써야함
		    f. String - "" => 정답 : 참조형 기본값은 null이기에 null이라고 써야함, ""은 빈공간이라는 단어?가 들어간 것임
		
		*/
		
			 
	}
}
