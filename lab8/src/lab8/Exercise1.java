package lab8;

public class Exercise1 {

	public static void main(String[] args) {
		collection col1  = new collection();
		
		
		col1.setCollections("Для тренировок", "Кузнецов Алексей Иванович");
		col1.getCoollections(); 
		
		album alb1 = new album();
		alb1.setAlbums("BackStreet Boys","Pop-music",2001,1.06f);
		alb1.getAlbums();
		album alb2 = new album();
		alb2.setAlbums("Хулио Иглесиас","Латин-Поп-Музыка",1975,35.2f);
		alb2.getAlbums();
		
		music music1 = new music();
		music1.setMusics("Abrázame", 3.39f);
		System.out.print("(1) ");
		music1.getMusics();
		music music2 = new music();
		music2.setMusics("Candilejas", 4.10f);
		System.out.print("(2) ");
		music2.getMusics();
		music music3 = new music();
		music3.setMusics("Quiero", 2.48f);
		System.out.print("(3) ");
		music3.getMusics();
		
		alb1.addMusic(music2);
		alb1.addMusic(music1);
		System.out.println("Продолжительностть первого альбома = " + alb1.albumDuration2());
		
		
		
	}

}
