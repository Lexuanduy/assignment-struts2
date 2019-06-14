package fa.edu.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import fa.edu.database.EventDatabase;
import fa.edu.models.Event;

public class ListEventAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<Event> eventList = new ArrayList<>();
	
	public String execute() {
		eventList = EventDatabase.getListEvent();
		return "LIST";
	}

	public List<Event> getEventList() {
		return eventList;
	}

	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}
	
	
	
}
