package com.tradexl.loadmoredata;

import java.io.Serializable;

/**
 * Created by sab99r
 */
public class MovieModel implements Serializable{
    String title;
    String rating;
    String type;

    public MovieModel(String type) {
        this.type = type;
    }
}
