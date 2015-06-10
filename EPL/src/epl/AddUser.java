package epl;
import java.io.*;

public class AddUser
{
    private String uAddF;
    private String pAddF;

    public String getuAddF() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
        br.readLine();
        while (br != null) { br.readLine(); }
        uAddF = EPLGUI.uAddGUI;
        return uAddF;
    }
    public String getpAddF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
        br.readLine();
        br.readLine();
        while (br != null)
        {
            br.readLine();
            br.readLine();
        }
        pAddF = EPLGUI.pAddGUI;
        return pAddF;
    }
    
    public void setuAddF(String uAddF) { this.uAddF = uAddF; }
    public void setpAddF(String pAddF) { this.pAddF = pAddF; }
}
