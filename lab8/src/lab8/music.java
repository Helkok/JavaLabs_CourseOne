package lab8;

public class music {
	private String musicName;
	private float musicDuration;
	private album musicNos;
	
	public void setMusics(String _musicName, float _musicDuration) {
		musicName = _musicName;
		musicDuration = _musicDuration;
	}
	public float getMusicDuration() {
		return musicDuration;
	}
	public void getMusics(){
		System.out.println("Название музыкального произведения: " + musicName + "\n" + "Продолжительность музыкального произведения: "  + musicDuration);
	}
	public album getMusicNos() {
		return musicNos;
	}
	public void setMusicNos(album musicNos) {
		this.musicNos = musicNos;
	}
	public String getName() {
		return musicName;
	}
}
 