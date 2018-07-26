package dome;

public class Item {
	private String title;
	private int playingtime;
	private boolean gotIt = false;
	private String comment;

	public Item() {
		
	}
	
	public Item(String title, int playingtime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingtime = playingtime;
		this.gotIt = gotIt;
		this.comment = comment;
	}


	public void setTitle(String title) {
		
	}
	public void print() {
		System.out.println(title);
	}

}
