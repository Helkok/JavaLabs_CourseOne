package lab9;
import java.util.ArrayList;



public class instrumental_piece extends music {
	
	
	private String instruments;
	
	public instrumental_piece(String _musicName, float _musicDuration, String _description, String _instruments) {
		super(_musicName,_musicDuration,_description);
		instruments = _instruments;
	}
	
	public void getInst(){
		System.out.println("Инструменты: " + instruments);
	}
}
