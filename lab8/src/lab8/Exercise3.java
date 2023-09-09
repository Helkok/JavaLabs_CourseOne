package lab8;

public class Exercise3 {

	public static void main(String[] args) {
		collection col1  = new collection();
		
		
		col1.setCollections("Для тренировок", "Кузнецов Алексей Иванович");
		col1.getCoollections(); 
		
		album alb1 = new album();
		alb1.setAlbums("BackStreet Boys","Pop-music",2001,1.06f);
		album alb2 = new album();
		alb2.setAlbums("Хулио Иглесиас","Латин-Поп-Музыка",1975,35.2f);
		
		music music1 = new music();
		music1.setMusics("Abrázame", 3.39f);
		
		music music2 = new music();
		music2.setMusics("Candilejas", 4.10f);
		
		music music3 = new music();
		music3.setMusics("Quiero", 2.48f);
		
		
		col1.addAlbum(alb1);
		col1.addAlbum(alb2);

		alb1.addMusic(music1);
		alb1.addMusic(music2);
		alb2.addMusic(music3);
		
		col1.searchMusic("Abrázame");
		
		
	}

}