public class Quiz {
    public static void main(String[] args){
        // 1
        /*class SutdaCard{
            int num;
            boolean isKwang;
        }*/

        //2
        /*class SutdaCard{
            int num;
            boolean isKwang;

            SutdaCard(){
                this(1, true);
            }

            SutdaCard(int num, boolean isKwang){
                this.num = num;
                this.isKwang = isKwang;
            }

            String info(){
                return num + (isKwang ? "K" : " ");
            }

        }*/

        //3
        /*class Student{
            String name;
            int ban;
            int no;
            int kor;
            int eng;
            int math;
        }*/

        //4
        /*class Student{
            String name;
            int ban;
            int no;
            int kor;
            int eng;
            int math;

            int getTotal(){
                return kor+eng+math;
            }

            float getAverage(){
                return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
            }
        }*/

        //5
        /*class Student{

            String name;
            int ban;
            int no;
            int kor;
            int eng;
            int math;

            Student(String name, int ban, int no, int kor, int eng, int math){
                this.name = name;
                this.ban = ban;
                this.no = no;
                this.kor = kor;
                this.eng = eng;
                this.math = math;
            }

            int getTotal() {
                return kor+eng+math;
            }
            float getAverage() {
                return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
            }
            public String info() {
                return name
                        +","+ban
                        +","+no
                        +","+kor
                        +","+eng
                        +","+math
                        +","+getTotal()
                        +","+getAverage()
                        ;
            }
        }*/

        //6
        /*static double getDistance(int x, int y, int x1, int y1){
            double result;
            double dx, dy;

            dx = Math.pow(x-x1, 2.0);
            dy = Math.pow(y-y1, 2.0);

            result = Math.sqrt(dx+dy);

            return result;
        }*/

        //7
        /*double getDistance(int x1, int y1) {
            return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
        }*/

        //8
        //클래스변수 : width,height
        //인스턴스변수 : kind, num
        //지역변수 : k,n, card, args

        //9
        // weapon, armor, weaponUp(), armorUp()
        // 모든 병사의 공격력과 방어력은 같아야 함으로

        //10
        // b,e

        //11
        // b -> 인스턴스에서만 사용가능

        //12
        // c,d

        //13
        // b,c,d

        //14
        // c,e

        //15
        // a 기본값 - 명시적초기화 - 초기화블럭 - 생성자

        //16
        // a, e

        //17
        // b

        //18
        // A : 클래스 변수에 인스턴스 변수값 사용 불가
        // B : 클래스 메서드에서는 인스턴스 변수 사용 불가
        // D : 클래스 메서드에서는 인스턴스 메서드 호출 불가

        //19
        // ABC123
        // After change:ABC123

        //20
        /*static int[] shuffle(int[] arr){
            if(arr==null || arr.length == 0) return arr;

            for(int i = 0 ; i < arr.length; i++){
                int j = (int)(Math.random()*arr.length);

                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            return arr;
        }*/

        //21
        /*void turnOnOff(){
            isPowerOn = !isPowerOn;
        }
        void volumeUp() {
            if(volume < MAX_VOLUME) volume++;
        }
        void volumeDown() {
            if(volume > MIN_VOLUME) volume--;
        }
        void channelUp() {
            if(channel == MAX_CHANNEL) channel = MIN_CHANNEL;
            else channel++;
        }
        void channelDown() {
            if(channel == MIN_CHANNEL) channel = MAX_CHANNEL;
            else channel--;
        }*/

        //22
        /*static boolean isNumber(String str){
            if(str == null || str == "") return false;

            for(int i = 0 ; i < str.length() ; i++){
                char c = str.charAt(i);
                if(c < '0' || c > '9') return false;
            }
            return true;
        }*/

        //23

       /* static int max(int[] arr){

            if( arr == null || arr.length == 0)
                return -999999;


            int max = arr[0];

            for(int i = 1 ; i < arr.length; i++){
                if(arr[i] > max) max = arr[i];
            }

            return max;
        }*/

        //24
      /*  static int abs(int value){
            return value > 0 ? value : -value;
        }*/
    }


}

class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        isPowerOn = !isPowerOn;
    }
    void volumeUp() {
        if(volume < MAX_VOLUME) volume++;
    }
    void volumeDown() {
        if(volume > MIN_VOLUME) volume--;
    }
    void channelUp() {
        if(channel == MAX_CHANNEL) channel = MIN_CHANNEL;
        else channel++;
    }
    void channelDown() {
        if(channel == MIN_CHANNEL) channel = MAX_CHANNEL;
        else channel--;
    }
}
class MyPoint{
    int x;
    int y;
    int c;
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1) {
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
}