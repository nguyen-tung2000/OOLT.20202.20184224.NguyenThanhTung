package Oder;
import java.util.ArrayList;
import date.MyDate;
import media.Media;

public class Oder {

	private ArrayList<Media> itemsOrdered=  new ArrayList<Media>();
	/**
	 *  
	 */
	public Oder() {
		super();
	}


	public void addMedia(Media media) {
		if(!(itemsOrdered.contains(media))){
			itemsOrdered.add(media);
		}
	}

	public void removeMedia(Media media) {
		if((itemsOrdered.contains(media))){
			itemsOrdered.add(media);
		}
	}

	public float totalCost() {
		// store the running total of the discs in the order
		float total = 0;
		Media media;
		// loop through the discs in the order
		for (Media value: itemsOrdered) {
			media=value;
			total = total + media.getCost();
		}
		return total;
	}
}
