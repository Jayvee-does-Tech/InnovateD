

package com.mycompany.carera;

public class Carera {

      public enum Color {
        Silver, Green, Blue, Brown, Black, White
    }
      
    public enum Model {
        SEDAN, SUV, CONVERTIBLE, HATCHBACK
   }
    
  static public class Car {
        private int year;
        private Model model;
        private Color color;
        public Car(int yr, Model m, Color c){
        year = yr;
        model = m;
        color = c;
    }
    
 public void display() {
        System.out.println(" Model: " + model);
        System.out.println(" Year: " + year);
        System.out.println(" Color: " + color);
 }
  }
  public static void main(String args[]) {
        Car c1 = new Car(1968, Model.HATCHBACK, Color.Silver);
        Car c2 = new Car(1976, Model.SEDAN, Color.White);
        c1.display();
        c2.display();
   }
}


       



