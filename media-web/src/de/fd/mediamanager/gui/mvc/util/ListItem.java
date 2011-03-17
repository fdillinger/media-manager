package de.fd.mediamanager.gui.mvc.util;

public class ListItem 
{
     private String label = null;
     private String value = null;
     
     public ListItem(String label, String value)
     {
          this.label = label;
          this.value = value;
     }

    public String getLabel() 
    {
        return label;
    }

    public void setLable(String label) 
    {
        this.label = label;
    }

    public String getValue() 
    {
        return value;
    }

    public void setValue(String value) 
    {
        this.value = value;
    }

    public String toString() 
    {
       return this.getValue();
    }

}
