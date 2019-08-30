package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		TimeVO t = new TimeVO();
		t.setHour(21);
		System.out.println(t.getHour());
		t.setMinute(140);
		System.out.println(t.getHour() + " : " + t.getMinute()); // 8:20

		t.setSeconds(10000);
		System.out.println(t.getHour() + " : " + t.getMinute() + " : "
				+ t.getSeconds());// 11:6:40
	}
}

class TimeVO {
	private int hour;
	private int minute;
	private int seconds;

	void setHour(int hour) {
//		if (hour > 23) {
//			this.hour = hour % 24;
//		} else {
//			this.hour = hour;
//		}
		
		this.hour = hour > 23 ? hour % 24 : hour;
		this.hour=hour%24;
	}

	int getHour() {
		return hour;
	}

	void setMinute(int minute) {
		this.minute=minute%60;
		setHour(hour+=minute/60);
	}

	int getMinute() {
		return minute;
	}

	void setSeconds(int second) {
		setMinute(minute+=second/60);
		this.seconds=second%60;
	}
		
	int getSeconds() {
		return seconds;
	}

}