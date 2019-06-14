/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import com.opensymphony.xwork2.ActionSupport;
import model.Event;
/**
 *
 * @author duy
 */
public class CreateEvent extends ActionSupport{
    private Event event;
    
    @Override
    public String execute() {
        setEvent(new Event()); // get data from model
        return SUCCESS;
    }
    
    public Event getEvent() {
        return event;
    }
  
    public void setEvent(Event event) {
        this.event = event;
    }
}
