
public class StringTest1 {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		String c = new String("Hello");
		
		System.out.println(a.charAt(0));
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(c.equals(a));
	}
}
