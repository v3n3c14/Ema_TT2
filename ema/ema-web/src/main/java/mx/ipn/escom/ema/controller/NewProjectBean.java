package mx.ipn.escom.ema.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;


@ManagedBean
@SessionScoped

public class NewProjectBean implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8300483268320228358L;
    
    public boolean incluirCSS;
    private String nameProject;

   
    public boolean isIncluirCSS () {
        
        return incluirCSS;
        
    }
    
    public void SetIncluirCSS(boolean incluirCSS){
        this.incluirCSS = incluirCSS;
    }
    
    
    public String getNombreProyecto() {
        return nameProject;
    }

    public void setNombreProyecto(String nameProject) {
        this.nameProject = nameProject;
    }  
    
}
