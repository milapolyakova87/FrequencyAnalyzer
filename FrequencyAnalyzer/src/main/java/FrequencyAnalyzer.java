import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyAnalyzer {

    // Метод для подсчета частоты символов в строке (с приведением к нижнему регистру)
    public static Map<Character, Integer> countCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Преобразуем строку в нижний регистр
        String lowerCaseInput = input.toLowerCase();

        // Проходим по каждому символу в строке
        for (char c : lowerCaseInput.toCharArray()) {
            // Игнорируем пробелы
            if (c != ' ') {
                // Если символ уже есть в мапе, увеличиваем счетчик
                if (frequencyMap.containsKey(c)) {
                    frequencyMap.put(c, frequencyMap.get(c) + 1);
                } else {
                    // Если символа нет в мапе, добавляем его со счетчиком 1
                    frequencyMap.put(c, 1);
                }
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем строку у пользователя
        System.out.println("Введи строку:");
        String input = scanner.nextLine();

        // Вызываем метод для подсчета частоты символов
        Map<Character, Integer> frequencyMap = countCharacterFrequency(input);

        // Выводим результат
        System.out.println("Частота символов в строке без учета регистра:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}