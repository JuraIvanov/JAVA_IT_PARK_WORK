import java.util.Random;
class Program {
	public static void main(String[] args) {
		int ages[] = new int[1000];
		Random random = new Random();

		for(int i = 0; i < ages.length; i++) {
			ages[i] = random.nextInt(120);
		}

		for(int i = 0; i < 100; i++) {
			System.out.println(ages[i]);
			
		}