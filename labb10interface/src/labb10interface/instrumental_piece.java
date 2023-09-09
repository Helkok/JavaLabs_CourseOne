package labb10interface;
import java.util.*;
public class instrumental_piece implements music {
	private ArrayList instrumental_piece = new ArrayList();
	
	private String instName;
	private float instDuration;
	public instrumental_piece(String _musicName, float _musicDuration) {
		instName = _musicName;
		instDuration = _musicDuration;
	}
	
	public void addInst(String instrumental_piece) {
		this.instrumental_piece.add(instrumental_piece);
	}
	public void removeInst(String instrumental_piece) {
		this.instrumental_piece.remove(instrumental_piece);
	}
	@Override
	public void description() {
		System.out.print("Название: " + getMusicName()+ "\nпродолжительность: " + getMusicDuration() + "\nучастники: ");
		for (int i = 0; i < instrumental_piece.size(); i++) {
			System.out.print(instrumental_piece.get(i));
		}
	}
	@Override
	public float getMusicDuration() {
		// TODO Auto-generated method stub
		return instDuration;
	}
	@Override
	public void setMusicDuration(float instDuration) {
		this.instDuration = instDuration;
	}
	@Override
	public String getMusicName() {
		// TODO Auto-generated method stub
		return instName;
	}
	@Override
	public void setMusicName(String instName) {
		this.instName = instName;
	}
}
