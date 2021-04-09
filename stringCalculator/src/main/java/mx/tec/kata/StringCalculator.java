package mx.tec.kata;

public class StringCalculator {
	public int add(String numbers)
	{
		if(numbers.isBlank()) 
		{
			return 0;
		} 
		else 
		{
			String[] splitNumbers = numbers.split(",");
			
			int sum = 0;

			for(String numString: splitNumbers)
			{
				sum += Integer.parseInt(numString);
			}
			
			return sum;
		}
	}

}
