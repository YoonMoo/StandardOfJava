import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args){
        int num = 0;

        System.out.printf("*을 출력할 라인의 수를 엽락하세요 : ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for(int i = 0; i < num ; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("*");
            } System.out.println();
        }
    }
}
