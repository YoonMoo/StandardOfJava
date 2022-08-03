public class Quiz {
    public static void main(String[] args){
        /*
        4-1)
        1. 10 < x && x < 20
        2. ch != '' && ch!= '\t'
        3. ch == 'x' || ch == 'X'
        4. '0' <= ch && ch <= '9'
        5. 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z'
        6. year%400==0 || year%4==0 && year%100!=0
        7. powerOn == false
        8. str.euqals("yes")

        4-2) 73
        int sum =0;
        for(int i = 1 ; i <= 20 ; i++){
            if(i%2 != 0 || i%3 != 0) sum+=i;
        }

        4-3) 100
        int sum=0;
        int totalSum=0;
        for(int i = 1 ; i <= 10; i++){
            sum += i;
            totalSum += sum;
        }

        4-4) 202
        int sum = 0;
        int s = 1;
        int num = 0;

        for(int i = 1; sum < 100; i++, s=-s) {
            num = i * s;
            sum += num;
        }


        4-5)
         int i = 0;

        while(i <= 10){
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
            i++;
        }

        4-6)
        for(int i = 1 ; i <= 6 ; i++){
            for(int j = 1; j <= 6 ; j++){
                System.out.println(i+"+"+j+"="+(i+j));
            }
        }

        4-7)
        (int)(Math.random()*6) + 1 ;


        4-8)
         for(int x = 0 ; x <= 10 ; x++){
            for(int y = 0 ; y <= 10 ; y++){
                if((2*x + 4*y) == 10)
                    System.out.printf("x = %d, y = %d \n", x,y);
            }
        }

        4-9)
        sum += str.charAt(i) - '0';


        4-10)
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        4-11)
        num3 = num1 + num2;
        System.out.print("," + num3);

        num1 = num2;
        num2 = num3;

        4-12)

        for(int i = 2; i <= 9 ; i++){
            for(int j = 1 ; j <= 3 ; j++){
                int x = j+1 + (i-1) / 3*3;
                int y = i%3 == 0 ? 3 : i%3;

                if(x>9) break;

                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
        }

        4-13)
        ch = value.chartAt(i);
        if(!('0' <= ch <= '9')){
            isNumber = false;
            break;
        }


        4-14)
        1) (int)(Math.random()*100)+1;
        2)
        if(input > answer) System.out.println("더 작은수 입력");
        else if(input < answer) System.out.println("더 큰 수 입력");
        else{
            System.out.println("맞췄습니다.");
            System.out.printfln("시도횟수는" + count + "번입니다.");
            break;
        }

        4-15)

        result = result*10 + tmp % 10;
        tmp /= 10;
         */

    }
}
