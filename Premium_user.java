/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public class Premium_user extends User {

    Scanner scanner = new Scanner(System.in);

    public Premium_user(String username, String password, String nickname) {
        super(username, password, nickname);
    }

    

    

// get the average importance rate for all moments
    public void Avg() {
        float sum = 0;
        for (int i = 0; i < momentlist.size(); i++) {
            sum += momentlist.get(i).getImpRate();
        }
        float avg = sum / momentlist.size();
        System.out.println(avg);
    }

// get the average importance rate for all moments in X year
    public void AvgInXYear() {
        float avg = 0;

        int numofyears = 0;
        System.out.print("Enter Your the year : ");
        int year = scanner.nextInt();

        for (int i = 0; i < momentlist.size(); i++) {
            if (year == momentlist.get(i).getYear()) {
                avg += momentlist.get(i).getImpRate();
                numofyears++;
            }
            avg /= numofyears;
            System.out.println(avg);
        }

    }

    public void Top() {
        int top = momentlist.indexOf(Collections.max(momentlist));
        
        System.out.println("The most rated Moment is : ");
        System.out.println(momentlist.get(top).getName());

    }

    public void Least() {
        int least = momentlist.indexOf(Collections.min(momentlist));
       
        System.out.println("The Least rated Moment is : ");
        System.out.println(momentlist.get(least).getName());

    }

    public void Happiest() {
        int happiest = 0;
        int happy = momentlist.get(0).happy();
        for (int i = 1; i < momentlist.size(); i++) {
            if (momentlist.get(i).happy() > happy) {
                happy = momentlist.get(i).happy();
                happiest = i;
            }
           
        }
        System.out.println("The Happiest moment is : ");
        System.out.println(momentlist.get(happiest).getName());
        
    }

    public void Saddest() {
        int saddest = 0;
        int happy = momentlist.get(0).happy();
        for (int i = 1; i < momentlist.size(); i++) {
            if (momentlist.get(i).happy() < happy) {
                happy = momentlist.get(i).happy(); 
                saddest = i;
           
            }
           
        }
        System.out.println("The Happiest moment is : ");
        System.out.println(momentlist.get(saddest).getName());
        
    }
    @Override
    public boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.println("User name : ");
        username = input.nextLine();
        System.out.println("Password :");
        password = input.next();
        if (username.equals("ganna") && password.equals("#5678")) {
            System.out.println("DONE");
            return true;
        } else {
            System.out.println("failed");
            return false;
        }
    }
    

}
