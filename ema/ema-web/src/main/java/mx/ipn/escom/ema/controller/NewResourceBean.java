package mx.ipn.escom.ema.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;



@ManagedBean
@SessionScoped
public class NewResourceBean implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2617813082214149080L;
    
    private String NameProject;
    private String NameResourceHTML;

    public String getNameResourceHTML() {
        return NameResourceHTML;
    }

    public void setNameResourceHTML(String nameResourceHTML) {
        NameResourceHTML = nameResourceHTML;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getNameProject() {
        return NameProject;
    }

    public void setNameProject(String nameProject) {
        NameProject = nameProject;
    } 
    
    public List<String> complete (String query){
        List<String>  values = new ArrayList<String>();
        
            values.add("Alejandra");
            values.add("elva");
        
            return values;
        
        
    }

}
