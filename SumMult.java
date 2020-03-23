/*
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль
 */

public class SumMult {

    public static void main(String[] args) {

        long sum = 0;
        double mult = 1;

        for (int i = 0; i < args.length; i++) {

            sum += Integer.parseInt(args[i]);

        }

        System.out.println("Sum of numbers: " + sum);

        for (int i = 0; i < args.length; i++) {

            mult *= Integer.parseInt(args[i]);

        }

        System.out.println("Mult of numbers: " + mult);

    }
}