// Find sum of first N natural numbers

import java.util.Scanner;
class SumNatural{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N natural: ");
		int n = sc.nextInt();
		
		if(n<=0){
			System.out.println("Please Enter Positive Number");
			sc.close();
		    return;
		}
	
		int sum = 0;
			for(int i =1;i<=n;i++){
				sum +=i;
			}
			System.out.println("Sum of N Natural Number: "+sum);
			
		
		
		sc.close();
		
		
	}
}