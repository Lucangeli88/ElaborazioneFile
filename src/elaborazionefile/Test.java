/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaborazionefile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Riccardo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      Scanner console=new Scanner(System.in);
        System.out.println("Inserisci file di input:");
        String entrata=console.next();
        System.out.println("Inserisci dove scrivere l'output:");
        String uscita=console.next();
      File elenco=new File(entrata);
      Scanner in=new Scanner(elenco);
      PrintWriter out=new PrintWriter(uscita);
      ArrayList <Elemento> a=new ArrayList();
      String parole="";
      in.useDelimiter("[^A-Za-z]+");
      while(in.hasNext()){
          parole=in.next();
          int i=0;
          boolean state=false;
          for(Elemento tmp:a){
            if(parole.equals(tmp.getParola())){
              tmp.setC();
              state=true;
            }
          }
          if(state==false)a.add(new Elemento(parole));
      }
      for(Elemento tmp:a)System.out.println(tmp);
      in.close();
      out.close();
    }
    
}
