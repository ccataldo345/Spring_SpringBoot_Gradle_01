package com.chris.giflib.controller;

import com.chris.giflib.data.CategoryRepository;
import com.chris.giflib.data.GifRepository;
import com.chris.giflib.model.Category;
import com.chris.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/category-list")
    public String listCategories(ModelMap modelMap) {
        List<Category> allCategories = categoryRepository.getAllCategories();
        modelMap.put("categories", allCategories);
        return "category-list";
    }

    @RequestMapping("/category/{id}")
    public String categoryDetails(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.findCategoryById(id);
        modelMap.put("category", category);

        List<Gif> gifs = gifRepository.findGifByCategoryId(id);
        modelMap.put("gifs", gifs);

        return "category-details";
    }

}
