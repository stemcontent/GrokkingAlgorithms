/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phone_book;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author habiba
 */
public class Phone_Book {

    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable <String, Integer> hashtable = new Hashtable <>();
        
        //inserting items in my phone book
        hashtable.put("Noha", 01001234567);
        hashtable.put("Amr", 0100134567);
        hashtable.put("Monica", 010014567);
        
        
        int firstValue = hashtable.get("Noha");
          int secondValue = hashtable.get("Amr");
            int thirdValue = hashtable.get("Monica");
            
          
            
           Enumeration<String> keys = hashtable.keys();
           
           while(keys.hasMoreElements()){
               
               String key = keys.nextElement();
               System.out.println("Name: "+ key +"\n Number: "+ hashtable.get(key));
           }
            
            
          
        
        
    }
    
}
