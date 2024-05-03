public class StringUtils {
     
     public static String concatenate(String a1, String a2) {
          return a1+ a2;
     }
     public static String concatenate(String a1, String a2, String a3) {
          return a1+a2+a3;
     }
     public static  String concatenate(String a1, String a2, String a3, String a4) {
          return a1+a2+a3+a4;
     }
     
     public static void main(String[] args) {
          String ss1=concatenate(" Hello, " , "World!");
          System.out.println("Result 1:"+ ss1);

          String ss2=concatenate(" Java ","is " , "awesome!!");
          System.out.println("Result 2:"+ ss2);

          String ss3=concatenate("java ","1st " ,"Mock ", "interview.");
          System.out.println("Result 3:"+ ss3);



     }
}
