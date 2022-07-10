public class OperatorEx12 {
    public static void main(String[] args){
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1+1;

        c3 = (char)(c1+1);
        c2++;
        c2++;   // c2 = c2+1;을 할 경우 연산결과는 int 형이므로 형변환 연산자를 사용하지 않을 경우 에러 발생

        /* ex)
        c1 = 'a';
        c2 = c1+1; // 에러
        c2 = 'c1'+1 // 정상작동
         */
        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
