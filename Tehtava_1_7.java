import java.util.Scanner;

public class Tehtava_1_7 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Enter you first name");
			String firstName = input.nextLine();
			System.out.println("Enter you last name");
			String lastName = input.nextLine();
			System.out.println("Enter you age");
			int age = input.nextInt();
			System.out.println("Terve " + firstName + " " + lastName + ", olet " + age + " vuotias");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
