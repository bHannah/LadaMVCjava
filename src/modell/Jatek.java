/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.Scanner;

/**
 *
 * @author both.orsolya
 */
public class Jatek {
    
    private static final Scanner sc = new Scanner(System.in);
    private Lada[] ladak;
    private int valasztas;

    public Jatek() {
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0] = new Lada("arany", "Én rejtem a kincset");
        ladak[1] = new Lada("ezüst", "Nem én rejtem a kincset", true);
        ladak[2] = new Lada("bronz", "Az arany hazudik");
        
        kiiras(kezdes());
        bekeres();
        kiiras(ellenorzes());
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik felirat lesz igaz!\n";
        int i = 1;
        for(Lada lada : ladak){
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s += i + ". " + a + "láda: " + f + "\n";
            i++;
        }
        return s;
    }

    public void bekeres() {
        String s = "Melyik ládában van a kincs?(1,2 vagy 3): ";
        kiiras(s);
        valasztas = sc.nextInt()-1;
    }
    
    public String ellenorzes(){
        String s = "Gratulálok, eltaláltad!";
        s = ladak[valasztas].isKincs() ? s : "Sajnos nem talált!";
        return s;
    }
    
    public void kiiras(String szoveg){
        System.out.print(szoveg);
    }
    
    
}
