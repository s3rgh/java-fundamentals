import java.util.Scanner;

/*
* 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
*/

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
					
			int a = (int) (Math.random()*(200+1)) - 100; // [-100; 100]
			
			System.out.println(a);
		}
		
		for (int i = 0; i < n; i++) {
					
			int a = (int) (Math.random()*(200+1)) - 100; // [-100; 100]
			
			System.out.print(a + " ");
		}
		
	}
}