package com.example.springmusicdb_exercise.Controller;

import com.example.springmusicdb_exercise.Model.Track;
import com.example.springmusicdb_exercise.Service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
