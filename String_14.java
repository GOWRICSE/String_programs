package String;
import java.util.Scanner;
public class String_14 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the character : ");
	char ch1=sc.nextLine().charAt(0);
	if(Character.isLowerCase(ch1))
	{
	System.out.println(String.valueOf(ch1).toLowerCase());	
	}
	else
	{
		System.out.println(String.valueOf(ch1).toUpperCase());
	}
	}
}