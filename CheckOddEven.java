import java.util.Scanner;

public class CheckOddEven {
		public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int no;
		
		System.out.printf("Enter a integer: ");
		no=cin.nextInt();
		
		if(no%2==1) System.out.printf("The input integer is Odd Number.");
		else System.out.printf("The input integer is Even Number.");
		
		cin.close();
		}
}
