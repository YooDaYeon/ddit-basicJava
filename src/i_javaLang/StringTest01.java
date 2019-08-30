package i_javaLang;

public class StringTest01 {
	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3==str4); //new를 통해 두개 만들었으니 주소가 다르
		System.out.println(str3.equals(str4));
		
		System.out.println(str1.equals(str4));
		
	}
}
