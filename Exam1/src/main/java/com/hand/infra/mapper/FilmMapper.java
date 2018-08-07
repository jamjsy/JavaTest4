package com.hand.infra.mapper;

import com.hand.domain.entity.Film;

public interface FilmMapper {
    public FilmMapper(ResultSet rs, int rowNum) throws SQLException {
        Film film = new Film() ;
        film.setfilm_id(rs.getInt("film_id"));
        film.settitle(rs.getString("title"));
        film.setlanguage_id(rs.getInt("language_id"));
        film.setdescription(rs.getString("description"));
        return film;
    }
}
