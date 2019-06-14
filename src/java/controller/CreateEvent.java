/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.Event;
/**
 *
 * @author duy
 */
public class CreateEvent extends ActionSupport{
   public static ArrayList<controller.Event> list = new ArrayList<>();
    
    public void saveEvent(controller.Event event){
        list.add(event);
    }
    
    public static List<controller.Event> getList(){
        
        return list;
    }
}
