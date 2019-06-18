/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files_IO.Serializable.ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Rodrigo Valle
 */
public class ObjectStream_MAIN {
    public static void main(String[] args) throws Exception {
        
//        Theater t1 = new Theater("Panamá Theater");
//        t1.addMovie(new Movie("Star Wars - Phantom Menace",1));
//        t1.addMovie(new Movie("Gullivers Travel",2));
//
//        Theater t2 = new Theater("Hollywood Vine");
//        t2.addMovie(new Movie("Batman",3));
//        t2.addMovie(new Movie("Lego - The Movie",33));
        
        Movie m = new Movie("Star Wars - Phantom Menace",1);
        Movie m1 = new Movie("ToyStory 3",3);
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("movies.dat"));
        
        out.writeObject(m);
        out.writeObject(m1);
        out.close();
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("movies.dat"));
        
        int qtd = in.read();
        System.out.println(qtd);
        
        for(int i=0; i<qtd; i++){
            Movie t = (Movie) in.readObject();
            System.out.println(t.getCod()+" "+t.getTitle());
        }
        
    }
}
