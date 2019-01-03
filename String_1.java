package String;
public class String_1 
{
public static void main(String[] args) 
{
	String s ="bhugbuyiun";	
	StringBuffer a=new StringBuffer(s); 
	a=a.reverse();
	if(s.equals(a.toString()))	
	{
	System.out.println(s+" is Palindrome.");	
	}
	else 
	{
		System.out.println(s+" is not Palindrome.");
	}
}
}