package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    private String title;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    private Rating maturityRating;

    public Rating getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(Rating maturityRating) {
        this.maturityRating = maturityRating;
    }



    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Movie(String title, Rating maturityRating) {

        this.title = title;
        this.maturityRating = maturityRating;
    }
    public Movie() {
    }


    @Override
    public String toString() {
        if (releaseDate == null){
            return getTitle();
        }else{
            return getTitle() + " ( " + getReleaseDate().getYear() +  " )" ;
        }

    }

    @Override
    public void play() {
        System.out.println("Playing " + this);

    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }
}
