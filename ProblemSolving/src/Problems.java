import java.util.Scanner;

public class Problems {
	
	public static void main(String[] args) {
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Number Please!");
		int n = input.nextInt();
		
		while(n>0)
		{
			n = n/10;
			count++;
	    }
		System.out.println(count);
	}
}
