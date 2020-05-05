/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

import java.util.Scanner;

/**
 *
 * @author ino
 */
public class Aufgabe5 {
    Scanner lea;
//    public Double zusatz2(){
//        lea=new Scanner(System.in);
//        String[] Data=new String[3];
//        String mm="";
//        String m="";
//        String cm="";
//        Double[] rta=new Double[3];
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Geben Sie die notwendige Maßen ein.");
//            Data[i]=lea.next();
//        }
//        for (int i = 0; i < Data.length; i++) {
//            if(Data[i].toString().charAt(Data[i].length()-1)=='m' && Data[i].toString().charAt(Data[i].length()-2)=='m'){
//                for (int j = 0; j < Data[i].length()-2; j++) {
//                   mm=mm+Data[i].toString().charAt(j);
//                }
//                   rta[i]=(Double.parseDouble(mm)/10);
//                   mm="";
//            }else if(Data[i].toString().charAt(Data[i].length()-1)=='m' && Data[i].toString().charAt(Data[i].length()-2)!='c'){
//                for (int j = 0; j < Data[i].length()-1; j++) {
//                m=m+Data[i].toString().charAt(j);
//                }
//                rta[i]=(Double.parseDouble(m)*100);
//                m="";
//        }else{
//                for (int j = 0; j < Data[i].length()-2; j++) {
//                    cm=cm+Data[i].toString().charAt(j);
//                }
//                rta[i]=Double.parseDouble(cm);
//                cm="";
//                }
//            }
//         return rta[0]*rta[1]*rta[2];
//        }
    public Double finalZusatz(){
        lea=new Scanner(System.in);
        String Data[]=new String[3];
        String mm="";
        String m="";
        String cm="";
        String temp="";
        String info="";
        int count=0;
        Double[] rta=new Double[3];
        System.out.println("Geben Sie die notwendige Maßen ein.");
        temp=lea.next();
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i)=='*'){
            Data[count]=info;
            info="";
            count=count+1;
            }else
            info=info+temp.charAt(i);
                
        }
        Data[2]=info;
        for (int i = 0; i < Data.length; i++) {
            System.out.println(Data[i]);
            if(Data[i].toString().charAt(Data[i].length()-1)=='m' && Data[i].toString().charAt(Data[i].length()-2)=='m'){
                for (int j = 0; j < Data[i].length()-2; j++) {
                   mm=mm+Data[i].toString().charAt(j);
                }
                   rta[i]=(Double.parseDouble(mm)/10);
                   mm="";
            }else if(Data[i].toString().charAt(Data[i].length()-1)=='m' && Data[i].toString().charAt(Data[i].length()-2)!='c'){
                for (int j = 0; j < Data[i].length()-1; j++) {
                m=m+Data[i].toString().charAt(j);
                }
                rta[i]=(Double.parseDouble(m)*100);
                m="";
        }else{
                for (int j = 0; j < Data[i].length()-2; j++) {
                    cm=cm+Data[i].toString().charAt(j);
                }
                rta[i]=Double.parseDouble(cm);
                cm="";
                }
            }
         return rta[0]*rta[1]*rta[2];
        }
   
}
