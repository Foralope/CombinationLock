/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combinationlock;
import java.util.*;
/**
 *
 * @author wizwa9381
 */
public class CombinationLock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        boolean unlock;
        boolean randomUnlock;
        int comboPart1,comboPart2,comboPart3;
        String combination = "";
        String combo = "";
        String guess = "";
        Scanner input = new Scanner(System.in);
        //Setting the combination
        System.out.println("What is the first number of the combination you would like to have the lock use?");
        comboPart1 = input.nextInt();
        combination += String.valueOf(comboPart1)+"-";
        System.out.println("What is the second number of the combination?");
        comboPart2 = input.nextInt();
        combination += String.valueOf(comboPart2)+"-";
        System.out.println("What is the final number of your combination?");
        comboPart3 = input.nextInt();
        combination += String.valueOf(comboPart3);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Lock comboLock = new Lock(combination);
        System.out.println("Please enter what you think your combination is with dashes(-) in between the numbers with no spaces.");
        System.out.println("----------");
        combo = input.next();
        unlock = comboLock.unlockAttempt(combo);
        if(unlock == true){
            System.out.println("CONGRATS! You unlocked the lock.");
        } else{
            System.out.println("... Better luck next time...");
        }
        System.out.println("Your combination was: "+combination);
        System.out.println("You tried to unlock it using: "+combo);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Time to guess the combination of a random lock.");
        System.out.println("It has 3 numbers, with dashes(-) in between with no spaces, from 1 to 3.");
        guess = input.next();
        Lock randomLock = new Lock();
        System.out.println(randomLock.getRandomCombo());
        randomUnlock = randomLock.unlockAttempt(guess);
        if(randomUnlock == true){
            System.out.println("WOW! Quite the guess.");
        } else{
            System.out.println("... Better luck next time...");
        }
        System.out.println("The combination was: "+randomLock.getRandomCombo());
        System.out.println("You guessed: "+guess);
    }
    
}
