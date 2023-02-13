# Завдання 12. Визначити кількість способів, якими можна піднятися на 10-ту сходинку драбини, якщо можливо підніматися перестрибуючи не більше ніж через дві сходинки.
Ось програма на Java, яка обчислює кількість способів піднятися по драбині з 10 сходинками, де ви можете зробити 1 або 2 кроки за раз:  
Код файлу ```Exercise.java```:

```java
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
```
![alt-текст](https://github.com/ppc-ntu-khpi/java-arrays-Articso/blob/master/Solution/screen1.png)

Код файлу ```TestResult.java```:

```java
package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        exercise.display();
    }
}
```
![alt-текст](https://github.com/ppc-ntu-khpi/java-arrays-Articso/blob/master/Solution/screen2.png)  

***Резльтат виконання програми:***  
![alt-текст](https://github.com/ppc-ntu-khpi/java-arrays-Articso/blob/master/Solution/screen3.png)  

Ця програма використовує рекурсивну функцію Calculate для обчислення кількості способів піднятися по сходах. Функція приймає кількість кроків як аргумент і повертає кількість шляхів підйому по цих сходинках. Основними випадками для функції є коли n дорівнює 0 або 1, і в цьому випадку є лише один спосіб піднятися сходами. Рекурсивний випадок — це коли n більше за 1, і в цьому випадку кількість шляхів підйому по n сходинок дорівнює кількості шляхів підйому на n-1 сходинок плюс кількість шляхів підйому на n-2 сходинки. Це тому, що ви можете зробити 1 або 2 кроки за раз.
