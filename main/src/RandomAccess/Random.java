/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files_IO.RandomAcess;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Valle
 */
public class Random {

    static Scanner input = new Scanner(System.in);
    static final long TAMREG = 10;

    public static void main(String[] args) throws Exception {
        RandomAccessFile rand = new RandomAccessFile("names.dat", "rw");
        
        boolean skip = false;
        long file_size = (rand.length() / TAMREG);

        do {
            System.out.println("1-Insert, 2-List or 3-Delete");
            String opt = input.nextLine();
            switch(opt){
                case "1":
                    insert(rand);
                    break;
                case "2":
                    list(rand);
                    break;
                case "3":
                    delete(rand);
                default:
                    skip = true;
            }
        } while (skip != true);

    }

    private static void insert(RandomAccessFile rand) throws Exception{
        long qtd = (rand.length()+1);
        rand.seek(qtd);
        System.out.println("Which name do you want to insert on file?");
        String ans = input.nextLine();
        
        char[] name = Arrays.copyOf(ans.toCharArray(), 10);
        for(char c:name){
            rand.write(c);
        }
        rand.close();

    }

    private static void list(RandomAccessFile rand) throws IOException {
        System.out.println("Which Position do you want to see data?");
        int pos = input.nextInt();
        
        rand.seek(pos*TAMREG);
        byte[] name = new byte[10];
        rand.read(name);
        String s = "";
        for(byte b:name){
            s = s+(char)b;
        }
        System.out.println(s);
        
       
    }

    private static void delete(RandomAccessFile rand) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
