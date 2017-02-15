/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaborazionefile;

/**
 *
 * @author Riccardo
 */
public class Elemento {
    private String parola;
    private int c;
    public Elemento (String parola){
        this.parola=parola;
        c=1;
    }
    public String toString(){
        return "parola:"+parola+"compare:"+c+'\n';
    }
    public String getParola(){
        return parola;
    }
    public void setC(){
        this.c++;
    }
    public int getC(){
        return c;
    }
}
