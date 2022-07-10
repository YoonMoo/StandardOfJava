public class OperatorEx23 {
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
        System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
        System.out.printf("str2==\"abc\" ? %b%n", str2=="abc"); // 내용은 같지만 다른 객체라서 false
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc")); // 객체가 달라도 내용 같으면 true
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); // 대소문자 구분 x
    }
}
