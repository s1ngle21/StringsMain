public class StringReverse {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(stringReverse(str));
    }

    public static java.lang.StringBuilder stringReverse (String str){
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        return sb.reverse();
    }
}
