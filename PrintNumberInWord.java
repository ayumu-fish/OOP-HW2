import java.util.Scanner;

public class PrintNumberInWord {
	public static void main(String[] args){
	Scanner cin=new Scanner(System.in);
	int no;
	
	System.out.printf("please enter the number(1~9):");
	no=cin.nextInt();
	
	switch(no){
	case 1:System.out.printf("The input integer is ¡§ONE¡¨.");break;
	case 2:System.out.printf("The input integer is ¡§TWO¡¨.");break;
	case 3:System.out.printf("The input integer is ¡§THREE¡¨.");break;
	case 4:System.out.printf("The input integer is ¡§FOUR¡¨.");break;
	case 5:System.out.printf("The input integer is ¡§FIVE¡¨.");break;
	case 6:System.out.printf("The input integer is ¡§SIX¡¨.");break;
	case 7:System.out.printf("The input integer is ¡§SEVEN¡¨.");break;
	case 8:System.out.printf("The input integer is ¡§EIGHT¡¨.");break;
	case 9:System.out.printf("The input integer is ¡§NINE¡¨.");break;
	default :System.out.printf("The input integer is ¡§OTHER¡¨.");break;
	
	}
	cin.close();
	}
}
