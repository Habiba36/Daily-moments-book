/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project;

/**
 *
 * @author hp
 */
public class Memory extends Moment{
    
    private String location;
    private int HappinessPoints;
    private int SadnessPoints;
    

    public Memory() {
    }

    public Memory(String location, int HappinessPoints, int SadnessPoints, String name, String description, int year, int impRate) {
        super(name, description, year, impRate);
        this.location = location;
        this.HappinessPoints = HappinessPoints;
        this.SadnessPoints = SadnessPoints;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHappinessPoints() {
        return HappinessPoints;
    }

    public void setHappinessPoints(int HappinessPoints) {
        this.HappinessPoints = HappinessPoints;
    }

    public int getSadnessPoints() {
        return SadnessPoints;
    }

    public void setSadnessPoints(int SadnessPoints) {
        this.SadnessPoints = SadnessPoints;
    }
   
    @Override 
    public int happy (){
        
        return (HappinessPoints - SadnessPoints)*getImpRate();
    }
    
    
    @Override
    public void Display(){
        type = "Memory";
        System.out.println(type);
        System.out.println(getName());
        System.out.println("it has been in " + getYear());
        System.out.println("it has been happened at " + location);
        System.out.println("importance rate : " + getImpRate());
        System.out.println("Happiness points : " + HappinessPoints);
        System.out.println("Saddness points : " + SadnessPoints);
        System.out.println("description : " + getDescription());

    }
    
    

}

