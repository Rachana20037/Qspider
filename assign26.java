class assign26 {
     static int a =10;
     static int b =20;
     int c=30;
     int d=40;


     public static void print(){
     assign26 aa =new assign26();

          System.out.println("Static context var a :" + a);
          System.out.println("Static context var b :" + b);
          System.out.println("Static context var c :" + aa.c);
          System.out.println("Static context var d :" + aa.d);
     }

     public void nonstatic(){
          System.out.println("non-static var a:"+a);
          System.out.println("non-static var b:"+b);
          System.out.println("non-static var c:"+c);
          System.out.println("non-static var d:"+d);
          int a=100;
          int b=200;
          int c=300;
          int d=400;
     }

     public void fun(){
          System.out.println("non-static context var a :" +a);
          System.out.println("non-static context var b :" +b);
          System.out.println("non-static context var c :" +c);
          System.out.println("non-static context var d :" +d);
          int a=1000; int b=2000;int c=3000; int d=4000;
     }
     public static void main(String[] args) {
          assign26 aa1 = new assign26();
          aa1.print();
          System.out.println(aa1.a);
          System.out.println(aa1.b);
          System.out.println(aa1.c);
          System.out.println(aa1.d);
 
     }
}
