import java.util.Scanner;

/**
* 1. Приветствовать любого пользователя при вводе его имени через командную строку.
*/
public class HelloMan {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.next();
		System.out.println("Hello, " + name + "!");
		
	}
}