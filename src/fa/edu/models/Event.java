package fa.edu.models;

import java.util.Date;

public class Event {
	public Event() {
		super();
	}
	private Date time;
	private String plan;
	private String location;
	private String info;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
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
	public Event(Date time, String plan, String location, String info) {
		super();
		this.time = time;
		this.plan = plan;
		this.location = location;
		this.info = info;
	}
	@Override
	public String toString() {
		return "Event [time=" + time + ", plan=" + plan + ", location=" + location + ", info=" + info + "]";
	}
	
	
}
