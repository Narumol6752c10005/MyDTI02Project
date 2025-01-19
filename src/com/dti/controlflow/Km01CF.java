package com.dti.controlflow;
//Control flow กลุ่ม Selection/Condition การเลือกทำ

public class Km01CF {

    public static void main(String[] args) {
        //แบบที่1 เรียกพิสูจน์ครั้งเดียว จริงทำ เท็จไม่ทำ : if
        int a = 2;

        if (a > 5) {
            System.out.println("Hello.......");
        }
        System.out.println("++++++++++++++");
        //แบบที่2เรียกพิสูจน์ครั้งเดียว จริงทำอย่าง เท็จทำอีกอย่าง :if-else
        int b = 100;
        if (b < 80) {
            System.out.println("Wow....");
            System.out.println("Woo.....");
        }
        System.out.println("++++++++++++++++");
        //แบบที่3พิสูจน์หลายครั้ง : if-else-if , switch-case
        int c = 70;
        if (c > 80) {
            System.out.println("111");
        } else if (c > 70) {
            System.out.println("222");
        } else if (c > 60) {
            System.out.println("333");
        } else { //ไม่จำเป็นต้องมี if ทั้งนี้ขึ้นอยู่กับโจทย์
            System.out.println("555555555");

        }
        System.out.println("+++++++++++++++++++++");
        int busNumber = 81;
        switch (busNumber) {
            case 80:
                System.out.println("Sanamluang");
                break;
            case 57:
                System.out.println("PATA");
                break;
            case 84:
                System.out.println("Wat Rai King");
                break;
            case 81:
                System.out.println("Siriraj");
                break;
            default:
                System.out.println("Don't have data T_T"); 
        }
    }
}
