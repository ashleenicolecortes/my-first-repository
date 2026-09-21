public class Main {
   
   public static void main(String[] args){
   
         Vehicle vehicle1 = new Vehicle();
         vehicle1.brand = "Ford";
         vehicle1.model = "Mustang";
         vehicle1.year = 1967;

         Vehicle vehicle2 = new Vehicle();
         vehicle2.brand = "Toyota";
         vehicle2.model = "Civic";
         vehicle2.year = 2020;
         
         Vehicle vehicle3 = new Vehicle();
         vehicle3.brand = "Chevrolet";
         vehicle3.model = "Corvette";
         vehicle3.year = 1998;

   System.out.println( " VEHICLE 1 ");
   vehicle1.displayInfo();
   System.out.println(" Age: "+ vehicle1.calculateAge() + " years");
   System.out.println(" Is Vintage? " + vehicle1.isVintage());
   System.out.println();
   
   System.out.println( " VEHICLE 2 ");
   vehicle2.displayInfo();
   System.out.println(" Age: "+ vehicle2.calculateAge() + " years");
   System.out.println(" Is Vintage? " + vehicle2.isVintage());
   System.out.println();
   
   System.out.println( " VEHICLE 3 ");
   vehicle3.displayInfo();
   System.out.println(" Age: "+ vehicle3.calculateAge() + " years");
   System.out.println(" Is Vintage? " + vehicle3.isVintage());
        

   }

}
