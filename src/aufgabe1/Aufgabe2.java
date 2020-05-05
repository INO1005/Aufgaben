/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aufgabe1;

import java.util.Random;

/**
 *
 * @author ino
 */
public class Aufgabe2 {
    
    public void Selectionort(){
    int numbers[]=new int[10];
    Random random=new Random();
    
    for(int i=0;i<numbers.length;i++){
        numbers[i]=random.nextInt(50);
    }
    int ver=0;
    for(int i=0;i<numbers.length-1;i++){
    for(int j=i+1;j<numbers.length;j++){
       if(numbers[i]>numbers[j]){
        ver=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=ver;
        }
        }
      }
    for(int rta:numbers){
        System.out.println(rta);
    }
    }
}
