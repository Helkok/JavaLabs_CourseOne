package lab9;

public class music {
	private String musicName;
	private float musicDuration;
	private String description;
	
	public music(String _musicName, float _musicDuration, String _description) {
		musicName = _musicName;
		musicDuration = _musicDuration;
		description = _description;
	}
	public void getMusics(){
		System.out.println("Название музыкального произведения: " + musicName + "\n" + "Продолжительность музыкального произведения: " 
	+ musicDuration + "\n" + "Описание музыкального произведения: " + description);
	}
}