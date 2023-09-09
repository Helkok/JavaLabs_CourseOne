package labb10interface;
public class song implements music {
	private String songText;
	private String songAutor;
	private String songName;
	private float songDuration;
	
	public song(String _musicName, float _musicDuration, String _songText, String _songAutor) {
		songName = _musicName;
		songDuration = _musicDuration;
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

	@Override
	public float getMusicDuration() {
		return songDuration;
	}

	@Override
	public void setMusicDuration(float songDuration) {
		this.songDuration = songDuration;
	}

	@Override
	public String getMusicName() {
		return songName;
	}

	@Override
	public void setMusicName(String songName) {
		this.songName = songName;
		
	}
}