//Створити метод isPalindrome. Метод приймає як параметр - рядок.
// Необхідно Перевірити, чи є переданий рядок паліндромом.
// Якщо так, тоді повернуть true, інакше false.
//
//        Приклад 1:
//
//        ERE -> true

public class ІsPalindrome {
    public static void main(String[] args) {
        String str = "ERE";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

