package com;

import java.util.List;

// видеомонтажер
public class VideoEditer {

    // отредактировать снятые куски фильма
    public Film Edit(List<PartFilm> partsFilm)
    {
        String res = "";
        for (var partFilm : partsFilm)
        {
            for (var act : partFilm.GetActs())
            {
                res += act;
            }
            res += "\n________\n";
        }
        return new Film(res);
    }
}
