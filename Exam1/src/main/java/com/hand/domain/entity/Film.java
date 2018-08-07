package com.hand.domain.entity;

import java.util.List;

public class Film {

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int film_id;
    public String title;
    public int language_id;
    public String description;
}


