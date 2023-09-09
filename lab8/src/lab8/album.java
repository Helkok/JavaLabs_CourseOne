package lab8;

import java.util.ArrayList;

public class album {
	private ArrayList music = new ArrayList();
	
	

	private collection collection2;
	private String albomAutor;
	private String albumStyle;
	private int albumYear;
	private float albumDuration;
	
	public void setAlbums(String _albomAutor, String _albumStyle, int _albumYear, float _albumDuration) {
		albomAutor = _albomAutor;
		albumStyle = _albumStyle;
		albumYear = _albumYear;
		albumDuration = _albumDuration;
	}
	
	public void getAlbums(){
		System.out.println("Автор/Группа: " + albomAutor + "\n" + "Жанр:  " + albumStyle + "\n" + "Год выпуска: " + albumYear + "\n" + "Общая продолжительность звучания: " + albumDuration);
	}
	
	public ArrayList getMusic() {
		return music;
	}

	public void addMusic(music music) {
		this.music.add(music);
	}
	public void removeMusic(music music) {
		this.music.remove(music);
	}

	public collection getCollection2() {
		return collection2;
	}

	public void setCollection2(collection collection2) {
		this.collection2 = collection2;
	}
	
	public float albumDuration2(){
		albumDuration =0;
		for (int i = 0; i < music.size(); i++) {
			albumDuration += ((music) music.get(i)).getMusicDuration();
		}
		return albumDuration;
	}
	
	
}
 