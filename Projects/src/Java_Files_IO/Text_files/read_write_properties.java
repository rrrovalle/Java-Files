/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files_IO.Text_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * This class show how to operate properties 
 * 
 * @version 1.0
 * @author Rodrigo Valle
 * @since 01/06/2019
 */
public class read_write_properties {
    public static void main(String[] args) throws Exception {
        
        Properties p = new Properties();
        p.load(new FileInputStream("dados.properties"));
        p.setProperty("tabuada", "19");
        p.store(new FileOutputStream("dados.properties"),"45PBD");
        
    }
}
