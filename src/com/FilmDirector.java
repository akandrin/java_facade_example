package com;

import java.util.ArrayList;
import java.util.List;

// режиссер снимает сцены
public class FilmDirector {

    private List<Actor> actors;

    public FilmDirector()
    {
        actors = new ArrayList<>();
    }

    public void AddActor(Actor actor)
    {
        actors.add(actor);
    }

    public void ClearActors() {
        actors.clear();
    }

    // снять сцену
    public PartFilm ShootScene(String sceneScript)
    {
        PartFilm partFilm = new PartFilm();
        String act = "";
        for (var actor : actors)
        {
            actor.ReadScript(sceneScript);
            act += actor.Act(); // актер сыграл действие
        }
        partFilm.AddAct(act); // добавляем действие в "часть фильма"
        return partFilm;
    }
}
