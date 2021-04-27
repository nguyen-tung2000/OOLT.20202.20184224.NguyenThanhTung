package media;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import disc.CompactDisc;
import disc.DigitalVideoDisc;

public class TestMediaCompareTo {
	
public static <T> void main(String[] args) {
		
		DigitalVideoDisc cd1 = new DigitalVideoDisc("Sex and Then","drama",100.5f,"Lee",190);
		DigitalVideoDisc cd2 = new DigitalVideoDisc("Sex and Then","drama",100.5f,"Lee",190);
		DigitalVideoDisc cd3 = new DigitalVideoDisc("Sex and Then","drama",100.5f,"Lee",190);
		
		Collection<Media> listDisc = new java.util.ArrayList<Media>();
		listDisc.add(cd1);
		listDisc.add(cd2);
		listDisc.add(cd3);
		
		Iterator iterator = (Iterator) listDisc.iterator();
		
	    Collections.sort((List<T>) listDisc);
	    Iterator iterator2 = (Iterator) listDisc.iterator();
	    
	    while(((java.util.Iterator<Media>) iterator2).hasNext()) {
	    	Object obj = iterator2.next();
	    	System.out.println("Playing CD: " + ((Media) obj).getTitle());
			System.out.println("Cost: " + ((Media) obj).getCost());
		}
}
}