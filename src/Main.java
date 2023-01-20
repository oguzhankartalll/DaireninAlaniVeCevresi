import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		double alan,cevre,pi = 3.14;
		int r;

		Scanner kb = new Scanner(System.in);

		System.out.print("Lütfen Dairenin Yarıçapını Giriniz:");
		r = kb.nextInt();

		alan = pi * r * r;
		cevre = 2 * pi * r;

		System.out.println("Alanı:" + " " + alan);
		System.out.println("Çevresi:" + " " + cevre);

	}
}