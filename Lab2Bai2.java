/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BaiTap;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2Bai2 {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Nhập Số a: ");
        double a = scanner.nextDouble();
        System.out.print ("Nhập Số b: ");
        double b = scanner.nextDouble();
        System.out.print ("Nhập Số c: ");
        double c = scanner.nextDouble();
        if(a==0)
        {
            if(b==0){
                if(c==0){
                System.out.println("Phương Trình Có Vô Số Nghiệm");  
                }
                else{
                System.out.println("Phương Trình Vô Nghiệm");
                }
            }
            else{
            double x = -c/b;        
            System.out.println("x: " + x );
            }
        }
        else{
            if(a!=0){
            double Delta = Math.pow(b,2) - 4 * a * c  ;      
            System.out.println("Delta: " + Delta );
                if(Delta<0){
                    System.out.println("Phương Trình Vô Nghiệm");
                }
                if(Delta==0){
                    System.out.println("Phương Trình Có Nghiệm Kép");
                    double x = -b/(2*a);
                    System.out.println("x: " + x );
                }
                else{
                    System.out.println("Phương Trình Có 2 Nghiệm Phân Biệt");
                    double x1 = (-b + Math.sqrt(Delta)) /(2*a);
                    double x2 = (-b - Math.sqrt(Delta)) /(2*a);
                    System.out.println("x1: " + x1 );
                    System.out.println("x2: " + x2 );
                }
                    
            }
        }
    }
}
