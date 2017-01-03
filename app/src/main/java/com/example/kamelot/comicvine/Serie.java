package com.example.kamelot.comicvine;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Kamelot on 03/01/2017.
 */

public class Serie {

    private int count_of_episodes;
    private Date date_last_updated;
    private String description;
    private ArrayList<String> image;
    private String name;

    public int getCount_of_episodes() {
        return count_of_episodes;
    }

    public void setCount_of_episodes(int count_of_episodes) {
        this.count_of_episodes = count_of_episodes;
    }

    public Date getDate_last_updated() {
        return date_last_updated;
    }

    public void setDate_last_updated(Date date_last_updated) {
        this.date_last_updated = date_last_updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getImage() {
        return image;
    }

    public void setImage(ArrayList<String> image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
