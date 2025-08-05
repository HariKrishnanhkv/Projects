package Basics;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 12345; //5
		int x=0;
		int y=0;
		
		while(a>0)
		{
			//y=a%10;
			a=a/10;
			x++;
		}
		//System.out.println(y);
		System.out.println(x);
	}

}
