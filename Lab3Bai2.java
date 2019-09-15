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
public class Lab3Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        System.out.print("Bảng Cửu Chương: ");
        int a = scanner.nextInt();
        while(x<11){
            int y = a * x;
            System.out.println(a+" * " + x + " = " + y);
            x++;
        }
    }
}
