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
public class Lab1Bai4 {
       public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Nhập Số a: ");
        double nhapSoA = scanner.nextDouble();
        System.out.print ("Nhập Số b: ");
        double nhapSoB = scanner.nextDouble();
        System.out.print ("Nhập Số c: ");
        double nhapSoC = scanner.nextDouble();
        double Delta = Math.pow(nhapSoB,2) - 4 * nhapSoA * nhapSoC  ;
        double canDelta = Math.sqrt(Delta);
        System.out.println("Delta là: " +Delta);
        System.out.println("Căn Delta là: " + canDelta);
    }
}
