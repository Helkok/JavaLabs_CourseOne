package lab9;


public class Exercise1 {

	public static void main(String[] args) {
		collection col1  = new collection("Для тренировок", "Кузнецов Алексей Иванович");
		col1.getCoollections(); 
		
		album alb1 = new album("BackStreet Boys","Pop-music",2001,1.06f);
		alb1.getAlbums();
		album alb2 = new album("Хулио Иглесиас","Латин-Поп-Музыка",1975,35.2f);
		alb2.getAlbums();
		instrumental_piece inspie = new instrumental_piece("Quiero", 2.48f, "Испанская песня о любви от лица Девушки","Piano, Guitar, Flute");
		System.out.print("(1) ");
		inspie.getMusics();
		inspie.getInst();
		song song3 = new song("Quiero", 2.48f, "Испанская песня о любви от лица Девушки", "Quiero enseñarte un camino en el mar\n"
				+ "Un lugar donde nadie ha podido llegar\n"
				+ "Donde el viento es amigo, la brisa, un suspiro\n"
				+ "Que abraza tu cuerpo, pequeña, al pasar", "Хулио Иглесиас");
		System.out.print("(2) ");
		song3.getMusics();
		song3.getSong();
			
		
	}

}
