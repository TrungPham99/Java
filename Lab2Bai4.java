    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BaiTap;

import java.util.Scanner;
public class Lab2Bai4 {
    public static void main(String[] args){ 
        mayTinhCaNhan();
    }
        public static void mayTinhCaNhan(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("+-------------------------------+");
            System.out.println("|1. Giải Phương Trình Bậc Nhất  |");
            System.out.println("|2. Giải Phương Trình Bậc Hai   |");
            System.out.println("|3. Tính Tiền Điện              |");
            System.out.println("|4. Kết Thúc                    |");
            System.out.println("+-------------------------------+");
            System.out.print("Hãy Chọn Chức Năng: ");
            int x = scanner.nextInt();
            switch(x){
                case 1:
                    giaiPhuongTrinhBacNhat();
                    break;
                case 2:
                    giaiPhuongTrinhBacHai();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.print("Kết Thúc");
                    System.exit(0);
                default:
                    System.out.print("Sai Rồi");
                    break;    
            }
        }
        public static void giaiPhuongTrinhBacNhat(){
            Scanner scanner = new Scanner(System.in);
        System.out.print ("Nhập Số a: ");
        double a = scanner.nextDouble();
        System.out.print ("Nhập Số b: ");
        double b = scanner.nextDouble();
        if(a==0){
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
        public static void giaiPhuongTrinhBacHai(){
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
        public static void tinhTienDien(){
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
    
    
    


