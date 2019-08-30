package e_OOP;

class Data{
	int x;
}
public class InterVari {
	public static void main(String[] args) {
		//1. Data클래스의 객체를 만들라 d1
		Data d1=new Data();
		//2. d1의 x값을 10으로 변경하라
		d1.x=10;
		//3. main()기본형 : 10
		System.out.println("main()기본형 : " +d1.x);
		//4. change메서드를 호출하라 단, 인자값으로 d1의 x값을 보내라
		InterVari.change(d1.x);
		//5. main()기본형 : d1의 x값
		System.out.println("main()기본형 : "+ d1.x);
		//6. Data클래스의 객체를 만들라 d2
		Data d2=new Data();
		//7. d2의 x값을 10으로 변경하라
		d2.x=10;
		//8. main()참조형 : d2의 x값
		System.out.println("main() 참조형 : " + d2.x);
		//9. change메서드를 호출하라 단, 인자값으로 d2을 보내라
		InterVari.change(d2);
		//10. main()참조형 : d2의 x값
		System.out.println("main()참조형" + d2.x);
	}
	
	static void change(int x){
		x=1000;
		System.out.println("change() 기본형 : " +x);
	}
	
	static void change(Data d1){
		d1.x=1000;
		System.out.println("change() 참조형 : " +d1.x);
	}
	
	
	
	
}
