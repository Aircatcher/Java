package epl;
import java.io.*;

public class AddUser
{
    private String uAddF;
    private String pAddF;

    public String getuAddF() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
        uAddF = br.readLine();
        while (uAddF != null)
        {
            br.readLine();
            uAddF = br.readLine();
            if (uAddF != EPLGUI.uAddGUI) { return EPLGUI.uAddGUI; }
        }
        return uAddF;
    }
    public String getpAddF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
        br.readLine();
        pAddF = br.readLine();
        while (pAddF != null)
        {
            br.readLine();
            pAddF = br.readLine();
            if (pAddF != EPLGUI.pAddGUI) { return EPLGUI.pAddGUI; }
        }
        return pAddF;
    }
    
    public void setuAddF(String uAddF) { this.uAddF = uAddF; }
    public void setpAddF(String pAddF) { this.pAddF = pAddF; }
}
