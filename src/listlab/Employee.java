/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

/**
 *
 * @author chris
 */
public class Employee {
    private String name;
    private String emplId;

    public Employee(String name, String emplId) {
        this.name = name;
        this.emplId = emplId;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmplId() {
        return emplId;
    }

    public void setEmplId(String emplId) {
        this.emplId = emplId;
    }
    
    
}
