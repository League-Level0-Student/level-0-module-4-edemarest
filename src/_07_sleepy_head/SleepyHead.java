package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        
        
        
        int isWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "isWeekday", JOptionPane.YES_NO_OPTION);
        int isWeekend = JOptionPane.showConfirmDialog(null, "Is a weekend?", "isWeekend", JOptionPane.YES_NO_OPTION);
        int isVacation = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "isVacation", JOptionPane.YES_NO_OPTION);
        
        
        if (isWeekday == 0 && isVacation == 0 || isVacation == 0 || isWeekend == 0) {
        	System.out.println("Sleep in!");
        }
        else {
        	System.out.println("Get up!");
        }

        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         
          JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         
    


        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
