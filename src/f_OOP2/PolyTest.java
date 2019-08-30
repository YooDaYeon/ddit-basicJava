package f_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1. FireCar 3대를 저장할 수 있는 변수 fc를 선언하고 생성
//		FireCar[] fc=new FireCar[3];
//		fc[0]=new FireCar();
//		fc[1]=new FireCar();
//		fc[2]=new FireCar();
		FireCar fc1=new FireCar();
		FireCar fc2=new FireCar();
		FireCar fc3=new FireCar();
		
		FireCar[] fc=new FireCar[]{fc1,fc2,fc3};
		
		//2. PoliceCar 2대를 저장할 수 있는 변수 pc를 선언하고 생성
//		PoliceCar[] pc=new PoliceCar[2];
//		pc[0]=new PoliceCar();
//		pc[1]=new PoliceCar();
		
		PoliceCar pc1=new PoliceCar();
		PoliceCar pc2=new PoliceCar();
		
		PoliceCar[] pc=new PoliceCar[]{pc1,pc2};
		//3. Ambulance 4대를 저장할 수 있는 변수 ab를 선언하고 생성
//		Ambulance[] ab=new Ambulance[4];
//		ab[0]=new Ambulance();
//		ab[1]=new Ambulance();
//		ab[2]=new Ambulance();
//		ab[3]=new Ambulance();
		Ambulance ab1=new Ambulance();
		Ambulance ab2=new Ambulance();
		Ambulance ab3=new Ambulance();
		Ambulance ab4=new Ambulance();
		
		
		Ambulance[] ab=new Ambulance[]{ab1,ab2,ab3,ab4};
		Car cc = fc1; //up-casting
		Car[] c = new Car[]{fc1,fc2,fc3,pc1,pc2,ab1,ab2,ab3,ab4}; // up-casting 부모로 형변환
		FireCar fc5=(FireCar)c[2]; //부모를 자식에 넣으려면 바로 안되니까 형변환해서 넣어줌 down-casting이라고 함 자식으로 형변환
		//FireCar fc7 = (FireCar)new Car();//자식타입의 인스턴스변수로 부모타입의 참조변수를 참조 못합
		
		
		
		
		
		
		
		
	}
}

class Car{
	int door;
	int wheel;
	
	void drive(){
		System.out.println("달려");
	}
	
	void stop(){
		System.out.println("멈춰");
	}
	
//	void fix(FireCar c){
//		System.out.println();
//	}
//	void fix(PoliceCar c){
//		System.out.println();
//	}
//	void fix(Ambulance c){
//		System.out.println();
//	}  모두 결합한 것이 
	void fix(Car c){ //매개변수의 다형성
		System.out.println();
	}
	
	
	
}

class FireCar extends Car{
	void water(){
		System.out.println("물뿌리");
	}
}

class PoliceCar extends Car{
	void lock(){
		System.out.println("못나가");
	}
}

class Ambulance extends Car{
	void AED(){
		System.out.println("살아나");
	}
}