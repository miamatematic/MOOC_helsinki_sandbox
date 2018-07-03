/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
import java.util.ArrayList;

public class Library {
    private ArrayList <Book> list;
    public Library(){
      this.list=   new ArrayList <Book> ();
    }
    public void addBook(Book newBook){
        this.list.add(newBook);
    }
    
    public void printBooks(){
        for (Book book : this.list){
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList <Book> res = new ArrayList <Book> ();
        /*if(StringUtils.included(book.title(), searchedTitle)) {
    // Book found!
}*/
        for (Book book : this.list){
            
            if (book.title().contains(title) || StringUtils.included(book.title(), title) ){ 
               res.add(book);
            }
        }
        return res;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList <Book> res = new ArrayList <Book> ();
        
        for (Book book : this.list){
            if (book.publisher().contains(publisher) || StringUtils.included(book.publisher(), publisher)){
               res.add(book);
            }
        }
        return res;
    }
    
   public ArrayList<Book> searchByYear(int year){
        ArrayList <Book> res = new ArrayList <Book> ();
        
        for (Book book : this.list){
            if (book.year() == (year)){
               res.add(book);
            }
        }
        return res;
    }
}
