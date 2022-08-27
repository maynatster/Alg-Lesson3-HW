public class Algorithms3Homework {
    public static void main(String[] args) {
        System.out.println(calcPower(2, 3));
    }

    // 1. Даны два целых числа x и n, напишите функцию для вычисления x^n (x в степени n)
    // Первое решение выполнить рекурсивно за временную сложность O(n) - линейная
    public static int calcPower (int x, int n){
        if (n == 1)
            return x;
        return x * calcPower(x, n - 1);
    }
}
