package com.example.springmusicdb_exercise.Repository;

import com.example.springmusicdb_exercise.Model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TrackRepo {

    @Autowired
    JdbcTemplate template;

    public List<Track> fetchAll(){
        String sql = "SELECT * FROM track";
        RowMapper<Track> rowMapper = new BeanPropertyRowMapper<>(Track.class);
        return template.query(sql, rowMapper);
    }
    public void addTrack(Track t){
        String sql ="INSERT INTO track (track_id, track, artist_name, album_title, year_of_release, record_comp) VALUES (?, ?, ?, ?, ?, ?)";
        template.update(sql, t.getTrack_id(), t.getTrack(), t.getArtist_name(), t.getAlbum_title(), t.getYear_of_release(),
                t.getRecord_comp());
    }
    public Track findTrackByID(int id){
        String sql="SELECT * FROM track WHERE track_id = ?";
        RowMapper<Track> rowMapper = new BeanPropertyRowMapper<>(Track.class);
        Track t = template.queryForObject(sql, rowMapper, id);
        return t;
    }
}

