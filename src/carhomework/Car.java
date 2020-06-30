/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carhomework;

/**
 *
 * @author dell
 */
public class Car {  
    private int Id;
    private String Make;
    private String Model;
    private int Year;
    private String Color;
    private double Price;
    private int Number;
    public Car(String Make, String Model, int Year, String Color, double Price) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Color = Color;
        this.Price = Price;
        this.Id=(int)Math.random()*10;
        this.Number=(int)Math.random()*100000;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public int getId() {
        return Id;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public String getColor() {
        return Color;
    }

    public double getPrice() {
        return Price;
    }

    public int getNumber() {
        return Number;
    }

    
    public String GetMake(){
        return this.Make;
    }
    public void GetCarByYear(int year)
    {  
        if((2020-this.Year)>=year)
           Print();
    }
        public void GetCarByYearAndPrice(int year,double price)
    {  
        if(this.Year==year&&this.Price>=price)
           Print();
    }
    public void Print()
    { System.out.println();
        System.out.println("Make: "+ this.Make + "\nModel: "+this.Model);
         System.out.println();
    }
}
