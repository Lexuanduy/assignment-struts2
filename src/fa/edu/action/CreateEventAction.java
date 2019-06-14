package fa.edu.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import fa.edu.database.EventDatabase;
import fa.edu.models.Event;

public class CreateEventAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	private String plan;
	private String location;
	private String info;
	private String pickDate;
	private String pickTime;

	public String execute() throws ParseException {
		String stringDate = pickDate+" - "+pickTime;
		System.out.println(stringDate);
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd - hh:mm");
		Date time = (Date)formatter.parse(stringDate); 
		Event event = new Event(time,plan,location,info);
		EventDatabase.addEvent(event);
		msg="Create success";
		return "CREATE";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getPickDate() {
		return pickDate;
	}

	public void setPickDate(String pickDate) {
		this.pickDate = pickDate;
	}

	public String getPickTime() {
		return pickTime;
	}

	public void setPickTime(String pickTime) {
		this.pickTime = pickTime;
	}

	

	
	
	
}
