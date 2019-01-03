package String;
public class String_9 
{
public static void main(String[] args) 
{
	String strInput="**abcd";
	String strOutput="";
	int len=strInput.length();
	if(strInput.startsWith("**"))
	{
		if(len>3)
			strOutput += strInput.substring(3);
	}
	else if(strInput.startsWith("*"))
	{
		if(len>2)
			strOutput += strInput.substring(2);
	} 
	else if(strInput.indexOf("**") != -1)
	{
		int index = strInput.indexOf("**");
		strOutput += strInput.substring(0, index-1)+strInput.substring(index+3, strInput.length());
	
	}
	else if(strInput.indexOf("*") != -1)
	{
		int index = strInput.indexOf("*");
		strOutput += strInput.substring(0,index-1)+ strInput.substring(index+2, strInput.length());
	}
		System.out.println(strOutput);
	
	}
}