package Media;
import java.util.ArrayList;

public class Book extends Media {

	Media b = new Media();
	public Book(Media b, ArrayList<String> authors) {
		super();
		this.b = b;
		this.authors = authors;
	}
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title, category);
	}
	public Book(String title,String category,ArrayList<String> authors) {
		super(title,category);
		this.authors = authors;
	}
	protected ArrayList<String> authors = new ArrayList<String>();
	
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName));
	}
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName));
	}
}
