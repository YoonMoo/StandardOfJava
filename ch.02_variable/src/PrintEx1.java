/*
    * printf()
    - 지시자를 통해 변수값을 다양한 형식으로 변환하여 출력
    - 줄바꿈 시에 %n or \n 추가
 */

public class PrintEx1 {
    public static void main(String[] args){
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;   //  8진수 10   8
        int hexNum = 0x10;  // 16진수 10  16
        int binNum = 0b10;  //  2진수 10   2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString((binNum)), binNum);
        // 10진수를 2진수로 출력해주는 지시자가 따로 없음.
    }
}
