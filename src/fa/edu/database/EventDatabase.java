package fa.edu.database;

import java.util.ArrayList;
import java.util.List;

import fa.edu.models.Event;

public class EventDatabase {
	private static List<Event> listEvent = new ArrayList<>();
	public static void addEvent(Event event) {
		listEvent.add(event);
	}
	public static List<Event> getListEvent(){
		return listEvent;
	}
	
}
