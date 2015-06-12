package epl;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginRobot
{
    String userF = null;
    private String passF = null;
    private String br;
    
    LoginRobot() {}
    
    //GETTER AND SETTER
    public String getUserF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
        userF = br.readLine();
        while (userF != EPLGUI.uGUI) //Keep looping if string "userF" does not equal to string "uGUI"
        {
            br.readLine(); // Skips two text lines in the txt file after the loop
            br.readLine();
            userF = br.readLine(); //Read the line and assign as "userF" string
            if (userF != EPLGUI.uGUI) { return EPLGUI.uGUI; }
        }
        return EPLGUI.uGUI;
    }
    public String getPassF() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
        br.readLine();
        passF = br.readLine();
        while (passF != EPLGUI.pGUI) //Keep looping if string "passF" does not equal to string "pGUI"
        {
            br.readLine(); // Skips one line in the txt file after the loop
            passF = br.readLine(); //Read the line and assign as "passF" string
            if (passF != EPLGUI.pGUI) { return EPLGUI.pGUI; }
        }
        return EPLGUI.pGUI;
    }

    public void setUserF(String userF) { this.userF = userF; }
    public void setPassF(String passF) { this.passF = passF; }
    
    public void br() throws IOException
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
            String userF = br.readLine();
            String passF = br.readLine();
        }
        catch (FileNotFoundException ex) { Logger.getLogger(EPLGUI.class.getName()).log(Level.SEVERE, null, ex); }
    }
}
