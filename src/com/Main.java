package com;

public class Main {

    public static void main(String[] args) {
	    FilmMakerFacade filmMakerFacade = new FilmMakerFacade();
        Film film = filmMakerFacade.MakeFilm();
        System.out.println(film.GetFilm());
    }
}
