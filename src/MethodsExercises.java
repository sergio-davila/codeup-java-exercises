public class MethodsExercises {
    public static void main(String[] args) {
    Addition(5, 78);
    Subtraction(65, 42);
    Multiplication(53, 42);
    Division(32, 6);
    Modulus(5, 4);
    }
    // 1.
    public static void Addition(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void Subtraction(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
    }

    public static void Multiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    public static void Division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(result);
    }

    public static void Modulus(int num1, int num2) {
        int result = num1 % num2;
        System.out.println(result);
    }


}
