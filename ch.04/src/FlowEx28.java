import java.util.*;

public class FlowEx28 {
    public static void main(String[] args) {
        int input, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner((System.in));

        do {
            System.out.print("1과 100사이 정수를 입력 : ");
            input = scanner.nextInt();

            if(input > answer){
                System.out.println("더 작은 수 입력하기");
            }else if(input < answer){
                System.out.println("더 큰 수 입력하기");
            }
        }while (input != answer);

        System.out.println("정답입니다.");
    }
}
