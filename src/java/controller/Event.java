/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author duy
 */
public class Event extends ActionSupport{
    private model.Event event;
    
    @Override
    public String execute() {
        setEvent(new model.Event()); // get data from model
        return SUCCESS;
    }
    
    public model.Event getEvent() {
        return event;
    }
  
    public void setEvent(model.Event event) {
        this.event = event;
    }
}
