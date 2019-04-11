package com.chris.giflib.data;

import com.chris.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("avocado", LocalDate.now(), "Kate", false),
            new Gif("cbot", LocalDate.of(2019,4,11), "Chris", true)
    );

    public Gif findBName(String name) {
        for (Gif gif : ALL_GIFS) {
            if(gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}
