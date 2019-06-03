/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files_IO.BinaryAcess;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Valle
 */
public class BinaryAcess {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        File f = new File("binary_data.dat");
        if(!f.exists()){
            f.createNewFile();
        }
        
        boolean skip = false;
        
        do{
            System.out.println("1-Insert or 2-List");
            String opt = in.nextLine();
            
            switch(opt){
                case "1":
                    insertData(f);
                    break;
                case "2": 
                    listData(f);
                    break;
                default:
                    skip = true;
            }
        }while(skip != true);
    }

    private static void insertData(File f) throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(f,true));
        System.out.println("Which name?");
        String name = in.nextLine();
        
        char[] aname = Arrays.copyOf(name.toCharArray(), 10);
        for(char c: aname){
            out.write(c);
        }
        
        out.close();
        
    }

    private static void listData(File f) throws Exception {
        DataInputStream input = new DataInputStream(new FileInputStream("binary_data.dat"));
        
        while(input.available()>0){
            byte[] name = new byte[10];
            input.read(name);
            String s = "";
            
            for(byte b: name){
                s = s + (char) b;
            }
            System.out.println(s);
            
        }
       input.close();
    }
}
