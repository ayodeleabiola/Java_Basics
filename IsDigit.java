public class IsDigit{
	public static void main(String[] arre)
	{
		String password = "Abiola";
		char c;

		c = '0';
		System.out.print(String.format("%c: %d\n", c, _isdigit(c)));
		c = 'a';
		//System.out.print(String.format("%c: %d\n", c, _isdigit(c)));
		
		
		 isDigits();
		 
		 System.out.print(" ");
		 isLowerCase();
		 
		 System.out.print(" ");
		 
		 isUpperCase();
		 
		string_toupper(password);
		 
		
	}
	
	public static int _isdigit(int c)
	{
		
			if (c >= '0' && c <= '9')
			{
				System.out.println(" "+ c);
				return (1);
			}
			return (0);
    }
	
	public static void isDigits()
	{
		for (int num = 0; num <= 9; num++)
		{
			System.out.print("" +num);
		}
	}
	public static void isLowerCase()
	{
	
		for( int c = 'a'; c <= 'z'; c++)
				System.out.println(" "+ c);
	}
	public static void isUpperCase()
	{
		for (int let = 'A'; let <= 'Z'; let++)
			System.out.println(" "+let);
	}
	
	
	public static void string_toupper(String str)
{
	int index = 0;
	char ch = '\0';

	while (index != str.length())
	{
		 ch = str.charAt(index);
		if (ch >= 'A' && ch <= 'Z')
			ch += 32;
		System.out.print((" "+ch));

		index++;
	}

	 
}
		
	
}