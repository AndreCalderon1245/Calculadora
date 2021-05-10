/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;


public class Calculadora {

     public static void Encabezado(){
    
        System.out.println("=====================================================");  
        System.out.println("    UNIVERSIDAD AUTÓNOMA DEL ESTADO DE CAMPECHE");
        System.out.println("====================================================="); 
        System.out.println(" FACULTAD DE INGENIERÍA EN SISTEMAS COMPUTACIONALES"); 
        
        }
    
    
    // Cuerpo
    
    public static void Cuerpo(){
    
        System.out.println("====================================================="); 
        System.out.println(" CLASE DE LENGUAJE DE PROGRAMACIÓN 1RO A. CICLOS FOR"); 
        System.out.println("====================================================="); 
    }
    
    // Pie
    
    public static void Pie(){
    
        System.out.println("=====================================================");
        System.out.println("                                             ACM.2021"); 
    
    }
            
    public static void main(String[] args) {
        Encabezado();
        Cuerpo();
        int seleccion;
        int continuar;
            Scanner sc = new Scanner(System.in);
            System.out.println("Número 1:");
            double a = sc.nextDouble();
            System.out.println("Número 2:");
            double b = sc.nextDouble();
            Operaciones op = new Operaciones();
            op.setNumbers(a, b);
            System.out.println("Suma ---------------------> [1] \nResta --------------------> [2] \nMultiplicación -----------> [3] \nDivisión -----------------> [4]");
            seleccion = sc.nextInt();
               switch (seleccion) {
            case 1:
                System.out.println("El resultado es: " + op.Suma());
                break;
            case 2:
                System.out.println("El resultado es: " + op.Resta());
                break;
            case 3:
                System.out.println("El resultado es: " + op.Multiplicacion());
                break;
            case 4:
                System.out.println("El resultado es: " + op.Division());
                break;
            default:    
            System.out.println("Favor de escribir un número que este dentro de la lista:");   
                break;    
            }    
         Pie();    
    }
    
    
}
