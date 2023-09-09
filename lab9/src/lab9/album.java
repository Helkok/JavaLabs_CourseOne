package lab9;

import java.util.ArrayList;

public class album {
	
	

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
		System.out.println("Автор/Группа: " + albomAutor + "\n" + "Жанр:  " + albumStyle + "\n" + "Год выпуска: " + albumYear + "\n" + "Общая продолжительность звучания: " + albumDuration);
	}
	
	
}
 