package com.marticus.train1;

public class thrw {

	public static void main(String[] args) throws Invalidmodeexception   {
		try {
			validateInvalidmodeexception("volvo");
			}
			catch(InvalidLanguageException ex)
			{
				
				ex.printStackTrace();
			}
			

		}
		

	public static void validateLanguage(String langName) throws InvalidLanguageException
	{
		
		if(langName!="Java")
		{
				throw new InvalidLanguageException("Invalid model-");
		}
		else
		{
			System.out.println("Valid model");
			
		}
		
	}

}
