package lab8.Lab1;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private String name;
    private String owner;
    private List<Album> albums = new ArrayList<>();

    public Collection() {
    }

    public Collection(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void addAlbum(Album album){
        albums.add(album);
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
