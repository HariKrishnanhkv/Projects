package Basics;

public class Palindrome_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//palindrome
		
		int a =12322;
		int x =0;
		int y = 0;
		int c=a;
		
		while(a>0)
		{
		x=a%10 ; //1
		y= y * 10 + x;  ///Put (x+y) we will get sum of digits
		a=a/10; //12 
		//System.out.println(a); //12
		}
		
		//System.out.println(x); //1
		System.out.println(y); //1 ///reverse a number
		//System.out.println(a); //12
		
		if (y==c)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a Palindrome");
		}
	}
	

}
