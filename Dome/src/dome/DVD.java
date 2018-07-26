package dome;

public class DVD extends Item{
	private String director;

	public DVD(String title, String director, int playingtime, String comment) {
		super(title, playingtime,false, comment);
		setTitle("b");
		this.director = director;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD("a","b",1,"...");
		dvd.print();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is DVD:");
		super.print();
		System.out.println(director);
	}

}
 