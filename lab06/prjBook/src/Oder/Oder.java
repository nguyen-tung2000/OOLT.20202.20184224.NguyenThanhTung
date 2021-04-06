package Oder;
import Media.Media;
import java.util.ArrayList;

public class Oder  {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	
	public int qtyOdered;	
	public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public float totalCost() {
		float total = 0;
		Media mediaItem;
		java.util.Iterator iter = itemsOrdered.iterator();
		while(iter.hasNext()) {
			mediaItem = (Media) (iter.next());
			total += mediaItem.getCost();
		}
		return total;
	}
	public int getQtyOdered() {
		return qtyOdered;
	}
	public void setQtyOdered(int qtyOdered) {
		this.qtyOdered = qtyOdered;
	}
	public void addMedia(Media a) {
		if(qtyOdered < MAX_NUMBER_ORDERED) {
			itemsOrdered.add(a);
		}
	}
	public void addMedia(Media [] MediaList) {
		if(qtyOdered + MediaList.length > MAX_NUMBER_ORDERED) {
			System.out.println("Loi");
		}
		for(Media a : itemsOrdered) {
			qtyOdered++;
	
         this.addMedia(MediaList);			
		}
	}
	public void addMedia(Media a1,Media a2) {
		if(qtyOdered + 2 > MAX_NUMBER_ORDERED) {
			System.out.println("Loi");
		}
		else {
			qtyOdered++;
			this.addMedia(a1);
			this.addMedia(a2);
			itemsOrdered.add(a2);
			itemsOrdered.add(a1);
		}
	}
	public void removeMedia(Media a) {
		if(itemsOrdered.size() > 0) {
			itemsOrdered.remove(a);
		}
	}
	public boolean removebyID(int x) {
		for(Media a : itemsOrdered) {
			if(a.getId() == x) {
				removeMedia(a);
				return true;
			}
		}
		return false;
	}
	public void show() {
		for(Media a: itemsOrdered) {
			System.out.println(a.getId()+ " " +a.getTitle()+ " " +a.getCategory() +"  "+ a.getCost());
		}
	}
}
