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
public class Lab2Bai1 {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Nhập Số a: ");
        double a = scanner.nextDouble();
        System.out.print ("Nhập Số b: ");
        double b = scanner.nextDouble();
        if(a==0)
        {
            if(b==0){
                System.out.println("Phương Trình Có Vô Số Nghiệm");
            }
            else{
                System.out.println("Phương Trình Vô Nghiệm");
            }
        }
        else{
            double x = -b/a;        
            System.out.printf("%f: ", x );
        }
    }
}
