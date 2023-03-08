//Створити метод findWordPosition. Метод приймає як параметри два рядки (source, target).
//        Необхідно з'ясувати, чи є target (підрядок) частиною рядка source.
//        Якщо так, тоді повернути номер позиції (індекс) першого елемента підрядка у рядку,
//        інакше повернути -1.
//        Приклад 1:
//        Source: Apollo
//        Target: pollo
//        Result: 1

public class FindWordPosition {
    public static void main(String[] args) {
        String source = "Apollo";
        String target = "pollo";
        System.out.println(findWordPosition(source, target));
    }


    public static int findWordPosition(String source, String target) {
        if (source.contains(target)){
            return source.indexOf(target.charAt(0));
        }
        return -1;
    }

}