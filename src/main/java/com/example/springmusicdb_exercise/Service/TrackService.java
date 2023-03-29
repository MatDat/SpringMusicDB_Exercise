package com.example.springmusicdb_exercise.Service;

import com.example.springmusicdb_exercise.Model.Track;
import com.example.springmusicdb_exercise.Repository.TrackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackService {

    @Autowired
    TrackRepo trackRepo;

    public List<Track> fetchAll(){
        return trackRepo.fetchAll();
    }

    public void addTrack(Track t){
        trackRepo.addTrack(t);
    }
}
