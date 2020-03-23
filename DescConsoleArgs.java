/*
 * 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class DescConsoleArgs {
	
    public static void main(String[] args) {
		
        for (int i = args.length-1; i >= 0; i--) {
			
            System.out.println(args[i]);
			
        }
    }
}