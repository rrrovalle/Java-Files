/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Files_IO.Serializable.ObjectStream;

import java.io.Serializable;

/**
 *
 * @author Rodrigo Valle
 */
public class Movie implements Serializable {
    
    String title;
    int cod;

    public Movie(String title, int cod) {
        this.title = title;
        this.cod = cod;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", cod=" + cod + '}';
    }
    
    
}
