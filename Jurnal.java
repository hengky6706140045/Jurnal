/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;

public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        int b=1;
        int hasil=0,c;
        Scanner input = new Scanner (System.in);
        
        System.out.print ("Input  : ");
        c = input.nextInt ();
        for(int i=1; i<=c; i++){           
            a=b;
            b=hasil;
            System.out.print(hasil+" ");
            hasil=a+b;
        }
        //pertambahan
        for(int i=1; i<c; i++){
            
        }
    }
    
}
