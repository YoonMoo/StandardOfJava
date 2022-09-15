import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){
        // 5-1
        // a. 올바름
        // b. 올바름
        // c. 올바름
        // d. 크기와 사이즈 지정 // 두번째 대괄호에 숫자 x
        // e. 비정상적인 초기화 // 배열을 선언할 때는 배열 크기 지정 x
        // f. 정상(행,열 중 행의 값은 필수)

        // 5-2
        // 2

        // 5-3
        /*int[] arr = {10,20,30,40,50};
        int sum=0;
        for(int i = 0 ; i < arr.length ; i++){
            sum+=arr[i];
        }
        System.out.println(sum);*/

        // 5-4
       /* int[][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                total += arr[i][j];
            }
        }

        average = (float)total / arr.length / arr[0].length;

        System.out.println("total = " + total);
        System.out.println("average = " + average);*/

        // 5-5
        /*int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        for(int i = 0 ; i < ballArr.length; i++){
            int j = (int)(Math.random() * ballArr.length);
            int tmp =0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        System.arraycopy(ballArr, 0, ball3, 0, 3);

        for(int i = 0 ; i < ball3.length ; i++){
            System.out.print(ball3[i]);
        }*/

        // 5-6

       /* int[] coinUnit = {500, 100, 50, 10};
        int money = 2680;
        int tmpM = 0;

        System.out.println("money="+money);
        for(int i=0;i<coinUnit.length;i++) {
            tmpM = money;
            money /= coinUnit[i];
            System.out.println(coinUnit[i] + "원 : " + money);
            money = tmpM % coinUnit[i];
        }*/

        //5-7

        /*if(args.length!=1) {
            System.out.println("USAGE: java Exercise5_7 3120");
            System.exit(0);
        }
        int money = Integer.parseInt(args[0]);
        System.out.println("money="+money);
        int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
        for(int i=0;i<coinUnit.length;i++) {
            int coinNum = 0;

            coinNum = money/coinUnit[i];

            if(coin[i] >= coinNum){
                coin[i] -= coinNum;
            }else{
                coinNum = coin[i];
                coin[i] = 0;
            }
            money -= coinNum*coinUnit[i];

            System.out.println(coinUnit[i]+"원 : "+coinNum);
        }
        if(money > 0) {
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0); // . 프로그램을 종료한다
        }
        System.out.println("= =");
        for(int i=0;i<coinUnit.length;i++) {
            System.out.println(coinUnit[i]+" :"+coin[i]);
        }*/

        //5-8
        /*int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];

        for(int i = 0 ; i < answer.length ; i++){
            counter[answer[i]-1]++;
        }

        for(int i = 0 ; i < counter.length ; i++){
            System.out.printf("%d", counter[i]);
            for(int j = 0 ; j < counter[i]; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }*/

        //5-9
        /*char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        }; // [5][4]
        char[][] result = new char[star[0].length][star.length];
        for(int i=0; i < star.length;i++) {
            for(int j=0; j < star[i].length;j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i < star.length;i++) {
            for(int j=0; j < star[i].length;j++) {

            }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        */

        //5-10
        /*char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};
// 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
        String src = "abc123";
        String result = "";
// src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);
            if('a' <= ch && ch <= 'z') result += abcCode[ch-97];
            else if('0' <= ch && ch <='9') result += numCode[ch-48];
        }
        System.out.println("src:"+src);
        System.out.println("result:"+result);*/

        // 5-11
        /*int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];
        for(int i=0; i < score.length;i++) {
            for(int j=0; j < score[i].length;j++) {
                if(j == score[0].length-1){
                    result[i][j] = score[i][j];

                    for(int k = 0 ; k < score[0].length ; k++){
                        result[i][j+1] += score[i][k];
                    }
                }
                else if(i == score.length-1){
                    result[i][j] = score[i][j];

                    for(int l = 0 ; l < score.length ; l++){
                        result[i+1][j] += score[l][j];
                    }
                }
                else result[i][j] = score[i][j];
            }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }*/

        //5-12
        /*String[][] words = {
                {"chair"," "}, // words[0][0], words[0][1] 의자
                {"computer"," "}, // words[1][0], words[1][1] 컴퓨터
                {"integer"," "} // words[2][0], words[2][1] 정수
        };
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<words.length;i++) {
            System.out.printf("Q%d. %s ?", i+1, words[i][0]);
            String tmp = scanner.nextLine();
            if(tmp.equals(words[i][1])) {
                System.out.printf(" .%n%n");
                score++;
            } else {
                System.out.printf(" . %s .%n%n",words[i][1]);
            }
        }*/

        //5-13

       /* String[] words = { "television", "computer", "mouse", "phone" };
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<words.length;i++) {
            char[] question = words[i].toCharArray(); // String char[] 을 로 변환
            for(int j=0;j<question.length;j++) {
                int idx = (int)(Math.random() * question.length);
                char tmp = question[i];
                question[i] = question[idx];
                question[idx] = tmp;
            }
            System.out.printf("Q%d. %s .>", i+1, new String(question));
            String answer = scanner.nextLine();

            if(words[i].equals(answer.trim())) // trim : 공백제거
                System.out.printf(" .%n%n");
            else
                System.out.printf(" .%n%n");
        }*/
    }
}
