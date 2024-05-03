public class product30 {
     int prd_id;
     String prd_name;
     String prd_Brand;

     product30(int prd_id, String prd_name, String prd_Brand){
          this.prd_id = prd_id;
          this.prd_name = prd_name;
          this.prd_Brand = prd_Brand;
     }
     public void productDetails(){
          System.out.println("--------------------------");
          System.out.println("Product ID: " + prd_id);
          System.out.println("Product Name: " + prd_name);
          System.out.println("Product Brand : " + prd_Brand);
     }
     public static void main(String[] args) {
          product30 pp1 = new product30(01,"Biscuit","Parle");
          product30 pp2 = new product30(02,"Pizza","Foodie");
          product30 pp3 = new product30(03,"Tea","Beverages");
          pp1.productDetails();
          pp2.productDetails();
          pp3.productDetails();

     }
}
      