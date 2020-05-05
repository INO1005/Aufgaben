/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ino
 */
public class Aufgabe4 {
    
//    public double taschenrechner(){
//    Scanner lea=new Scanner(System.in);    
//    System.out.println("Geben Sie die Nummern");
//        String Nummer=lea.next();
//         String a="";
//         String b="";
//         char signal=' ';
//         int rta=0;
//         int j=0;
//        for(int i=0;i<Nummer.length();i++){
//        if(Nummer.charAt(i)=='+' || Nummer.charAt(i)=='-' || Nummer.charAt(i)=='*' || Nummer.charAt(i)=='/'){
//            signal=Nummer.charAt(i);
//            j=i;
//            break;
//            }
//            if(Nummer.charAt(i)!='+' || Nummer.charAt(i)!='-' || Nummer.charAt(i)!='*' || Nummer.charAt(i)!='/')
//            a=a+Nummer.charAt(i);
//        
//        }
//        for(int x=j+1;x<Nummer.length();x++){
//            b=b+Nummer.charAt(x);
//        }
//        switch(signal){
//            case '+':
//               rta=Integer.parseInt(a)+Integer.parseInt(b);
//               break;
//            case '-':
//               rta=Integer.parseInt(a)-Integer.parseInt(b);
//               break;
//            case '*':
//               rta=Integer.parseInt(a)*Integer.parseInt(b);
//               break;
//            case '/':
//               rta=Integer.parseInt(a)/Integer.parseInt(b);
//               break;
//            default:
//                System.out.println("Geben Sie eine gültige mathematische Operation");
//                break;
//        
//        }
//        return rta;
//    }
//    
    public String zusatz(){
       Scanner lea=new Scanner(System.in); 
       ArrayList list=new ArrayList();
       String numbers=""; 
       String acu="";
       double a=0;
       double b=0;
       boolean operation=true;
       System.out.println("Geben Sie die Nummer ein");
       numbers=lea.next();
       for(int i=0;i<numbers.length();i++){
       if(numbers.charAt(i)=='*' || numbers.charAt(i)=='+' || numbers.charAt(i)=='/' || numbers.charAt(i)=='-'){
       list.add(acu);
       list.add(numbers.charAt(i));
       acu="";
       }
       else{   
           acu=acu+numbers.charAt(i);
       }
       }
       list.add(acu);
       
       while(operation){
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).toString().equals("*")){
           a=Double.parseDouble(list.get(i-1).toString());
           b=Double.parseDouble(list.get(i+1).toString());
           list.remove(i+1);
           list.remove(i);
           list.remove(i-1);
           list.add(i-1,a*b);
           break;
         }else if(list.get(i).toString().equals("/")){
           a=Double.parseDouble(list.get(i-1).toString());
           b=Double.parseDouble(list.get(i+1).toString());
           list.remove(i+1);
           list.remove(i);
           list.remove(i-1);
           list.add(i-1,a/b);
           break;
         }
               
    }
        for (int j = 0; j < list.size(); j++) {
                if(list.get(j).toString().equals("*") || list.get(j).toString().equals("/")){
                    operation=true;
                    break;
                    } else
                operation=false;
            }
        }
       while(list.size()!=1){  
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).toString().equals("+")){
           a=Double.parseDouble(list.get(i-1).toString());
           b=Double.parseDouble(list.get(i+1).toString());
           list.remove(i+1);
           list.remove(i);
           list.remove(i-1);
           list.add(i-1,a+b);
           break;
         }else if(list.get(i).toString().equals("-")){
           a=Double.parseDouble(list.get(i-1).toString());
           b=Double.parseDouble(list.get(i+1).toString());
           list.remove(i+1);
           list.remove(i);
           list.remove(i-1);
           list.add(i-1,a-b);
           break;
         }
        }
       }
        return list.get(0).toString();
    }
    
}
