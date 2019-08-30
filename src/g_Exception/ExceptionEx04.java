package g_Exception;

public class ExceptionEx04 {
	public static void main(String[] args) {
		
		copyFile();
		try{
			startInstall();
			
		}catch(Exception e){
			e.printStackTrace(); //에러내용을 출력
		}finally{
			deleteFile();
		}
	}
	
	static void copyFile()
	{
		
	}
	
	static void startInstall(){
		
		
	}
	
	static void deleteFile(){
		
	}
	
	
	
	
	
	
	
}
