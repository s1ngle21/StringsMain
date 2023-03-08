//Створити метод findSymbolOccurance. Метод приймає як параметр рядок і символ.
// Необхідно обчислити, скільки разів символ зустрічається в переданому рядку
// і повернути це числове значення.

import java.util.Arrays;

public class FindSymbolOccurance {
    public static void main(String[] args) {
        String line = "Some line in here";
        char b = 'e';
        System.out.println(findSymbolOccurance(line, b));
    }

    public static int findSymbolOccurance (String line, char b){
        int count = 0;
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) == b) {
                count++;
            }
        }
        return count;
    }

}

