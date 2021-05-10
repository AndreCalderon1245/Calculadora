/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author End User
 */
public class Operaciones {
    
    double a, b;
    
    public void setNumbers(double x, double y){
        
        this.a = x;
        this.b = y;
        
    }
    
    public double Suma(){
    
        return a + b;
        
    }
    
     public double Resta(){
    
        if (a > b){
            return a - b;
        } else {
            return b - a;
        }
         
    }
     
      public double Multiplicacion(){
    
        return a * b;
    }
      
    public double Division(){

    if (a > b){
        return a / b;
    } else {
        return b / a;
    }
         
    }
}
