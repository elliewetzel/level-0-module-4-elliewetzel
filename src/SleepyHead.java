//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday = false, isVacation = false;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        System.out.println(weekday);
        if(weekday == 0) {
        	isWeekday = true;
        }
        else if(weekday == 1) {
        	isWeekday = false;
        }
        int vacation = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
       System.out.println(vacation);
        if(vacation == 0) {
        	isVacation = true;
        }
        else if(vacation == 1) {
        	isVacation = false;
        }
        if(isVacation) {
        	JOptionPane.showMessageDialog(null, "sleep in");
        }
        else if(isWeekday) {
        	JOptionPane.showMessageDialog(null, "get up lazybones!");
        } if(isWeekday) {
        	JOptionPane.showMessageDialog(null, "get up lazybones!");
        
    }
    }
}
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    

