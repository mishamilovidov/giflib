package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FavoritesController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/favorites")
    public String listFavorites(ModelMap modelMap) {

        List<Gif> favoriteGifs = gifRepository.getFavoriteGifs();

        modelMap.put("gifs", favoriteGifs);

        return "favorites";
    }

}
