package com.chris.giflib.controller;

import com.chris.giflib.data.GifRepository;
import com.chris.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs() {
        return "index";
    }

/*
    // part 01
    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("cbot", LocalDate.of(2019, 4, 11), "Chris", true);
        modelMap.put("gif", gif);
        return "gif_detail";
    }
*/
    // part 2 - use GifRepository.gifDetails method
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.findGifByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }

    @RequestMapping("/gif-list")
    public String listGifs(ModelMap modelMap) {
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        System.out.println();
        return "gif-list";
    }

}
