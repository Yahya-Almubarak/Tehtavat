import java.util.Scanner;

public class Tehtava_1_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Syötä luku");
		float luku = input.nextFloat();
		if(luku > 100.0) {
			System.out.println("Syötit luvun, joka on suurempi kuin 100");
		}
		else if (luku < 100.0) {
			System.out.println("Syötit luvun joka on pienempi kuin 100");
			}
		else {
			System.out.println("luku on 100");
		}

	}

}
