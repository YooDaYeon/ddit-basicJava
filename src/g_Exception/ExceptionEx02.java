package g_Exception;

public class ExceptionEx02 {
	public static void main(String[] args) {
		
		Exception e =  new Exception("서경이때문에"); //이유를 설명
		
		try {
			throw e;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			System.out.println(e1.getMessage()); //이유만 가져올 때 뜸
		}
                                    		
		System.out.println("아니아니아니야앙");
		
		throw new RuntimeException();
		
		//컴파일러가 예외처리를 강제하지 않는 경우
		//1. RuntimeException클래스들
		//2. Error와 그 자손들
		// 이런 것들을 'unchecked예외'라고 함
		
		
		
		
		
		
		
		
		
		
	}
}
