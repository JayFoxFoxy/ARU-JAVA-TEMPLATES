import java.util.*;
import java.io.*;

class main{

    public static void main(String[] args){

        ArrayList<books> shelf = new ArrayList<>();
        books bk = new books(1, "Dummies", "John");
        String option = "yes";
        String name;
        Scanner input = new Scanner(System.in);
        //books bk2 = new books();

        //bk.books(1, "Dummies", "John");
        //shelf.add(bk);
        //System.out.println(bk.getName());
        //bk.setName("renato");
        //bk.getBooks(2, "Dummies", "Will");
        //shelf.add(bk);

        //bk.printBooks(shelf);

        //System.out.println("\n\n");

        //shelf.remove(0);

        //bk.printBooks(bk.toString());
        //System.out.println(bk.getName());

        do{
            System.out.println("Add book? ");
            option = input.nextLine();
            if(option.equals("yes")){
                System.out.println("Name? ");
                name = input.nextLine();
                books b1 = new books(1, name, "John");
                //System.out.println(b1);
                shelf.add(b1);
            }
        }while(option.equals("yes"));


        for(int i = 0; i < shelf.size(); i ++){
            System.out.println(shelf.get(i));
        }

        System.out.println("\n");

        books bknew = new books();

        bknew = shelf.get(0);
        System.out.println(bknew);
        bknew.setName("Teresa");

        shelf.set(0, bknew);

        for(int i = 0; i < shelf.size(); i ++){
            System.out.println(shelf.get(i));
        }


        System.out.println("\n");

        shelf.get(1).setName("Tomas");

        for(int i = 0; i < shelf.size(); i ++){
            System.out.println(shelf.get(i));
        }
        //System.out.println(bknew.getName());





        System.out.println();
    }



}