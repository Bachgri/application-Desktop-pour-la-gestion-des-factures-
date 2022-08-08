/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import frames.MainFrame;

/**
 *
 * @author Oualid
 */
public class Fonctions {
    public double solde(double x){
        double solde=0;
        if(x==0) return 0.0;
        if(x<=4)
            solde+= x*2;
        else{
            solde+=4*2;
            x-=4;
            if(x>0 && x<=6)
                solde+=x*4;
            else{
                solde+=6*4;
                x-=6;
                if(x>0 ){
                    solde+=x*6;
                }
                
            }
        }
        return solde;
    }
    public static void main(String[] args) {
        for(int i = 0;i<13;i++)
        System.out.println(i+".63 tones = "+new Fonctions().solde(i+0.63));
        
    }
}
