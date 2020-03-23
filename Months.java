import java.util.Scanner;

/*
* 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел
*/
public class Months {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number from 1 till 12: ");
		
		int number = scanner.nextInt();
					
			switch (number) {
				
				case (1):
				
					System.out.println("JANUARY");
					break;
				
				case (2):
				
					System.out.println("FEBRUARY");
					break;

				case (3):
				
					System.out.println("MARCH");
					break;
				
				case (4):
				
					System.out.println("APRIL");
					break;
				
				case (5):
				
					System.out.println("MAY");
					break;
				
				case (6):
				
					System.out.println("JUNE");
					break;
				
				case (7):
				
					System.out.println("JULY");
					break;
				
				case (8):
				
					System.out.println("AUGUST");
					break;
				
				case (9):
				
					System.out.println("SEPTEMBER");
					break;
				
				
				case (10):
				
					System.out.println("OCTOBER");
					break;
				
				case (11):
				
					System.out.println("NOVEMBER");				
					break;
				
				case (12):
				
					System.out.println("DECEMBER");
					break;
				
				default:
				
					System.out.println("Such a month does not exist!");
					break;
			
		}	
	}
}