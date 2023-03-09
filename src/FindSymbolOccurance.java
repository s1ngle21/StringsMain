//Створити метод findSymbolOccurance. Метод приймає як параметр рядок і символ.
// Необхідно обчислити, скільки разів символ зустрічається в переданому рядку
// і повернути це числове значення.


import java.util.Objects;

public class FindSymbolOccurance {
    public static void main(String[] args) {
        String line = "Some line in here";
        char symbol = 'e';
        System.out.println(findSymbolOccurance(line, symbol));
    }

    public static int findSymbolOccurance(String line, char symbol) {
        Objects.requireNonNull(line, "Line can not be null");
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

}

