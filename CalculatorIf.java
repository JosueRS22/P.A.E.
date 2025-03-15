public class CalculatorIf {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java Calculator operand1 operador operand2");
            System.exit(1);
        }

        if (!isNumeric(args[0])) {
            System.out.println(args[0] + " " + args[1] + " " + args[2]);
            System.out.println("Entrada Incorrecta: " + args[0]);
            System.exit(1);
        }

        if (!isNumeric(args[2])) {
            System.out.println(args[0] + " " + args[1] + " " + args[2]);
            System.out.println("Entrada Incorrecta: " + args[2]);
            System.exit(1);
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        if (args[1].equals("+")) {
            result = num1 + num2;
        } else if (args[1].equals("-")) {
            result = num1 - num2;
        } else if (args[1].equals(".")) {
            result = num1 * num2;
        } else if (args[1].equals("/")) {
            result = num1 / num2;
        } else {
            System.out.println("Error: Operador inválido.");
            System.exit(1);
        }
        
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) { 
                return false;
            }
        }
        return true;
    }
}