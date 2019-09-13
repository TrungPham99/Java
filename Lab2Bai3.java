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
public class Lab2Bai3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Số Điện: ");
        int soDien = scanner.nextInt();
        int tienDien = soDien*1000;
        if(soDien <=50){
            System.out.printf("Số Tiền Điện Tháng Này Là: %d Đồng", tienDien);
        }
        else{
            int tienDienThem = 50000 +(soDien-50)*1200;
            System.out.printf("Số Tiền Điện Tháng Này Là: %d Đồng", tienDienThem);
        }  
    }
}
