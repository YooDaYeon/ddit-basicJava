package i_javaLang;

public class JavaLangBasic {

	/*
	1. java.lang패키지
	  - 자바프로그래밍에 기본이 되는 클래스들을 포함하고 있음
	   ex) String, System...
	   
	2. Object클래스
	  - Object클래스는 멤버변수는 없이 11개의 메서드로 이루어져 있음
	  
	  - boolean equals(Object obj)
	    : 매개변수로 객체의 참조변수를 받아서 비교하고 그 결과를 boolean값으로 알려줌
	    : 참조변수에 저장된 주소값이 같은지를 비교할 수밖에 없음
	    : 주소값이 아닌 멤버변수의 값을 비교하기 위해서는 equals메서드를 오버라이드 해야함
	      ex) String, Date, File, wrapper클래스...
	      
	  - hashCode() - 10진수로 이루어져 있음
	    : 객체의 주소값을 이용해서 해시코드를 만들어 반환
	    : String클래스는 문자열의 내용이 같으면 동일한 해시코드 반환
	    
	  - toString()
	    : 해당 인스턴스의 정보를 문자열로 제공할 목적으로 작성
	    : 기본 toString()
	      return getClass().getName()+"@"+Integer.toHexString(hashCode());   
	      
	  - clone()
	    : 얕은복사
	    : 자신을 복제해 새로운 인스턴스를 생성
	 	  단순히 인스턴스변수의 값만을 복사해줌
	 	  객체가 참조하고 있는 객체까지 복제하지 않음
	
	  - getClass()
	    : 자신이 속한 클래스의 Class객체를 반환하는 메서드
		: 클래스로부터 객체를 얻는 방식
		  1) 생성된 객체로부터 얻어오는 방식
		    Class obj = new Card().getClass();
		  2) 클래스 리터럴(값)로부터 얻는 방법
			Class obj = Card.class;
		  3) 클래스의 이름으로부터 얻는 방법
		    Class obj = Class.forName("Card");	
		  
	
	3. String클래스 (리터럴일 때만 가능)
	  - 다른 언어에서는 문자열을 char[]다루었으나 자바에서는 문자열을 위한 클래스 제공
	    : 문자열을 합치거나 할 때 새로운 문자열을 가진 String 인스턴스가 생성됨
		: 문자열의 결합이 많이 필요한 경우에는 StringBuffer를 이용
		
	
	  - String클래스의 생성자와 메서드
	  
	  - 문자 인코딩 변환
	    : 한글 윈도우의 경우 문자 인코딩으로 CP949를 이용
	      하지만 우리는 UTF-8을 사용
	
	  - String.format
	    : 기본형 값을 String으로 변환
	     1) 빈문자열을 더하는 방식
	       int a = 10;
	       String s = a + ""; -> 안좋은 방식
	       
	     2) valueOf()를 이용하는 방식
	       String s1 = String.valueOf(a);
	       
	    : String을 기본형 값으로 변환 
	     1) wrapper클래스를 이용
	       String str = "100";
	       int a = Integer.parseInt(str);
	
		   int c = Integer.valueOf(str); //앞에 쓴 형태로 변환
		   
		 2) String을 기본형으로 변환 시 10진수
		   String s = "200";
		   int a = Integer.parseInt(s,4); // 200(4) 200이 4진수라는 말 => 10진수 : 32
 	
	
	4. StringBuffer클래스와 StirngBuilder클래스
	  - String 클래스는 인스턴스를 생성할 때 지정된 문장을 변경할 수 없음
	  - 문자열의 변경을 위해서는 StringBuffer클래스 이용
	
	5. Math클래스
	
	6. wrapper클래스
      - 객체지향의 개념은 모든것을 객체로 다뤄야 함
      - 8가지 기본형은 객체로 다루지 않음
      - 때로는 기본형 변수도 어쩔 수 없이 객체로 다뤄야 하는 경우가 있음
        : 매개변수로 객체를 요구할 때
        : 기본형이 아닌 객체로 저장 되어야 할 때
        
 		 여러줄 동시에 쓰는 단축키 :alt + shift +a
         boolean | Boolean
         char    | Character -**
         byte    | Byte
         short   | Short
         int     | Integer -**
         long    | Long 
         float   | Float
         double  | Double
	
	  - 오토박싱 : 기본형 값을 래퍼클래스의 객체로 변환해 주는 기능
	  - 언박싱 : 래퍼클래스의 객체를 기본형 값으로 변환해 주는 기능
	  
	 7. StringTokenizer클래스
	   - 긴 문자열ㅇ르 지정된 구분자를 기준으로 토큰(token)이라는 여러개의 문자열로 자라내는데 사용
	   - 단 한 문자의 구분자만 사용 가능
	
	
	
	
	
	
	
	
	
	
	
	*/
	
	
	
	
}
