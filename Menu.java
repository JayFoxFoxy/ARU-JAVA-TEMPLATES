import java.util.*;
import java.io.*;

class Menu{

   public static void main(String[] args){
   
   int option = 0;
   int indexPersons = 0;
         
            do{
            
            option = Menu(indexPersons);
            
            switch(option){
            case 1:
               Print();
               break;
               
            case 2:
               break;
               
            case 3:
                  break;
       
            case 4:
                  break;
                    
             case 5:
               break;
               
            default:
            System.out.println("You need to insert a valid option!");
            }
      
         }while(option != 5);
         
   }
      
   static int Menu(int indexPersons) {
    
  
      Scanner myObj = new Scanner(System.in);
      
      
      int totalPerson = indexPersons;
      
      System.out.println("*****Array manipulation*****\n");
      System.out.println("Total persons inside the Array: " +totalPerson);
      System.out.println("Menu");
      System.out.println("1 - Insert a Value");
      System.out.println("2 - View all the values");
      System.out.println("3 - Edit a Value");
      System.out.println("4 - Delete a value");
      System.out.println("5 - Exit");
      System.out.println("Choose an operation: ");
      int option = myObj.nextInt();
      
      return option;
   }
     
   static void Print() {
      
      System.out.println("*****Hello World!*****\n");

   }

     
     
     
}