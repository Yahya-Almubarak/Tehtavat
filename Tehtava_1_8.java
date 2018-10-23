import java.util.Scanner;

public class Tehtava_1_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your birth year (YYYY)");
		int birthday = input.nextInt();
		System.out.println("Enter your favourite number");
		int number = input.nextInt();
		if(birthday == 1970 && number == 77) {
			System.out.println("Olet onnenpekka");
		}
		input.close();
			

	}

}
