/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int a=0;
        int b=1;
        int c,d;
        System.out.print("Eleman Sayisini Giriniz:");
        int k=input.nextInt();
        System.out.print("0 1");
        
        for(int i=2;i<k;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            
     

            
        }
    }
    
}
