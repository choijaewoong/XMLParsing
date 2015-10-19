package com.torerov.navermovieapi;

import com.begentgroup.xmlparser.SerializedName;

import java.util.ArrayList;

/**
 * Created by Tacademy on 2015-10-19.
 */
public class NaverMovies {

    String title;
    String link;
    int total;
    int start;
    int display;
    @SerializedName("item")
    ArrayList<MovieItem> items;
}
