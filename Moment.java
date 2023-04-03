/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.project;
/**
 *
 * 
 */
public  abstract class Moment  implements Comparable{
    private String name;
    private String description;
    private int year;
    private int impRate;
    String type;
 
    
    
    
    public Moment() {
        
    }

    public Moment(String name, String description, int year, int impRate) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.impRate = impRate;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setImpRate(int impRate) {
        if (impRate > 0 && impRate < 6){
        this.impRate = impRate;
        }
        else
            System.out.println("WARNING : please enter a number within the range fron 1 to 5");
    }
    
    public int getImpRate() {
        return impRate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }
    
    public abstract void Display();
    
    public abstract int happy();
    
    
    
    @Override
    public int compareTo(Object t) {
        Moment otherMoment = (Moment)t;
        if(this.impRate < otherMoment.impRate){
            return -1;
        }
        else if (this.impRate == otherMoment.impRate){
            return 0;
        }
        else{
            return 1;
        }
    }

    
    }
