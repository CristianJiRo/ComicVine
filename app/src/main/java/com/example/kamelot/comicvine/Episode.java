package com.example.kamelot.comicvine;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Kamelot on 03/01/2017.
 */

public class Episode {

    private Date date_last_updated;
    private String description;
    private ArrayList<String> image;
    private String episode_number;
    private String name;
    private ArrayList<String> series;

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

    public String getEpisode_number() {
        return episode_number;
    }

    public void setEpisode_number(String episode_number) {
        this.episode_number = episode_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<String> series) {
        this.series = series;
    }
}
