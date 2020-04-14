package thebigword.aem.pages;

public class Practice_Programs {
	
	String str = "MALAYALAM MALAYALAM";	
	String Reverse = "";
	
	void normal_Reverse()
	{
		StringBuffer Rev;		
		int sizeofstring = str.length();		
		System.out.println("length of the string is "+sizeofstring);		
		Rev = new StringBuffer(str);
		String Reversed =	Rev.reverse().toString();
		System.out.println(Reversed);
		
		if(str.equals(Reversed))
		{
			System.out.println("Given string"+str+" is a Palindrome");
		}else
		{
			System.out.println("Not a Palindrome");
		}
	}
	
	void logical_Reverse()
	{
		
		int lengthofString = str.length();
		
		for(int i=lengthofString-1;i>=0;i--)
		{
			Reverse = Reverse + str.charAt(i);
		}
		
		System.out.println(Reverse);
		if(Reverse.equals(str))
		{
			System.out.println("Given string is a Palindrome");
		}else
		{
			System.out.println("Not a Palindrome");
		}
	}
	
	void fibonacci()
	{
		int n1 = 0 ; int n2 = 1;
		int temp = 0;
		
		int count = 100;
		System.out.print(n1+","+n2);
		for(int i =2;i<count; i++)
		{
		 temp = n1 + n2;
		 if(temp >= 100)
			 break;
		 System.out.print(","+temp);	
		 n1 = n2;
		 n2 = temp;
		
		// System.out.print(","+n2);	
		}
		
		
	}
	
	void primeNumber()
	{
		int p = 91;
		int flag = 0;
		int temp = 0;
		int r ;
		
		for(int i=1;i<=p;i++)
		{
			
			r= p%i;
			
			if(r==0 )
			{
				flag++;
			}
			
			temp = flag;
		}
		
		if(temp>2)
		{
			System.out.println("Not");
		}else
		{
			System.out.println("Prime");
		}
		
	}
	
	void remove_Spaces()
	{
		
		String r = "Removing spaces from a String";
		
	String[] r2=	r.split(" ");
		
	System.out.println(r2.length);
	for(int i = 0;i<r2.length;i++)
	{
		System.out.print(r2[i]);
	}
	}
	
	int count;
	void remove_Repeated()
	{
		String rs = "how many time does an average age of an indian";
		
		char string[] = rs.toCharArray();
		
		for (int i =0;i<rs.length();i++)
		{
			count = 1;
			for(int j = i+i;j<rs.length();j++)
			{
				if(string[i]==string[j] &&string[i]!=' ')
				{
					System.out.print(string[i]);
					count++;
				}
			}
				
		}
		
	}
	
	public static void main(String[] args) {		
		
		Practice_Programs p = new Practice_Programs();
		//p.normal_Reverse();
	//	p.logical_Reverse();
		p.remove_Repeated();
		//p.fibonacci();
		//p.primeNumber();
		//p.remove_Spaces();
	}
}	
