package labb10interface;

public class Exercise1 {

	public static void main(String[] args) { 
		album alb1 = new album("BackStreet Boys","Pop-music",2001,1.06f);
			
		song song1 = new song("Quiero", 2.48f, "Quiero enseñarte un camino en el mar\n"
				+ "Un lugar donde nadie ha podido llegar\n"
				+ "Donde el viento es amigo, la brisa, un suspiro\n"
				+ "Que abraza tu cuerpo, pequeña, al pasar", "Хулио Иглесиас");
		song song2 = new song("Candilejas", 4.10f, "Nadie te ha querido como yo\n"
				+ "Nadie te ha ofrecido tanto amor\n"
				+ "Nadie te ha enseñado de la vida más que yo\n"
				+ "Nadie mi amor, buscó tu amor con tanto amor", "Хулио Иглесиас");
		instrumental_piece inst1 = new instrumental_piece("Quiero", 2.48f);
		inst1.addInst("Piano, Guitar, Flute");	
		alb1.addAlbum(song1);
		alb1.addAlbum(song2);
		alb1.addAlbum(inst1);	
		for (int i = 0; i < alb1.getAlbumArray().size(); i++) {
			((music) alb1.getAlbumArray().get(i)).description();
		}

	}

}
