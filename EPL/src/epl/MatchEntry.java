package epl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MatchEntry
{
    private String homeTeamEntryF;
    private String awayTeamEntryF;
    private String homeTeamScoreEntryF;
    private String awayTeamScoreEntryF;

    MatchEntry() {}
    
    //GETTER AND SETTER
    public String getHomeTeamEntryF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("MatchEntry.txt"));
        homeTeamEntryF = br.readLine();
        while (homeTeamEntryF != EPLGUI.htEntryGUI)
        {
            br.readLine();
            br.readLine();
            br.readLine(); // Skips one text line in the txt file after the loop
            homeTeamEntryF = br.readLine(); //Read the line and assign as "homeTeamEntryF" string
            if (homeTeamEntryF != EPLGUI.htEntryGUI) { return EPLGUI.htEntryGUI; }
        }
        return EPLGUI.htEntryGUI;
    }
    public String getAwayTeamEntryF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("MatchEntry.txt"));
        br.readLine();
        br.readLine();
        awayTeamEntryF = br.readLine();
        while (awayTeamEntryF != EPLGUI.atEntryGUI)
        {
            br.readLine();
            br.readLine();
            br.readLine(); // Skips three text lines in the txt file after the loop
            awayTeamEntryF = br.readLine(); //Read the line and assign as "awayTeamEntryF" string
            if (awayTeamEntryF != EPLGUI.atEntryGUI) { return EPLGUI.atEntryGUI; }
        }
        return EPLGUI.atEntryGUI;
    }
    public String getHomeTeamScoreEntryF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("MatchEntry.txt"));
        br.readLine();
        homeTeamScoreEntryF = br.readLine();
        while (homeTeamScoreEntryF != EPLGUI.htScoreEntryGUI)
        {
            br.readLine();
            br.readLine();
            br.readLine(); // Skips three text lines in the txt file after the loop
            homeTeamScoreEntryF = br.readLine(); //Read the line and assign as "homeTeamScoreEntryF" string
            if (homeTeamScoreEntryF != EPLGUI.htScoreEntryGUI) { return EPLGUI.htScoreEntryGUI; }
        }
        return EPLGUI.htScoreEntryGUI;
    }
    public String getAwayTeamScoreEntryF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("MatchEntry.txt"));
        br.readLine();
        br.readLine();
        br.readLine();
        awayTeamScoreEntryF = br.readLine();
        while (awayTeamScoreEntryF != EPLGUI.atScoreEntryGUI)
        {
            br.readLine();
            br.readLine();
            br.readLine(); // Skips one text line in the txt file after the loop
            awayTeamScoreEntryF = br.readLine(); //Read the line and assign as "awayTeamScoreEntryF" string
            if (awayTeamScoreEntryF != EPLGUI.atScoreEntryGUI) { return EPLGUI.atScoreEntryGUI; }
        }
        return EPLGUI.atScoreEntryGUI;
    }

    public void setHomeTeamEntryF(String homeTeamEntryF) { this.homeTeamEntryF = homeTeamEntryF; }
    public void setAwayTeamEntryF(String awayTeamEntryF) { this.awayTeamEntryF = awayTeamEntryF; }
    public void setHomeTeamScoreEntryF(String homeTeamScoreEntryF) { this.homeTeamScoreEntryF = homeTeamScoreEntryF; }
    public void setAwayTeamScoreEntryF(String awayTeamScoreEntryF) { this.awayTeamScoreEntryF = awayTeamScoreEntryF; }
}
