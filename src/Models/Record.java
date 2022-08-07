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
public class Record {
    
    String name;
    String match;
    String RunWIK;
    String Average;
    String StrikRate;
    String Highest;

    public Record(String name, String match, String RunWIK, String Average, String StrikRate, String Highest) {
        this.name = name;
        this.match = match;
        this.RunWIK = RunWIK;
        this.Average = Average;
        this.StrikRate = StrikRate;
        this.Highest = Highest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getRunWIK() {
        return RunWIK;
    }

    public void setRunWIK(String RunWIK) {
        this.RunWIK = RunWIK;
    }

    public String getAverage() {
        return Average;
    }

    public void setAverage(String Average) {
        this.Average = Average;
    }

    public String getStrikRate() {
        return StrikRate;
    }

    public void setStrikRate(String StrikRate) {
        this.StrikRate = StrikRate;
    }

    public String getHighest() {
        return Highest;
    }

    public void setHighest(String Highest) {
        this.Highest = Highest;
    }
    
    
    
}
