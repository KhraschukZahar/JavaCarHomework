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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class FillCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Car[]cars=new Car[2];
       cars[0]=new Car("BMW","X8", 2020, "White", 65000);
       cars[1]=new Car("Audi","A7", 2018, "Black", 80000);
       BufferedReader buffered=new BufferedReader(new InputStreamReader(System.in));
       int a;
       do{
     
            System.out.println("1.Get makes"); 
            System.out.println("2.Get car by year and price");
            System.out.println("3.Get car by year"); 
            System.out.println("4.Exit");
                  a= Integer.parseInt(buffered.readLine());

            if(a==1){ 
                    System.out.println("Makes"); 
            for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].GetMake());
        }
            }
            else if(a==2)
            {
                System.out.print("Year: "); 
                int year=Integer.parseInt(buffered.readLine());
                 System.out.print("Price: "); 
                int price=Integer.parseInt(buffered.readLine());
            for (int i = 0; i < cars.length; i++) {
            cars[i].GetCarByYearAndPrice(year,price);
        }
            }
            else if(a==3)
            {System.out.print("Year: "); 
                int year=Integer.parseInt(buffered.readLine());
                  for (int i = 0; i < cars.length; i++) {
            cars[i].GetCarByYear(year);
        }
            }
                
       }while(a!=4);
      
        
        
       
    }
    
}
