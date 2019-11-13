/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbaritoputri;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class TestBaritoPutri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //No.3
//      int tamp[]={0};
//      ArrayList<Integer> hasil=new ArrayList<>();
//      ArrayList<Integer> tamp1=new ArrayList<>();
//      int hasil1=0,error=0;
//      Scanner in=new Scanner(System.in);
//        System.out.print("Masukan Banyak Data :");
//        int banyak=in.nextInt();
//        
//        for(int y=0;y<banyak;y++){
//            System.out.print("Masukan Data :");
//            int masuk=in.nextInt();
//            tamp1.add(masuk);
//        }
//        System.out.print("Data yang telah diinputkan : ");
//        for (int i = 0; i < banyak; i++) {
//                System.out.print(tamp1.get(i)+" ");
//        }
//        
//        for (int i = 0; i < tamp1.size(); i++) {
//            for (int j = i; j < tamp1.size(); j++) {
//                if(tamp1.get(i)<tamp1.get(j)){
//                  hasil.add(tamp1.get(j)-tamp1.get(i));
//                  hasil1=hasil.get(0);
//                }else{
//                    error+=1;
//                }
//            }
//        }
//        
//        for(int h=0;h<hasil.size();h++){
//            for(int p=0;p<hasil.size();p++){
//                
//                if(hasil1<hasil.get(p)){
//                    hasil1=hasil.get(p);
//                }
//            }
//        }
//        for (int i = 0; i < hasil.size(); i++) {
//            System.out.print(hasil.get(i)+" ");
//        }
//        System.out.println();
//        System.out.println("Output : "+hasil1);
        
        
        //No.1
        String list[] = {"pro", "gram", "merit", "program", "it", "programmer"};
        ArrayList<String> list1 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input :");
        String data = input.nextLine();
        int index = 0;
        for (int h = 0; h < data.length(); h++) {
            if (data.substring(0, h + 3).contains(list[index]) == true) {
                list1.add("pro");
            }
            break;

        }
        for (int i = 0; i < data.length(); i++) {
            if (data.substring(3, 7).contains(list[index + 1]) == true) {
                list1.add("gram");
            }
            break;
        }
        list1.add("kosong");
        for (int i = 0; i < data.length(); i++) {
            if (data.substring(0, 7).contains(list[index + 3]) == true) {
                list1.add("program");
            }
            break;
        } 
        
        if (data.equals("programmerit") == true) {
            for (int i = 0; i < data.length(); i++) {
                if (data.substring(7, 12).contains(list[index + 2]) == true) {
                    list1.add("merit");

                }
                list1.add("kosong");
                if (data.substring(0, 10).contains(list[index + 5]) == true) {
                    list1.add("programmer");
                    break;
                }
            }
        }
        
        for (int i = 0; i < data.length(); i++) {
           if (data.substring(data.length() - 2, data.length()).contains(list[index + 4]) == true) {
                    list1.add("it");
                    break;
                }
        }

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i).equals("kosong")==true){
                System.out.println();
            }else{    
                System.out.print(list1.get(i) + ",");
            }

        }
        
     
    }
}
        
 
    


    

