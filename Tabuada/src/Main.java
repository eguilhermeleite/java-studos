import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.print("Digite um número para a tabuada: ");
		x = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			y = i*x;
			System.out.println(i +" x " + x + " = " + y);
		}
		
		sc.close();

	}

}
