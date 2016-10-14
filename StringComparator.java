import java.util.Scanner;

public class StringComparator {
		public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String s1,s2; 
		int result=0;
		do
		{
			System.out.printf("Enter a string 1:");
			s1=cin.next();
			System.out.printf("Enter a string 2:");
			s2=cin.next();
			result=s1.compareToIgnoreCase(s2);
			if(result!=0) System.out.printf("The two strings are not the same"); 
		}while(result!=0);
		
		System.out.printf("The two strings are the same");
		cin.close();
		}
}
