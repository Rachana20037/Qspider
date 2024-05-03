public class test27 {
     
     long nonStaticBankId=88978675645532878l;
     String nonStaticBankName="Fedral bank of India";
     long nonStaticBankBalance=990000000000999999l;

     static{
          System.out.println("initilization process has begun");
     }
     {
          System.out.println("Banking process has been started,");
     }
     public void printBankDetails(long nonStaticBankId, String nonStaticBankName,long nonStaticBankBalance){
          System.out.println("Bank Details are:");
          System.out.println("Bank Id: " + nonStaticBankId);
          System.out.println("Bank Name: " + nonStaticBankName);
          System.out.println("BAnk balance: "+nonStaticBankBalance);

     }

     public static void main(String[] args) {
          test27 tt = new test27();
          tt.printBankDetails(88978675645532878l,"Fedral bank of India",990000000000999999l);
          System.out.println("Thank YOU for using Fedral bank of India");

     }
}
