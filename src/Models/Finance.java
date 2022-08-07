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
public class Finance {
    
    private String DateDb;
    private String DescriptionDb;
    private String AmountDb;
    private String MethodDb;
    private String StatusDb;

    public Finance(String DateDb, String DescriptionDb, String AmountDb, String MethodDb, String StatusDb) {
        this.DateDb = DateDb;
        this.DescriptionDb = DescriptionDb;
        this.AmountDb = AmountDb;
        this.MethodDb = MethodDb;
        this.StatusDb = StatusDb;
    }

    public String getDateDb() {
        return DateDb;
    }

    public void setDateDb(String DateDb) {
        this.DateDb = DateDb;
    }

    public String getDescriptionDb() {
        return DescriptionDb;
    }

    public void setDescriptionDb(String DescriptionDb) {
        this.DescriptionDb = DescriptionDb;
    }

    public String getAmountDb() {
        return AmountDb;
    }

    public void setAmountDb(String AmountDb) {
        this.AmountDb = AmountDb;
    }

    public String getMethodDb() {
        return MethodDb;
    }

    public void setMethodDb(String MethodDb) {
        this.MethodDb = MethodDb;
    }

    public String getStatusDb() {
        return StatusDb;
    }

    public void setStatusDb(String StatusDb) {
        this.StatusDb = StatusDb;
    }
    
    
    
    
}
