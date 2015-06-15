package epl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DeleteUser
{
    private String uDelF;
    private String pDelF;

    public String getuDelF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
        uDelF = br.readLine();
        while (uDelF != null)
        {
            
            br.readLine();
            uDelF = br.readLine();
        }
        return EPLGUI.uDelGUI;
    }
    public String getpDelF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
        pDelF = br.readLine();
        while (pDelF != null)
        {
            br.readLine();
            pDelF = br.readLine();
            if (pDelF != EPLGUI.pDelGUI) { return EPLGUI.pDelGUI; }
        }
        return EPLGUI.pDelGUI;
    }

    public void setuDelF(String uDelF) { this.uDelF = uDelF; }
    public void setpDelF(String pDelF) { this.pDelF = pDelF; }
}
