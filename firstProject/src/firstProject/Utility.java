package firstProject;

import java.util.Scanner;

public class Utility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculator cal=new calculator();
		System.out.print("Ënter 1st number:");
		int a=sc.nextInt();
		System.out.print("Ënter 2nd number:");
		int b=sc.nextInt();
		
			cal.add(a, b);
		
			cal.sub(a, b);
		
			cal.multi(a, b);
		
			cal.div(a, b);
		
			cal.mod(a, b);
		

	}

}
