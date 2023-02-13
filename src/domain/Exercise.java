package domain;

public class Exercise {
    // Функція для обчислення кількості шляхів підйому по 10 сходинках
    public static float Calculate(int n){
        // основні випадки
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        // рекурсивний випадок
        return Calculate(n - 1) + Calculate(n - 2);
    }
    public void display() {
        int n = 10;
        int ways = (int) Calculate(n);
        System.out.println("Number of ways to climb " + n + " steps: " + ways);
  }
}
