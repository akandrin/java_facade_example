package com;

import java.util.ArrayList;
import java.util.List;

// часть фильма
public class PartFilm {
    private List<String> acts; // описание действий актеров

    public PartFilm()
    {
        acts = new ArrayList<>();
    }

    // добавить действие актера
    void AddAct(String actDescription)
    {
        acts.add(actDescription);
    }

    List<String> GetActs()
    {
        return acts;
    }
}
