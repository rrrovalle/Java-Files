/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files_IO.Text_files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class implement a simplest way to create and write a text file in Java.
 * 
 * @version 1.0
 * @author Rodrigo Valle
 * @since 01/06/2019
 */
public class rw_text {
    public static void main(String[] args) throws Exception {
        
        //writer é caracters    / stream é bytes
        //BufferedReader: read the file 
        //PrintWriter: print out the file
        BufferedReader in = new BufferedReader(new FileReader("data.txt"));
        PrintWriter out = new PrintWriter("answer.txt");
        
        //only to keep the first line out of the sum/produt process 
        out.printf("%s\n",in.readLine());
        
        do{
            
            String linha = in.readLine();
            
            //if theres nothing more to read, stop it
            if(linha == null){
                break;
            }
            
            //have to split the file to be able to apply math operations
            String[] slot = linha.split(" ");
            
            int sum = Integer.parseInt(slot[0]) + Integer.parseInt(slot[1]) + Integer.parseInt(slot[2]);
            int product = Integer.parseInt(slot[0]) * Integer.parseInt(slot[1]) * Integer.parseInt(slot[2]);
            
            //This is the content to write into a file
            out.printf("%s %s %s %s %s\n", slot[0],slot[1],slot[2], sum, product);

        }while(true);
        
        //Be sure to close BufferedReader and PrintWriter
        in.close();
        out.close();
       
        
    }
}
