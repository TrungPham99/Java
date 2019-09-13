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
public class Lab1Bai1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Họ và Tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm Trung Bình: ");
        double diemTB = scanner.nextDouble();
        System.out.println("Họ Tên Bạn Là: " + hoTen + ", Điểm Trung Bình Của Bạn Là: " + diemTB + "Điểm");         
    }
}
