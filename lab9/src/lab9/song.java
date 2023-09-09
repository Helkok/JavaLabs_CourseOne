package lab9;
import java.util.ArrayList;



public class song extends music {
	
	
	private String songText;
	private String songAutor;
	
	public song(String _musicName, float _musicDuration, String _description, String _songText, String _songAutor) {
		super(_musicName,_musicDuration,_description);
		songText = _songText;
		songAutor = _songAutor;
	}
	
	public void getSong(){
		System.out.println("Текст песни: " + songText + "\n" + "Автор песни: "  + songAutor);
	}
}