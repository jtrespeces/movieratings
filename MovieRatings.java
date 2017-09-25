package computersciencea1a;

/*
 * Lesson 9 Coding Activity Question 1
 *
 * Write the code to print a random integer from 1 to 10 inclusive using Math.random().
 *
*/

import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int a,b,c;
        
        double aa,bb,cc,dd,ee,ff,gg,hh;
      
        System.out.println("Please enter ratings from the movie review website.");
        
        a = scan.nextInt();
        
        b = scan.nextInt();
        
        c = scan.nextInt();
        
        System.out.println("Please enter ratings from the focus group.");
        
        aa = scan.nextDouble();
        
        bb = scan.nextDouble();
        
        
        System.out.println("Please enter the average movie critic rating.");
        
        cc = scan.nextDouble();
        
        dd = a+b+c;
        
        gg = (double) dd/3;
        
        ee = aa+bb;
        
        hh = ee/2;
        
        double twopercent = gg*0.20;
        double threepercent = hh*0.30;
        double fivepercent = cc*0.50;
        
        ff = twopercent + threepercent + fivepercent;
        
        
        System.out.println("Average website rating: "+gg);
        
        System.out.println("Average focus group rating: "+hh);
        
        System.out.println("Average movie critic rating: "+cc);
        
        System.out.println("Overall movie rating: "+ff);
        
        
        
        
        
        
        
        
        
        


    }
}