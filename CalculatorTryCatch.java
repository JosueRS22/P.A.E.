public class CalculatorTryCatch {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java Calculator operand1 operador operand2");
            System.exit(1);
        }

        int num1, num2;

        try {
            num1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println(args[0] + " " + args[1] + " " + args[2]);
            System.out.println("Entrada Incorrecta: " + args[0]);
            System.exit(1);
            return;
        }

        try {
            num2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println(args[0] + " " + args[1] + " " + args[2]);
            System.out.println("Entrada Incorrecta: " + args[2]);
            System.exit(1);
            return;
        }

        int result = 0;

        switch (args[1]) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case ".":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Operador inválido.");
                System.exit(1);
        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}