package labb10;

import java.util.ArrayList;

public class album {
	
	private ArrayList album = new ArrayList();


	private collection collection2;
	private String albomAutor;
	private String albumStyle;
	private int albumYear;
	private float albumDuration;
	
	public album(String _albomAutor, String _albumStyle, int _albumYear, float _albumDuration) {
		albomAutor = _albomAutor;
		albumStyle = _albumStyle;
		albumYear = _albumYear;
		albumDuration = _albumDuration;
	}
	
	public void getAlbums(){
		System.out.println("Автор/Группа: " + albomAutor + "\n" + "Жанр:  " + albumStyle + "\n" + "Год выпуска: " 
	+ albumYear + "\n" + "Общая продолжительность звучания: " + albumDuration);
	}
	
	public void addAlbum(music album) {
		this.album.add(album);
	}
	public void removeAlbum(music album) {
		this.album.remove(album);
	}
	public ArrayList getAlbumArray() {
		return album;
	}
	
}
 