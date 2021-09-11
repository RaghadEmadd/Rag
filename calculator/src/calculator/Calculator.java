/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class Calculator {
float result;
    public static int Add(int num1, int num2){
            return num1 + num2;
    }
    public static double Subtract(double first, double second){
            return first - second;
        }
    
    public static double Multiply(double N1, double N2){
            return N1*N2;
       }
    public static double Divide(double Number1, double Number2){
        if(Number2 ==0){
            throw new IllegalArgumentException("Number cannot be divided by 0");
        }
            return Number1/Number2;
       }
}
