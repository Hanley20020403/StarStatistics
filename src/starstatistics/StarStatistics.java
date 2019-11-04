/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starstatistics;

import java.util.Scanner;

/**
 *
 * @author hahan0750
 */
public class StarStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner keyedInput = new Scanner (System.in);
        
        final int NUM = 5;
        int [] scores = new int[NUM];
        double average;
        int total;
        total = 0;
        
        System.out.println("please enter your favourite hockey/baseball/sports star statistics for the past 5 games: ");
        
        for (int i=0;i<NUM;i++)
        {
           scores[i] = keyedInput.nextInt();
        }
        
        for(int i=0; i<NUM; i++)
        {
            total = total + scores[i];
        } 
        
        average =(double) total / (double)NUM;
        
        average = average * 100;
        average = Math.round(average);
        average = average / 100;
        
        System.out.println("Your average mark is " + average);
    }
    
}
