/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Dexter Sam
 */
public class Salary {
    

    private String ID;
    private String Name;
    private String Type;
    private String Salary;
    private String Status;
    private String bonus;

    public Salary(String ID, String Name, String Type, String Salary) {
        this.ID = ID;
        this.Name = Name;
        this.Type = Type;
        this.Salary = Salary;
     
    }

    public Salary(String ID, String Name, String Type, String Salary, String Status, String bonus) {
        this.ID = ID;
        this.Name = Name;
        this.Type = Type;
        this.Salary = Salary;
        this.Status = Status;
        this.bonus = bonus;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

 
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }
    

                                          
                                            
    
}
