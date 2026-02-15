// Check if a number is even or odd


import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		
		if(n<=0){
			System.out.println("Please Enter Positive Number");
			sc.close();
			return ;
		}
		
		else if(n%2==0){
			System.out.println("Even Number");
		}
		
		else{
			System.out.println("Odd Number");
		}
		
		sc.close();
	
	}
	
}