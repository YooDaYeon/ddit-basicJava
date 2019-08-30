package e_OOP;

public class MyClass {
	public static void main(String[] args) {
		
		Feed feed=new Feed();
		
		feed.feedAct1();
		feed.feedAct2();
		feed.feedAct3();	
		System.out.println("맘마 먹어라");
	}
}	
	
class Feed{
	// 명사적 의미
		//사료통, 사료, 사료컵, 강아지 밥그릇
		String feedBucket="사료통";
		String feed="사료";
		static String feedCup="사료컵";
		static String feedBowl="밥그릇";
		
		// 동사적 의미
		//사료통에서 사료컵으로 사료를 푼다
		//푼 사료를 갖고 강아지 밥그릇으로 간다
		//밥그릇에 사료를 쏟는다
		void feedAct1(){
			System.out.println(feedBucket +"에서 " +feed + "를 푼다");
		}
		
		void feedAct2(){
			System.out.println(feed +"를 갖고 " + feedBowl + "으로 간다");
		}
	
		void feedAct3(){
			System.out.println(feedBucket +"에 " +feed +"를 쏟는다");
		}
	
}