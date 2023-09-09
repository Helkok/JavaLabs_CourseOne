package labb10;

import java.util.*;

public class instrumental_piece extends music {
	private ArrayList instrumental_piece = new ArrayList();

	public instrumental_piece(String _musicName, float _musicDuration) {
		super(_musicName, _musicDuration);
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
}
