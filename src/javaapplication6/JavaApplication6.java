/*
Juan Diego Reyes Zepeda
5090-18-5233
 */
package javaapplication6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


class notas implements Comparable<notas>{
    private Integer ca;
    private Integer no;
    notas(Integer ca, Integer no){
        this.ca = ca;
        this.no = no;
    }

    // mandar el dato al array
    public void setCa(int ca){
        this.ca = ca;
    }
    public void setNo(int no){
        this.no = no;
    }
    
    public Integer getCa(){
        return ca;
    }
    public Integer getNo(){
        return no;
    }
    
    @Override
   public String toString() {
        return "Carne: " + ca + " Nota: "+no;
    }

    
    @Override
    public int compareTo(notas t){ 
        return t.getNo().compareTo(no);
    }   
    
    
}


public class JavaApplication6 {
        int[] carne = new int[4];
        int[] nota = new int[4];
         List <notas> nt = new ArrayList<>();
    public static void main(String[] args) {
        JavaApplication6 cd = new JavaApplication6();
        cd.menu();
    }
    
    void menu(){
        Scanner in = new Scanner(System.in);
        int opc;
        do{
            System.out.println("1) Ingresar notas");
            opc = in.nextInt();
            switch(opc){
                case 1: ingresar(); break;
            }
        }while(opc != 2 );
    }
    
    void ingresar(){
        Scanner not = new Scanner(System.in);
        
        int i;
        for(i=0; i<4; i++){
            System.out.println("Carne #"+(i+1));
            carne[i] = not.nextInt();
            System.out.println("Nota del alumno #"+(i+1));
            nota[i] = not.nextInt();
            nt.add(new notas(carne[i], nota[i]));
        }
        
        Collections.sort(nt);  
       
        
        for(notas aux: nt){
            System.out.println(aux);
        }
    }
    
    
    

    
}
