import java.util.Scanner;

public class Tehtava_1_6 {

	public static void main(String[] args) {
		/*1-17 olet alaikäinen
		18-33 olet nuori
		34-50 olet keski-ikäinen
		51- olet vanha*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age ( as an integer) ");
		
		int age = 0;
		try {
			age = input.nextInt();
		} catch (Exception e) {
			System.out.println("age should be integer");
			return;
		}
		if(age >= 1 && age <=17) System.out.println("olet alaikäinen");
		if(age >= 18 && age <=33) System.out.println("olet nuori");
		if(age >= 34 && age <=50) System.out.println("olet keski-ikäinen");
		if(age > 50) System.out.println("olet vanha");
		if(age < 1) System.out.println("et ole syntynyt vielä");
	}

}
