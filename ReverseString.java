package Basics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method 1 - Using String Buffer
		String s ="Hari";
		StringBuffer Buf = new StringBuffer(s);
		Buf.reverse();
		System.out.println(Buf);

	}

}
