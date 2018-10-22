import java.util.Scanner;

public class Tehtava_1_4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println(" Enter 1 for conversion of hours and minutes into seconds");
		 System.out.println(" Enter 2 for conversion of Euros to Marks");
		 System.out.println(" Enter 1 for conversion of Marks to Euros");
		
		int choice = input.nextInt();
		int hours, minutes, seconds, totalSeconds;
		float euros, marks;
		switch(choice) {
		case 1:
			System.out.println("Enters hours");
			hours = input.nextInt();
			System.out.println("Enter minutes");
			minutes = input.nextInt();
			System.out.println("Enter seconds");
			seconds = input.nextInt();
			totalSeconds = (hours*60 + minutes) * 60 + seconds;
			System.out.println("Total seconds are: " + totalSeconds);
			break;
		case 2:
			System.out.println("Enter number of Euros");
			euros = input.nextFloat();
			marks = euros * 6; //each euro equals 6 marks;
			System.out.println( euros + " Euros equals  " + marks + " Marks");
			break;
		case 3:
			System.out.println("Enter number of Marks");
			marks = input.nextFloat();
			euros =  marks/ 6;
			System.out.printf("%.2f Marks equals %.2f Euros", marks, euros);
		}

	}

}
