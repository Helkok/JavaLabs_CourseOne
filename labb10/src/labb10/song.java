package labb10;

public class song extends music {
	
	
	private String songText;
	private String songAutor;
	
	public song(String _musicName, float _musicDuration, String _songText, String _songAutor) {
		super(_musicName,_musicDuration);
		songText = _songText;
		songAutor = _songAutor;
	}
	
	public void getSong(){
		System.out.println("Текст песни: " + songText + "\n" + "Автор песни: "  + songAutor);
	}

	@Override
	public void description() {
		System.out.println("Название: " + getMusicName() + "\nпродолжительность: " 
	+ getMusicDuration() + "\nтекст: " + songText + "\nАвтор текста: " + songAutor);
	}
}