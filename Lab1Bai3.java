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
public class Lab1Bai3 {
   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Nhập Cạnh Thứ Nhất: ");
        double canh1 = scanner.nextDouble();
        double theTich = Math.pow(canh1,3);
        System.out.println("Thể Tích Khối Lập Phương là: " +theTich);

    }
}
