public class OperatorEx8 {
    public static void main(String[] args){
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a*b; // c가 long 타입이어도 int 타입인 a와 b의 연산결과는 int다. 범위를 넘어서서 이상한 값이 나옴
        System.out.println(c);
    }
}
