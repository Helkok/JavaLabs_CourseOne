package lab8.Lab4;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String author;
    private String genre;
    private int date;
    private double duration;
    private List<Composition> compositionList = new ArrayList<>();


    public Album() {
    }

    public Album(String author, String genre, int date) {
        this.author = author;
        this.genre = genre;
        this.date = date;
    }


    public double getDuration() {
        duration = 0;
        for(Composition composition : compositionList){
            duration += composition.getDuration();
        }
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void addComposition(Composition composition){
        compositionList.add(composition);
    }

    public List<Composition> getCompositionList() {
        return compositionList;
    }

    public void setCompositionList(List<Composition> compositionList) {
        this.compositionList = compositionList;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
