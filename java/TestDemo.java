import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {			
			
		if (a <= 0 || b <= 0)
		{			
			throw new IllegalArgumentException("Both parameters must be positive!");			
		}
		else if(a > 0 && b > 0)
		{
			return a + b;
		}else {
			System.out.println("Error has occured!");	
			return 99999;  //using sentinel value
		}
		
	}	
	public int randomNumberSquared() {
		int rand = getRandomInt();
		return rand * rand;	

	}
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}