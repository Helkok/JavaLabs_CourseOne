package labb10interface;
public class collection {
	private String coollectionTitle;
	private String coollectionName;
	
	public collection(String _coollectionTitle, String _coollectionName) {
		coollectionTitle = _coollectionTitle;
		coollectionName = _coollectionName;
	}
	
	public void getCoollections(){
		System.out.println("Название коллекции: " + coollectionTitle + "\n" + "ФИО Владельца:  " + coollectionName);
	}

}