package com.sau.workshop;

import java.util.Scanner;

public class WorkshopCF01 {
    //สร้างเมนูให้ผู้ใช้เลือก 1,2,3 หากเลือกไม่ใช่ 1 2 3 แสดงข้อความขอบคุณและจบโปรแกรม
    //กรณีเลือก 1 คำนวณพื้นที่สี่เหลี่ยม ป้อนกว้าง ยาว คำนวณ แสดงผล (กว้าง*ยาว)
    //กรณีที่ 2 คำนวณพื้นที่สามเหลี่ยม ป้อนฐาน สูง คำณวณ แสดงผล (ฐาน*สูง/2)
    //กรณีที่ 3 คำนวณพื้นที่วงกลม ป้อนรัศมี คำนวณ แสดงผล (PI*รัศมีกำลัง2)

    public static void main(String[] args) {
        int menu;
        double wi, ba, hi, ra, areaSqure, areaTriangle, areaCircle;

        Scanner sc = new Scanner(System.in);

        System.out.println("+++++++++++++++++++");
        System.out.println(" Shape Area");
        System.out.println("+++++++++++++++++");
        System.out.println("1. Squqre Area");
        System.out.println("2. Triangle Area");
        System.out.println("3. Circle Area");
        System.out.println("++++++++++++++++++++++");
        System.out.print("Select menu");
        menu = sc.nextInt();
        System.out.println("++++++++++++++++++++++++++++");
        if(menu == 1){
            //คำนวณหาพื้นที่สี่เหลี่ยม
        }else if (menu == 2){
            //คำนวณหาพื้นที่ 3เหลี่ยม
        }else if ( menu == 3){
            //คำนวณหาพื้นที่วงกลม
            System.out.println("Input radius:");
            ra = sc.nextDouble();
        }else{
            System.out.println("Thank you na jaaa ^0^");
        }
        System.out.println("+++++++++++++++++++++");
    }
}
