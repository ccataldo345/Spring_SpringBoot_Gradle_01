package com.chris.giflib.data;

import com.chris.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("avocado", 1, LocalDate.now(), "Kate", false),
            new Gif("cbot", 2, LocalDate.of(2019, 4, 11), "Chris", true)
    );

    public Gif findGifByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> findGifByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }
}
