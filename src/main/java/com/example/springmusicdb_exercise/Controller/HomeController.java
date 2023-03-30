package com.example.springmusicdb_exercise.Controller;

import com.example.springmusicdb_exercise.Model.Track;
import com.example.springmusicdb_exercise.Service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    TrackService trackService;

    @GetMapping("/")
    public String index(Model model) {
        List<Track> trackList = trackService.fetchAll();
        model.addAttribute("tracks", trackList);
        return "home/index";
    }
    @GetMapping("/create")
    public String create(){
        return "home/create";
    }
    @PostMapping("/createNew")
    public String createNew(@ModelAttribute Track track){
        trackService.addTrack(track);
        return "redirect:/";
    }
    @GetMapping("/viewOne/{id}")
    public String viewOne(@PathVariable("id") int id, Model model){
        model.addAttribute("track", trackService.findTrackByID(id));
        return "home/viewOne";
    }
}
