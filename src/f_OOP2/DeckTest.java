package f_OOP2;

import f_OOP2.Card;
import f_OOP2.Deck;

public class DeckTest {
	public static void main(String[] args) {

		Card c = new Card(3, 2);
		System.out.println(c + "\n"); // c.toString이 붙어있는데 숨어있는 것
	
		Deck d = new Deck();
		// for (int i = 0; i < Deck.CARD_NUM; i++) {
		// System.out.println("CARD " + (i + 1) + "번 " + d.pick(i));
		// }
		System.out.println(d.pick(1));
		System.out.println(d.pick());
		

		d.shuffle();
		d.shuffle(2);

//		for (int i = 0; i < Deck.CARD_NUM; i++) {
//			System.out.println("CARD " + (i + 1) + "번 " + d.pick(i));
//		}

	}
}

class Card { // extends Object가 숨어있음
	static final int KIND_MAX = 4; // 카드 무늬수
	static final int NUM_MAX = 13;// 무늬별 카드수

	static final int SPADE = 1;
	static final int CLOVER = 2;
	static final int DIAMOND = 3;
	static final int HEART = 4;

	int kind;
	int number;

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() { // alt+shift+s -> v -> toString체크
		// TODO Auto-generated method stub
		String kind = "";
		String number = "";

		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "CLOVER";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		default:
			kind = "HEART";
			break;
		}

		switch (this.number) {
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number = Integer.toString(this.number);
			// number+=this.number;
			break;
		}

		return kind + "," + number;
	}

}

class Deck {
	// 1. 카드의 수량을 저장할 수 있는 변수 CARD_NUM을 선언 및 초기화
	// 단. 초기화 시 Card클래스의 상수 이용
	static final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX;
	// 2. 카드 52장을 저장할 수 있는 변수 c를 선언 및 생성
	// 단. c의 크기는 1에서 만든 변수를 이용
	Card[] c = new Card[CARD_NUM];

	// 3. 기본생성자 생성
	// 생성자 내부에서 수행될 문장은 변수 c의 각방을 1일떄,1~13까지로 초기화
	Deck() {
		int x = 0;
		for (int i = 1; i < Card.KIND_MAX + 1; i++) {
			for (int j = 1; j < Card.NUM_MAX + 1; j++) {
				c[x++] = new Card(i, j);
			}
		}
	}

	// 4. c에서 카드 한장을 뽑을 수 있는 메서드 생성, pick
	// 단. 인자값으로 받은 방의 카드를 반환해야 함
	Card pick(int a) {
		Card x = c[a];
		return x;
	}

	// 5. c에서 랜덤한 방의 카드한장을 뽑을 수 있는 메서드 생성 pick
	// 단. 4번에서 만들 pick메서드를 활용
	Card pick() {
		int a = (int) (Math.random() * CARD_NUM);
		Card x = c[a];
		return x;
	}

	// 6. 카드를 섞어러 메서드명 shuffle
	// 연습문제형태로 섞어라 방끼리 바꾸리 0번방이랑 다른방 바꾸고 1번방이랑 다른방 바꾸고
	void shuffle() {
		for (int i = 0; i < CARD_NUM; i++) {
			int x = (int) (Math.random() * CARD_NUM);
			Card tmp = c[i];
			c[i] = c[x];
			c[x] = tmp;
		}
	}

	// 7. 카드를 섞어라 shuffle
	// 두 개의 랜덤방의 카드 교체 랜덤방끼리 바꾸기-
	// 인자값으로 받은 숫자만큼 반복
	void shuffle(int a) {
		for (int i = 0; i < a; i++) {
			int x = (int) (Math.random() * CARD_NUM);
			int y = (int) (Math.random() * CARD_NUM);
			Card tmp = c[y];
			c[y] = c[x];
			c[x] = tmp;
		}
	}
}