package com;

import java.util.ArrayList;
import java.util.List;

// фасад создателя фильмов
public class FilmMakerFacade {

    Film MakeFilm()
    {
        FilmDirector filmDirector = new FilmDirector();
        var actors = new ArrayList<Actor>();
        actors.add(new Actor("Kolobok")); // добавляем актера 1
        actors.add(new Actor("Fox")); // добавляем актера 2
        Scriptwriter scriptwriter = new Scriptwriter();
        VideoEditer videoEditer = new VideoEditer();

        String script = scriptwriter.WriteScript();
        var sceneScripts = script.split(";");


        List<PartFilm> partsFilm = new ArrayList<>();
        for (var sceneScript : sceneScripts)
        {
            for (var actor : actors) {
                if (sceneScript.contains(actor.GetName())) // если в сцене есть упоминание персонажа - добавляем его в сцену как актера
                {
                    filmDirector.AddActor(actor);
                }
            }
            PartFilm partFilm = filmDirector.ShootScene(sceneScript); // снимаем сцену
            partsFilm.add(partFilm); // добавляем отснятый кусок в список
            filmDirector.ClearActors();
        }
        Film film = videoEditer.Edit(partsFilm);

        Producer producer = new Producer();
        return producer.Produce(film);
    }
}
