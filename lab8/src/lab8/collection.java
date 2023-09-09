package lab8;
import java.util.ArrayList;


public class collection {
	
	private ArrayList album = new ArrayList();
	
	private String coollectionTitle;
	private String coollectionName;
	
	public void setCollections(String _coollectionTitle, String _coollectionName) {
		coollectionTitle = _coollectionTitle;
		coollectionName = _coollectionName;
	}
	
	public void getCoollections(){
		System.out.println("Название коллекции: " + coollectionTitle + "\n" + "ФИО Владельца:  " + coollectionName);
	}

	public ArrayList getAlbum() {
		return album;
	}

	public void addAlbum(album album) {
		this.album.add(album);
	}
	public void removeAlbum(album album) {
		this.album.remove(album);
	}
	public void searchMusic(String Name) {
		for (int i = 0; i < album.size(); i++) {
			for (int j = 0; j < ((album)album.get(i)).getMusic().size(); j++) {
				if (Name.equals(((music)((album) album.get(i)).getMusic().get(j)).getName())) {
					((album) album.get(i)).getAlbums();
					((music)((album) album.get(i)).getMusic().get(j)).getMusics();
				}
		}
	}

}}