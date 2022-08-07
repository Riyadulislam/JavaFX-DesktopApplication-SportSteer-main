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
public class Perfomance {
    
    String matchType;
    String playerName;
    String playertype;
    String runsScored;
    String ballsFaced;
    String fours;
    String sixes;
    String wicketsTaken;
    String ballsBowled;
    String runsGave;

    public Perfomance(String playerName,String matchType, String playertype, String runsScored, String ballsFaced, String fours, String sixes, String wicketsTaken, String ballsBowled, String runsGave) {
        this.matchType = matchType;
        this.playerName = playerName;
        this.playertype = playertype;
        this.runsScored = runsScored;
        this.ballsFaced = ballsFaced;
        this.fours = fours;
        this.sixes = sixes;
        this.wicketsTaken = wicketsTaken;
        this.ballsBowled = ballsBowled;
        this.runsGave = runsGave;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayertype() {
        return playertype;
    }

    public void setPlayertype(String playertype) {
        this.playertype = playertype;
    }

    public String getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(String runsScored) {
        this.runsScored = runsScored;
    }

    public String getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(String ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    public String getFours() {
        return fours;
    }

    public void setFours(String fours) {
        this.fours = fours;
    }

    public String getSixes() {
        return sixes;
    }

    public void setSixes(String sixes) {
        this.sixes = sixes;
    }

    public String getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(String wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public String getBallsBowled() {
        return ballsBowled;
    }

    public void setBallsBowled(String ballsBowled) {
        this.ballsBowled = ballsBowled;
    }

    public String getRunsGave() {
        return runsGave;
    }

    public void setRunsGave(String runsGave) {
        this.runsGave = runsGave;
    }
    
    
}
