import java.util.Scanner;

public class JediRules {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Jedi Academy!");
		System.out.println("Qual � o teu nome jovem padawan?");
		
		String padawan = scanner.nextLine();

		System.out.println("Ol� " + padawan + ", s� bem-vindo � nossa ilustre academia! " + "\n\r" + "May the force be with you!");
	}

}
