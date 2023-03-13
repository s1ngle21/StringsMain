import java.util.Objects;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(stringReverse(str));
    }

    public static String stringReverse(String str) {
        Objects.requireNonNull(str, "String line can not be null");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1 = sb.toString();
        return str1;
    }
}
