import java.util.Scanner;

public class Tehtava1_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sy�t� luku");
		float luku = input.nextFloat();
		if(luku > 100.0) {
			System.out.println("sy�tit luvun, joka on suurempi kuin 100");
		}

	}

}
