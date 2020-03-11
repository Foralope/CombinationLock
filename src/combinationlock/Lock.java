/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combinationlock;

/**
 *
 * @author wizwa9381
 */
public class Lock {
    String combination = "";
    String randomCombo = "";

    public Lock(String combo) {
        combination = combo;
    }
    
    public Lock() {
        randomCombo = String.valueOf((int) (Math.random() * 3) + 1)+"-"+String.valueOf((int) (Math.random() * 3) + 1)+"-"+String.valueOf((int) (Math.random() * 3) + 1);
    }
    
    public boolean unlockAttempt(String code){
        boolean check;
        check = combination.equals(code);
        return check;
    }
    
    public String getRandomCombo(){
        return randomCombo;
    }
}
