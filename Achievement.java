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
public class Achievement extends Moment  {
    
    private int ProudPoints;
    private int PlannedYear;
    
    
    

    public Achievement(){
    }



    public Achievement(int ProudPoints, int PlannedYear, String name, String description, int year, int impRate) {
        super(name, description, year, impRate);
        this.ProudPoints = ProudPoints;
        this.PlannedYear = PlannedYear;
       
    }

    public int getProudPoints() {
        return ProudPoints;
    }

    public void setProudPoints(int ProudPoints) {
        this.ProudPoints = ProudPoints;
    }

    public int getPlannedYear() {
        return PlannedYear;
    }

    public void setPlannedYear(int PlannedYear) {
        this.PlannedYear = PlannedYear;
    }
    
    
   @Override 
    public int happy (){
        
        return (ProudPoints + 10 * Math.max(1, PlannedYear - getYear()))*getImpRate();
    }
    
    @Override
    public void Display() {
        type = "Achievement";
        System.out.println(type);
        System.out.println(getName());
        System.out.println("it has been in " + getYear());
        System.out.println("it was planned to happen in " + PlannedYear);
        System.out.println("importance rate : " + getImpRate());
        System.out.println("proud points : " + ProudPoints);
        System.out.println("description : " + getDescription());

    }
    
  

    }
