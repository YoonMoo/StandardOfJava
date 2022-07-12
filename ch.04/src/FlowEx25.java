import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args){
        int num = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 : ");
        num = scanner.nextInt();

        while(num != 0){
            sum += num % 10;
            System.out.printf("sum =%3d num = %d \n", sum, num);
            num /= 10;
        }

        System.out.printf("각 자리수의 합 : %d \n", sum);
    }
}
