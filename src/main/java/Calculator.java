import java.util.Scanner;

public class Calculator {


    public void calculator() {

        Scanner scanner = new Scanner(System.in);

        Minus minus = new Minus();
        Multiply multiply = new Multiply();
        Plus plus = new Plus();
        Split split = new Split();
        NonNegativePower power = new NonNegativePower();
        int a = 0;
        int b = 0;


        String checkExit = scanner.nextLine();
        if (checkExit.equals("exit")) {
            System.exit(0);

        } else {

            if (checkExit.matches("-?\\d+")) {
                a = Integer.parseInt(checkExit);
            } else {
                System.out.println("Некорректный ввод");
                calculator();
            }

            String operation = scanner.nextLine();

            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
            } else {
                System.out.println("Некорректный ввод");
                calculator();
            }

            if (b == 0 && operation.equals("/")) {
                System.out.println("На ноль делить нельзя!\n (ಠ_ಠ)");
                calculator();
            }

            if (b < 0 && operation.equals("^")) {
                System.out.println("Я не умею возводить число в отрицательную степень\n" + "\\_(ツ)_/¯");
                calculator();
            }

            switch (operation) {
                case ("-"):
                    System.out.println(minus.execute(a, b));
                    break;
                case ("*"):
                    System.out.println(multiply.execute(a, b));
                    break;
                case ("+"):
                    System.out.println(plus.execute(a, b));
                    break;
                case ("/"):
                    System.out.println(split.execute(a, b));
                    break;
                case ("^"):
                    System.out.println(power.execute(a, b));
                    break;
                default:
                    System.out.println("Некорректная операция");
            }
            calculator();
        }
    }
}

