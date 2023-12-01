import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Создаем список чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Используем Stream API для фильтрации четных чисел
        // и вычисления среднего значения
        double average = numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтрация четных чисел
                .mapToDouble(Integer::doubleValue) // Преобразование в double
                .average() // Вычисление среднего значения
                .orElse(0.0); // Возвращаем 0.0, если список пуст

        // Выводим результат на экран
        System.out.println("Среднее значение четных чисел: " + average);
        }
    }