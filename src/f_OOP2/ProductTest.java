package f_OOP2;

import java.awt.event.ItemEvent;
import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		Tv t1=new Tv("LG Curved",800);
		CoffeeMachine cf = new CoffeeMachine("네스프레소",80);
		BodyFriend bf = new BodyFriend("바디프렌드",700);
		
		Buyer b = new Buyer("박서경",10000);
		Buyer c = new Buyer("유감자",10000);
		Buyer d = new Buyer("이억만",10000);
		Buyers aa = new Buyers();
		
//		//personAdd(b);
		b.buy(t1);
		b.buy(cf);
//		c.buy(bf);
//		
////		b.summary();
////		c.summary();
////		c.refund(t1);
//		b.refund(cf);
//		b.summary();
		
		aa.personAdd(b);
		aa.personAdd(c);
		aa.personAdd(d);
//		aa.personRemove(b);
		aa.change(b,5000);
		aa.personList();
		aa.leeList();
		
	}
}

class Product{// 물품 이름,가격,사면 주는 마일리지
	String name;
	int price;
	int mileage;
	
	Product(String name, int price){
		this.name=name;
		this.price=price;
		mileage=price/100;
	}
}

class Tv extends Product{
	Tv(String name,int price){
		super(name,price); //Product(String name, int price)에 입력
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class CoffeeMachine extends Product{
	CoffeeMachine(String name,int price){
		super(name,price);//Product(String name, int price)에 입력
	}

	@Override
	public String toString() {
		return "CoffeeMachine";
	}
}

class BodyFriend extends Product{
	BodyFriend(String name,int price){
		super(name,price);//Product(String name, int price)에 입력
	}

	@Override
	public String toString() {
		return "BodyFriend";
	}
}

class Buyer{ //고객이름,돈,마일리지		고객 여러명 관리하기
	String name;
	int money;
	int mileage;
	
	Vector<Product> item = new Vector<Product>(); //구입한 제품을 저장하는데 사용
	
	public Buyer(String name, int money){ //구입자의 이름, 갖고 있는 돈
		this.name=name;
		this.money= + money;
	}
	
	void buy(Product p){ // 구입하는 행위 -> 돈차감, 마일리지 적립, 벡터자료형의 item에 물품 추가
		if(money < p.price){
			System.out.println("나가");
			return;
		}
		
		money-=p.price;
		mileage +=p.mileage;
		item.add(p);
		System.out.println(name +"고객님" +p +"를 구입해주셔서 감사합니다");
	}
	
	// refund 반품 메서드
	// 내가 산것 반품, 산것이 없으면 반품 시작 X
	void refund(Product p){
		System.out.println();
		if(item.isEmpty()){ // item.size()==0과 동일		
			System.out.println("구입한 물품이 없습니다");
		}
		
		if(item.remove(p)){//뭎ㅍ품이 삭제됐으면 true, 물품 없어서 삭제 안되면 false
			//반품성공
			money+=p.price;
			mileage -=p.mileage;
			System.out.println(p+"를 반품했습니다");
		}else{
			//구매물품 중 반품할 물품 없음
			System.out.println("물품없다");
		}
		//-----------------------------------------------------
		
		//-----------------------------------------------------
//		int x=0;
//		for(int i=0;i<item.size();i++){
//			Product a =(Product)item.get(i);
//			if(p.name==a.name){
//				x++;
//				break;
//			}
//		}
//		if(x==0){
//			System.out.println("구입한 물품이 없습니다");
//			return;
//		}
//		
//		money+=p.price;
//		mileage -=p.mileage;
//		item.remove(p);
//		System.out.println(p + "가 반품되었습니다");
//		

		System.out.println("고객님의 남은 돈은 " +money+"만원이고");
		System.out.println("        마일리지는 " +mileage +"만점입니다");
		
	}

	//summary 영수증 메서드
	/*
	
			영	수	증
		구매물품
			Tv 			 800만원
			CoffeMachine 80만원
			BodyFriend   700만원
			총합			 1580만원
		
		고객님의 남은돈은 8420만원이고
		 	   마일리지는 157만점 입니다
		이용해 주셔서 감사합니다
	
	 (구매물품 없을 때는 "구매하신 물품이 없습니다" 출력)
	*/
	void summary(){
		System.out.println();
		System.out.println("    영    수    증");
		System.out.println("구매물품");
		
		if(item.size()==0){
			System.out.println("구매하신 물품이 없습니다");
			return;
		}
		
		int sum=0;
		for(int i=0;i<item.size();i++){
			Product p =item.get(i);
			System.out.println(item.get(i).name+ " " +p.price);
			sum+=p.price;
		}
		
		System.out.println("총합\t" + sum);
		System.out.println("고객님의 남은 돈은 " +money+"만원이고");
		System.out.println("        마일리지는 " +mileage +"만점입니다");
		
	}
}

class Buyers{
	Vector<Buyer> buyer=new Vector<Buyer>();
	
	{
		Buyer b1=new Buyer("이씨",100);
		buyer.add(b1);
		
		Buyer b2 = new Buyer("김씨",300);
		buyer.add(b2);
	}


	//사람 추가
	void personAdd(Buyer b){
		System.out.println();
		buyer.add(b);
		System.out.println(b.name +"이 추가되었습니다");
	}
	
	//사람 삭제
	void personRemove(Buyer b){
		System.out.println();
		buyer.remove(b);
		System.out.println(b.name +"이 삭제되었습니다");
	}
	
	//변경 ->금액 충전
	void change(Buyer b,int money1){
		System.out.println();
		for(int i=0;i<buyer.size();i++){
			if(b.name.equals(buyer.get(i).name)){
				buyer.get(i).money+=money1;
				System.out.println(b.name +"고객의 돈이 " +buyer.get(i).money +"로 변경되었습니다");
				break;
			}	
		}
	}
	
	//사람목록을 출력
	void personList(){
		System.out.println();
		for(int i=0;i<buyer.size();i++){
			System.out.print("이름 : " +buyer.get(i).name);
			System.out.print(", 돈 : " +buyer.get(i).money);
			System.out.println(", 마일리지 : " +buyer.get(i).mileage);
			
		}
	}
	
	//이씨사람목록 출력
	Vector<Buyer> leeList(){
		System.out.println();
		Vector<Buyer> bb= new Vector<Buyer>();
		
		for(int i=0;i<buyer.size();i++){
			if(buyer.get(i).name.charAt(0)=='이'){
				
				bb.add(buyer.get(i));
				System.out.print("이름 : " +buyer.get(i).name);
				System.out.print(", 돈 : " +buyer.get(i).money);
				System.out.println(", 마일리지 : " +buyer.get(i).mileage);
			}
		}
		
		
		return bb;
	}
	


}








