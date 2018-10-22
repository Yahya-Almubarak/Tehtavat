import java.util.Scanner;

public class Tehtava1_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Syötä luku");
		float luku = input.nextFloat();
		if(luku > 100.0) {
			System.out.println("syötit luvun, joka on suurempi kuin 100");
		}

	}

}
