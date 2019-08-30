package y_exam;

public class TotalTest { // TotalTest가 선언되어서 Method Area에 적재
	public static void main(String[] args) { //클래스main()메서드가 선언되어 Method Area에 선언된 TotalTest안에 main()클래스 메서드 선언

		TvMaker.color = "Blue"; //TvMaker클래스의 클래스 변수 color에 Blue값 적재
		TvMaker tm = new TvMaker();//main()클래스 메서드안에 tm지역변수에 TvMaker클래스를 인스턴스화 해서 인스턴스 생성,heap에 TvMaker()의 인스턴스가 생기는데 그 주소를 tm에 저장
		tm.age = 30; //heap에 있는 tm의 주소를 갖고 있는 인스턴스의 변수 age에 30입력
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel); //TvControll클래스의 channel클래스 변수 출력 = 15
		TvControll.volumeDown(); //TvControll클래스의 volumeDown()클래스 메서드 호출로 C.S에 적재되어 메서드 실행
		System.out.println(TvControll.channel); // TvControll.channel출력해서 16 출력

		// 3.2
		TvControll tc; // TvConroll클래스를  main()메서드의 지역변수tc를 참조변수로 선언
		tc = new TvControll(); //heap에 new를 통해 TvControll()의 인스턴스변수와 메서드가 생기는데 그 주소를 tc에 저장
		System.out.println(tc.volume);//tc가 갖고 있는 TvControll()인스턴스 주소안의 volume값 출력 : 99
		tc.volumeUp();//tc가 갖고 있는 TvControll()인스턴스 주소안의 VolumeUp()인스턴스메서드 실행으로 C.S에 올라감
		System.out.println(tc.volume);//tc가 갖고 있는 TvControll()인스턴스 주소안의 volume값 출력 : 100
		tc.volumeUp();//tc가 갖고 있는 TvControll()인스턴스 주소안의 VolumeUp()인스턴스메서드 실행으로 C.S에 올라감
		System.out.println(tc.volume);//tc가 갖고 있는 TvControll()인스턴스 주소안의 volume값 출력 : 0

		//
		Calc cc = new Calc();//Calc클래스를 main()메서드의 지역변수 cc를 참조변수로 활용해서 인스턴스화해서 cc를 인스턴스할 때 사용,heap에 인스턴스변수와 메서드 생성
		System.out.println(cc.add(Integer.MAX_VALUE, 4));//
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker { //Method Area에 TvMaker클래스 생성
	// 1.
	// 1.1
	static String color; //클래스 변수로 Method Area안의 TvMaker클래스 안에 생성:null->Blue
	static int inch; //클래스 변수로 Method Area안의 TvMaker클래스 안에 생성
	// 1.2
	String name = ""; //main()에서 인스턴스화를 통해 heap에 인스턴스 생성(TvMaker tm = new TvMaker()를 통해 생성)
	int age;//인스턴스를 통해 heap에 인스턴스 생성(TvMaker tm = new TvMaker()를 통해 생성): 0->30

	// 2.
	// 2.1
	TvMaker() {//인스턴스를 통해 heap에 인스턴스 생성(TvMaker tm = new TvMaker()를 통해 생성)
		this("man", 25);
	}

	// 2.2
	TvMaker(String name, int age) {//인스턴스를 통해 heap에 인스턴스 생성(TvMaker tm = new TvMaker()를 통해 생성)
		this.name = name;
		this.age = age;
	}
}

class TvControll { //M.A에 TvControll클래스 생성
	final int MAX_VOLUME = 100;//main()클래스 메서드에서 tc를 인스턴스화 하면서 인스턴스변수 생성되어 heap에 적재
	final int MIN_VOLUME = 0;//main()클래스 메서드에서 tc를 인스턴스화 하면서 인스턴스변수 생성되어 heap에 적재
	static final int MAX_CHANNEL = 50;//M.A에 생성된 TvControll클래스안에 클래스변수 생성
	static final int MIN_CHANNEL = 1;//M.A에 생성된 TvControll클래스안에 클래스변수 생성

	static int channel = 15;//M.A에 생성된 TvControll클래스안에 클래스변수 생성:15->16
	int volume = 99;//main()클래스 메서드에서 tc를 인스턴스화 하면서 인스턴스변수 생성되어 heap에 적재:99->100->0

	// 4. return문
	int volumeUp() {//main()클래스 메서드에서 tc를 인스턴스화 하면서 인스턴스메서드 생성되어 heap에 적재,main()에서 tc.volumeUp() 호출로 실행
		if (volume == MAX_VOLUME) { //1.volume은 99 MAX_VOLUME은 100갖고 있어서 서로다르기에 else문 내용 실행, 2.volume은 100 MAX_VOLUME은 100갖고 있어서 if문 내용 실행
			volume = MIN_VOLUME;	//MIN_VOLUME값을 volume에 넣어서 volume은 0됨
		} else {					//volume값 1증가로 100됨
			volume++;
		}

		return volume; //1.100반환 2.0반환
	}

	static int volumeDown() {//M.A에 생성된 TvControll클래스안에 클래스메서드 생성,main()클래스 메서드에서 TvControll.volumeDown()호출로 실행
		if (channel == MAX_CHANNEL) { //channel에는 15, MAX_CHANNEL에는 50들어서 서로 값이 달라 else안의 내용 실행
			channel = MIN_CHANNEL;
		} else {					 // channel값을 1증가해 channel값 16
			channel++;
		}
		return channel; // 16을 리턴 후 클래스메서드 종료
	}
}

class Calc { //M.A에 Calc클래스 생성
	// 5.
	int add(int a, int b) { //main()클래스 메서드에서 cc에 인스턴스화 하며 인스턴스 메서드로 생성되어 heap에 생성
		return a + b;
	}

	long add(long a, int b) { //main()클래스 메서드에서 cc에 인스턴스화 하며 인스턴스 메서드로 생성되어 heap에 생성
		return a + b;
	}

	int minus(int a, int b) { //main()클래스 메서드에서 cc에 인스턴스화 하며 인스턴스 메서드로 생성되어 heap에 생성
		return a + b;
	}
}