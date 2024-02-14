public class helloworld 
{ 
	public static void main (String args[])
	{
		System.out.println("Hello World! Welcome to DevOps Training Section!!!!");
		int a=100;
		int b=75;
		int d = a - b;
		int e = a*b;
		int f = a / b;
		double a1 = 15;
		double b1 = 3;
		double c1 = Math.pow(a1,b1);
		System.out.println("Subtraction of a="+a+" and b= "+b+" is "+d);
		System.out.println("Multiplication of a="+a+" and b= "+b+" is "+e);
		System.out.println("Division of of a="+a+" and b="+b+" is "+f);
		System.out.println("Power of a1 and b1 is "+c1);
		System.out.println("Adding new Main");
		System.out.println("Condition details verification");
		if (a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("a is lesser than b");
		}
	System.out.println("Fibonacci Series");
		for(i=2;i<count;++i)
		    	{
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
	System.out.println("String Counting process");
		String string="Welcome the world of IT Environments";
		int cnt=0;
		for(int i1=0;i1<string.length();i1++)
			{
				if(string.charAt(i1) !=' ')
					cnt++;
			}
		System.out.println("Count of the given character string is "+cnt);
		int count1 = 0;    
		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";    
		for (int i = 0; i < str.length(); i++)   
		{    
		//Checks whether given character is punctuation mark    
		if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
		str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
		{    
		count1++;    
		}    
		}    
		System.out.println("The number of punctuations exists in the string is: " +count1);    
	}
}
