package pl.sda.lambda;

import java.time.LocalDate;
import java.util.List;

public class Movie{
    private String title;
    private String director;
    private LocalDate localDate;
    private double price;
    private List<String> actorlist;

    public Movie(String title, String director, LocalDate localDate, double price, List<String> actorlist) {
        this.title = title;
        this.director = director;
        this.localDate = localDate;
        this.price = price;
        this.actorlist = actorlist;
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

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getActorlist() {
        return actorlist;
    }

    public void setActorlist(List<String> actorlist) {
        this.actorlist = actorlist;
    }
}
