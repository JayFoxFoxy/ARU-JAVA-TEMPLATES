import java.util.*;
import java.io.*;

class books{

    private int number;
    private String name;
    private String autor;

    //Constructor

    public books(){
    }

    public books(int number, String name, String autor){
        this.number = number;
        this.name = name;
        this.autor = autor;
    }



    public void printBooks(ArrayList ls){
        Iterator itr = ls.iterator();

        while(itr.hasNext()){
            books book = (books)itr.next();
            System.out.println(book.number+" "+book.name+" "+book.autor);
        }
    }

   public String toString(){
       return this.number+" "+this.name+" "+this.autor;
    }


    public void setNumber(int number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }


    public int getNumber(){
        return this.number;
    }

    public String getName(){
        return name;
    }

    public String getAutor(){
        return autor;
    }

}