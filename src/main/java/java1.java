import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        /**
         * Метод позволяет пользователю ввести 2 дробных числа, выводя сумму этих чисел до 4-го знака после запятой
         * @autor Муратов И.Р.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scan.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scan.nextDouble();
        double c = a + b;
        System.out.printf("Резуьтат сложения: %.4f", c);
        System.out.print("\nВыберите тип операции, введите символ: сложение - '+', вычитание - '-', умножение - '*', деление - '/': ");
        String empty= scan.nextLine();
        String math = scan.nextLine();
        double d = 0;
        if (math.equals("+")){
            d = a + b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("-")){
            d = a - b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("*")){
            d = a * b;
            System.out.printf("Ответ: %.4f", d);
        } else if (math.equals("/")){
            d = a / b;
            System.out.printf("Ответ: %.4f", d);
        } else System.out.println("Введен некорректный символ");
    }
}

