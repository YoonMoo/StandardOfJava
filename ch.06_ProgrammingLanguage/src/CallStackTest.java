public class CallStackTest {
    public static void main(String agrs[]){
        firstMethod();
    }

    static void firstMethod(){
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("secondMethod()");
    }
}
