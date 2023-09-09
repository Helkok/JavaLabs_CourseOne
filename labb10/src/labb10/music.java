package labb10;

abstract class music {
	private String musicName;
	private float musicDuration;
	
	public music(String _musicName, float _musicDuration) {
		setMusicName(_musicName);
		setMusicDuration(_musicDuration);
	}
	public void getMusics(){
		System.out.println("Название музыкального произведения: " + getMusicName() + "\n" 
	+ "Продолжительность музыкального произведения: "  + getMusicDuration() + "\n");
	}
	
	public abstract void description();
	
	
	public float getMusicDuration() {
		return musicDuration;
	}
	public void setMusicDuration(float musicDuration) {
		this.musicDuration = musicDuration;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
}