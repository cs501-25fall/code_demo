public class ReturnTypeTest {
    static int getValue(){
        return 1;
    }
//    static double getValue() {
//        return 1.0;
//    }
    public static void main(String ... args){
        int i = 0;
        while(i++ < 3) {
            System.out.println(i);
        }
    }

}
