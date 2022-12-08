import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		int sum;
		if(a > 0 && b > 0) {
			sum = a + b;
			return sum;
		}
		else {
			throw new IllegalArgumentException("both numbers must be positive");
		}
	}
	int randomNumberSquared(){
		
		int returnedNumber = 0;
		int random = getRandomInt();
		
		returnedNumber = random * random;
		
		return returnedNumber;
	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) +1;
		
	}
	
		
		
		
	
}
