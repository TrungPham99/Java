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
public class Lab1Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Nhập Cạnh Thứ Nhất: ");
        double canh1 = scanner.nextDouble();
        System.out.print ("Nhập Cạnh Thứ Hai: ");
        double canh2 = scanner.nextDouble();
        double chuVi = (canh1 + canh2) * 2;
        double dienTich = canh1 * canh2;
        double canhNho = Math.min(canh2, canh1);
        System.out.println("Chu Vi Hình Chữ Nhật là: " +chuVi);
        System.out.println("Diện Tích Hình Chữ Nhật Là: " + dienTich);
        System.out.println("Cạnh Nhỏ Của Hình Chữ Nhật Là: " + canhNho);       
    }
}
