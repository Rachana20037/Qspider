public class HomeLoanAccount {
     HomeLoanAccount(){
          System.out.println("No argument..");
     }
     HomeLoanAccount(double intrest){
          System.out.println("One parametrized constructor..");
     } HomeLoanAccount(double intrest,long LoanAccount){
          System.out.println("2 parametrized constructor..");
     } HomeLoanAccount(double intrest,long LoanAccount,int tenrus){
          System.out.println("3 parametrized constructor..");
     } HomeLoanAccount(double intrest,long LoanAccount,int tenrus,String BankName){
          System.out.println("4 parametrized constructor..");
     }
     public static void main(String[] args) {
          HomeLoanAccount hh1=new HomeLoanAccount();
          HomeLoanAccount hh2=new HomeLoanAccount(2.3);
          HomeLoanAccount hh3=new HomeLoanAccount(2.3,200000);
          HomeLoanAccount hh4=new HomeLoanAccount(2.3,200000,7);
          HomeLoanAccount hh5=new HomeLoanAccount(2.3,200000,7,"Fredal Bank");

     }
}
