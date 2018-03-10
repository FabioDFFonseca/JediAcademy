import java.util.Scanner;

public class JediRules {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Jedi Academy!");
		System.out.println("Qual é o teu nome jovem padawan?");
		
		String padawan = scanner.nextLine();

		System.out.println("Olá " + padawan + ", sê bem-vindo á nossa ilustre academia! " + "\n\r" + "May the force be with you!");
	}

}
