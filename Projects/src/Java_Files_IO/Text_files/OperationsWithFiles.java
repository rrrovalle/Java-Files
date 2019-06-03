/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files_IO.Text_files;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Valle
 */
public class OperationsWithFiles {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Please insert the path you want to check:");
        String path = c.nextLine();
        
        showFiles(path);
    }
    
        
    public static void showFiles(String path){
        File f = new File(path);
        File[] arc = f.listFiles();
        
       for(File a : arc){
           System.out.println((a.isFile()?"-":"d")+(a.canRead()?"r":"-")+(a.canWrite()?"w":"-")
           +(a.canExecute()?"R":"-")+(a.isHidden()?"h":"-")+a.getName());
       }
    }
    
}
