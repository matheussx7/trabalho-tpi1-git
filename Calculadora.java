public class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divisao por zero!");
        return a / b;
    }

    // Metodo principal de execucao da calculadora
    public static void main(String[] args) {
        System.out.println("Soma: " + somar(2, 3));
        System.out.println("Subtracao: " + subtrair(5, 2));
        System.out.println("Multiplicacao: " + multiplicar(3, 4));
        System.out.println("Divisao: " + dividir(10, 2));
    }
}