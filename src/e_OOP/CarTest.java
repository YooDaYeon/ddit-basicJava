package e_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		Car c=new Car(); //매개변수가 없
		Car c1=new Car("white","auto",2);
		System.out.println(c1.color + c1.gearType +c1.door );
		Car c2=new Car("red","auto");
		System.out.println(c2.color + c2.gearType +c2.door );
		System.out.println(c.color + c.gearType +c.door );
	}
}

class Car{
	String color;
	String gearType;
	int door;
	
	// 기본생성자:컴파일 되면 생성자의 매개변수가 아무것도 없을 때 자동으로 생김 눈에 보이진 않음
	//Car(String color2, String gearType2, int door) 이렇게 생성자 만들어주면 기본생성자를 따로 안만들어줌
	// 그래서 기본생성자 필요하면 선언해야함
	Car(){
		color="white";
		gearType="stick";
		door=3;
	}
	
	//
	Car(String color, String gearType, int door){ //매개변수가 있는 생성자
		this.color=color; // this를 통해 지역변수가 아닌 전역변수에 값 입력. this는 이 인스턴스라는 의미 가짐
		this.gearType=gearType;
		this.door=door;
	}
	
	Car(String color, String gearType){ //매개변수가 있는 생성자
		this(); // = Car()  생성자 내에서 다른생성자 호출 시 사용  Car()에 있는 color와 gearType에 red와 auto입력
		this.color=color; // this를 통해 지역변수가 아닌 전역변수에 값 입력. this는 이 인스턴스라는 의미 가짐
		this.gearType=gearType;
		
	}
	
	
	
	
	
	
}
