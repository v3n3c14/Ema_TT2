package mx.ipn.escom.ema.to;

import java.io.Serializable;
import java.util.Date;

public class ProjectsTO implements Serializable {
    
    private String name;
    private Date date;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

}
