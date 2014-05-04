/**
package mx.ipn.escom.ema.controller;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.*;

import mx.ipn.escom.ema.servlet;

@ManagedBean
@RequestScoped

public class LoginBean {
    
    
    public void callServletIngreso(){
        
        String url= "ServletLogin";
        FacesContex contex = FacesContext.getCurrentInstance();
        try {
            context.getExternalContext().dispatch(url);
        }catch(Exception e){
            e.printStrackTrace();
        }finally{
            context.responseComplete();
        }
    }
    
}
*/