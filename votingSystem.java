/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package votingsystem;

import java.util.Hashtable;

/**
 *
 * @author habiba
 */
public class VotingSystem {
private static Hashtable <String, Boolean> voted = new Hashtable <>();

private static void checkVoter(String name){
    if (voted.containsKey(name)){
        System.out.println("Kick them out!");
    } else {
        voted.put(name, true);
        System.out.println("You can vote!");
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
        
        checkVoter("Tom");
        checkVoter("Habiba");
        checkVoter("Habiba");
        checkVoter("Noha");
        
    }
    
}
