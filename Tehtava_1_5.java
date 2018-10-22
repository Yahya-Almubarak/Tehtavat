import java.util.Scanner;

public class Tehtava_1_5 {

	public static void main(String[] args) {
		String[] days = {"Maanantai", "Tiistai", "Keskiviikko",
							"Torstai", "Perjantai", "Lauantai",
							"Suununtai"};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter day's number");
		int dayNumber = input.nextInt();
		if(dayNumber >=1 && dayNumber <= 7) {
			System.out.println("Day is: " + days[dayNumber -1]);
		}
		else {
			System.out.println("Not a valid day number");
		}
		

	}

}
