package dome;

public class CD extends Item{
	private String artist;
	private int numofTracks;
	

	public CD(String title, String artist, int numofTracks, int playingtime, String comment) {
		super(title, playingtime, false, comment);
		//this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingtime = playingtime;
//		this.comment = comment;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD("a", "b", 2,2,"...");
		cd.print();
	}

//	public void print() {
//		System.out.println("This is CD:"+title+":"+artist);
//		// TODO Auto-generated method stub
//	}
}

	
