/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * 
 */
public class User {
    
    ArrayList<Moment> momentlist = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    String username;
    String password;
    String nickname;

    public User(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }
    
    public void insert_memory() {
        System.out.print("Name: ");
        String Name = input.next();
        System.out.print("Location: ");
        String Location = input.next();
        System.out.print("Description: ");
        String Description = input.next();
        System.out.print("Year: ");
        int Year = input.nextInt();
        System.out.print("Happiness points: ");
        int happinessPoints = input.nextInt();
        System.out.print("Saddness points: ");
        int sadnessPoints = input.nextInt();
        System.out.print("Importance rate: ");
        int ImpRate = input.nextInt();
        
        while (true){
           
           if(ImpRate < 1 || ImpRate > 6){
               System.out.println("WARNING : please enter a number within the range fron 1 to 5");
               ImpRate = input.nextInt();
           }
           else{
               break;
           }
               
       }
       
       
        momentlist.add(new Memory(Location, happinessPoints, sadnessPoints, Name, Description, Year, ImpRate));


    }
    
    public void insert_Achievement() {
        System.out.print("Name: ");
        String Name = input.next();
        System.out.print("Description: ");
        String Description = input.next();
        System.out.print("Year: ");
        int Year = input.nextInt();
        System.out.print("Planned year: ");
        int plannedYear = input.nextInt();
        System.out.print("Proud points: ");
        int proudPoints = input.nextInt();
        System.out.print("Importance rate: ");
        int ImpRate = input.nextInt();
        while (true){
           
           if(ImpRate < 1 || ImpRate > 6){
               System.out.println("WARNING : please enter a number within the range fron 1 to 5");
               ImpRate = input.nextInt();
           }
           else{
               break;
           }
               
       }
        momentlist.add(new Achievement(proudPoints, plannedYear, Name, Description, Year, ImpRate));

    }

    public void FilterAboveXImpRate(int X) {

        for (int i = 0; i < momentlist.size(); i++) {
            if (X < momentlist.get(i).getImpRate()) {
                momentlist.get(i).Display();
            }
        }

    }

    public void FilterBelowXImpRate(int X) {

        for (int i = 0; i < momentlist.size(); i++) {
            if (X > momentlist.get(i).getImpRate()) {
                momentlist.get(i).Display();
            }
        }

    }

    public void FilterInXYear(int X) {
        for (int i = 0; i < momentlist.size(); i++) {
            if (X == momentlist.get(i).getYear()) {
                momentlist.get(i).Display();
            }
        }
    }
    
    public void SortAsc() {
        Collections.sort(momentlist);

        for (Moment moment : momentlist) {
            moment.Display();
        }
    }

    public void SortDsc() {

        Collections.sort(momentlist, Collections.reverseOrder());

        for (Moment moment : momentlist) {
            moment.Display();
        }
   
    }
    public void DisplayMoments() {

        for (int i = 0; i < momentlist.size(); i++) {
            System.out.print((i+1) + "- ");
            momentlist.get(i).Display();
        }
   
    }
    public void EditMoment() {
        System.out.println("which moment do you want to update ?");
        DisplayMoments();
        System.out.println("Enter your choice : ");
        int choice = input.nextInt();
       for(int j = 0; j < momentlist.size(); j++){
           if( j == (choice-1) && momentlist.get(j).type.equals("Achievement")){
                              insert_Achievement();
                              momentlist.remove(j);
                              
           }
           else if(j == (choice-1) && momentlist.get(j).type.equals("Memory")){
               insert_memory();
               momentlist.remove(j);
           }
       }
    }
    
    public void DeleteMoment() {
        System.out.println("which moment do you want to delete ?");
        DisplayMoments();
        System.out.println("Enter your choice : ");
        int choice = input.nextInt();
        momentlist.remove(choice - 1);
    }
    
    public boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.println("User name : ");
        username = input.nextLine();
        System.out.println("Password :");
        password = input.next();
        if (username.equals("habiba") && password.equals("#1234")) {
            System.out.println("DONE");
            return true;
        } else {
            System.out.println("failed");
            return false;
        }
    }



   
    


}
