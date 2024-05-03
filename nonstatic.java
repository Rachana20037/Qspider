

class nonstatic {
     int a=10;//global access
     static int b=20; //satic-context
     public void method(){
          int a=30;
          System.out.println(a);
     }
     public static void main(String[] args) {
        nonstatic nn=new  nonstatic();
        nn.method();
     }
     
}
