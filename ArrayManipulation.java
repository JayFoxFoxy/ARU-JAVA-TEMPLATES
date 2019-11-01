import java.util.*;
import java.io.*;

class ArrayManipulation{ 

   public static void main(String[] args){
   
      Scanner myObj = new Scanner(System.in);
      Scanner myObj2 = new Scanner(System.in);
      
      String Persons[] = new String[100];
      
      int indexPersons = 0;
      
      int option = 0;
      
      int deleted = 0;
   
      do{
      
         option = Menu(indexPersons, deleted);
         
         switch(option){
            case 1:
            
               //clsr();
               
               System.out.println("Insert a new name: ");
               String value = myObj2.nextLine();
               
               indexPersons = insert(Persons, indexPersons, value);
               
               //clsr();
               break;
            case 2:
            
               //clsr();
               
               showArray(Persons, indexPersons);
               break;
            case 3:
            
               //clsr();
               
               System.out.println("Insert the index that you want to edit: ");
               int index = myObj.nextInt();
               
               System.out.println("The name you choose: " + Persons[index]);
               System.out.println("Are you sure you want to continue? 1 to yes 0 to no");
               int sure = myObj.nextInt();
            
                  if (sure == 1){
                  System.out.println("Name that you want to insert: ");
                  value = myObj2.nextLine();
                  editArray(Persons, index, value);
                  break;
                  }else{
               break;
                  }  
            
            case 4:
            
               //clsr();
               
               System.out.println("Insert the index that you want to delete: ");
               int index2 = myObj.nextInt();
               
               System.out.println("The name you choose: " + Persons[index2]);
               System.out.println("Are you sure you want to continue? 1 to yes 0 to no");
               int sure2 = myObj.nextInt();
               
                  if (sure2 == 1){
                  deleteArray(Persons, index2);
                  deleted = deleted + 1;
                  break;
                  }else{
               break;
                  }      
            
            case 5:
            
               break;
            default:
               System.out.println("You need to insert a valid option!");
         }
      
      }while(option != 5);
   
   
   }  
      
      
   static int insert(String Persons[], int indexPersons, String value) {
     
   
      Persons[indexPersons] = value;
      
      indexPersons = indexPersons + 1;
      
      return indexPersons;
   
   }
     
     
   static void showArray(String Persons[], int indexPersons) {
     
      System.out.println("*****Results*****");
      
      for (int i = 0; i <= indexPersons-1; i++) {
         if (Persons[i] != "n"){
         System.out.println("Index - " + i + " Name: "+ Persons[i]);
         }
      }
      
      indexPersons = indexPersons + 1;
   
   }
     
   static void editArray(String Persons[], int index, String value) {   
      Persons[index] = value;
   }
     
   static void deleteArray(String Persons[], int index) {   
      Persons[index] = "n";
   }
     
   static int Menu(int indexPersons, int deleted) {
    
      //clsr();
        
      Scanner myObj = new Scanner(System.in);
      
      //File myObj3 = new File("saves.txt");
      
      int totalPerson = indexPersons - deleted;
      
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
  
   static void clsr() {
      for(int i = 0; i < 15; i++) {
      System.out.println();
      }  
   }

}