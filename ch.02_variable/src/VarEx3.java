/*
    - 기본형 변수
    - 참조형 변수 : c랑 다르게 참조형 변수간의 연산 불가

    클래스 객체 생성 시에 새로운 참조형을 추가한다는 뜻.
    참조변수는 객체의 주소가 된다.

 */

public class VarEx3 {
    public static void main(String[] args){
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name); // Java
        System.out.println(str); // Java8.0
        System.out.println(7 + " "); // 7
        System.out.println(" " + 7); //  7
        System.out.println(7+"");    // 7
        System.out.println(""+7);    // 7
        System.out.println(""+"");   //
        System.out.println(7+7+"");  // 14
        System.out.println(""+7+7);  // 77

    }
}
