public class TvTest2 {
    public static void main(String args[]){
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        System.out.println("t1의 channel 값은 " + tv1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + tv2.channel + "입니다.");

        tv1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");

        System.out.println("t1의 channel 값은 " + tv1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + tv2.channel + "입니다.");
    }
}
