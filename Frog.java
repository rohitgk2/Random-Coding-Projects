/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study;

/**
 *
 * @author Rohit
 */
public class Frog {
    private int currentLife;
    private String frogID;
    public int maxHealth;
    public int lowHP;
    public int hpLoss;
    private int raceIsEntered;
    public Frog (String frogID, int currentHp){
this.currentLife = currentHp;
this.frogID = frogID;
    }
    public void setCurrentLife(int currentLife){
        this.currentLife = currentLife;  
    }
    public int getCurrentLife (){
        return this.currentLife;   
    }
    public static void race (int raceIsEntered, int currentLoss, int hpLoss) {
        raceIsEntered+=1;
        currentLoss -= hpLoss;
    }
    
}

