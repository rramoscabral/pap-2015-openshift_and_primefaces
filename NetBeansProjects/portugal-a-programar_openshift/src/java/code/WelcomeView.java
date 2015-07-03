/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Ricardo Cabral
 */

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class WelcomeView {
    
    private String name;
    
    public String getName() {
        return name;
    }
 
    public void setName(String sname) {
        this.name = sname;
    }
 
    public void welcome() {
            FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Olá " + name + " bem-vindo"));
        }
}
