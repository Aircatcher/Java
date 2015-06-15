package epl_nogui;

import java.util.Scanner;

public class EPL_NoGUI
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String username;
        String pw;
        int choice = 99;
        String exit = null;
        
        int homeChoice = 0;
        int homeScore = 0;
        String homeTeam = null;
        
        int awayChoice = 0;
        int awayScore = 0;
        String awayTeam = null;
        
        System.out.println("Premier League - Login");
        System.out.println("======================");
        System.out.println("Enter your username:");
        username = input.next();
        System.out.println("Enter your password:");
        pw = input.next();
        
        while ( (username != "admin" && pw != "admin") || (username != "user" && pw != "user") )
        {
            System.out.println("\n\nPremier League - Login");
            System.out.println("======================");
            System.out.println("Wrong username or password.");
            System.out.println("Enter your username:");
            username = input.next();
            System.out.println("Enter your password:");
            pw = input.next();
        }
        
        if (username == "admin" && pw == "admin")
        {
        while ( choice < 0 || choice > 4 )
        {
        System.out.println("\n\nPremier League - Main Menu");
        System.out.println("==========================");
        System.out.println("1. Match Entry");
        System.out.println("2. Recall Match");
        System.out.println("3. League Table");
        System.out.println("4. Club Details\n");
        System.out.println("5. Add a User");
        System.out.println("0. Quit");
        System.out.println("==========================\n");
        System.out.println("Enter your choice");
        choice = input.nextInt();
        }
        
        if (homeChoice == 1) {homeTeam = "Manchester United";}
        else if (homeChoice == 2) {homeTeam = "Newcastle";}
        else if (homeChoice == 3) {homeTeam = "Arsenal";}
        else if (homeChoice == 4) {homeTeam = "Liverpool";}
        else if (homeChoice == 5) {homeTeam = "Chelsea";}
        else if (homeChoice == 6) {homeTeam = "Leeds";}
        else if (homeChoice == 7) {homeTeam = "Aston Villa";}
        else if (homeChoice == 8) {homeTeam = "Tottenham";}
        else if (homeChoice == 9) {homeTeam = "Fulham"; }
        else if (homeChoice == 10) {homeTeam = "Charlton";}
        else if (homeChoice == 11) {homeTeam = "West Ham";}
        else if (homeChoice == 12) {homeTeam = "Sunderland";}
        else if (homeChoice == 13) {homeTeam = "Ipswich";}
        else if (homeChoice == 14) {homeTeam = "Middlesbrough";}
        else if (homeChoice == 15) {homeTeam = "Southampton";}
        else if (homeChoice == 16) {homeTeam = "Everton";}
        else if (homeChoice == 17) {homeTeam = "Bolton";}
        else if (homeChoice == 18) {homeTeam = "Blackburn";}
        else if (homeChoice == 19) {homeTeam = "Derby";}
        else                       {homeTeam = "Leicester";}
                
        if (awayChoice == 1) {awayTeam = "Manchester United";}
        else if (awayChoice == 2) {awayTeam = "Newcastle";}
        else if (awayChoice == 3) {awayTeam = "Arsenal";}
        else if (awayChoice == 4) {awayTeam = "Liverpool";}
        else if (awayChoice == 5) {awayTeam = "Chelsea";}
        else if (awayChoice == 6) {awayTeam = "Leeds";}
        else if (awayChoice == 7) {awayTeam = "Aston Villa";}
        else if (awayChoice == 8) {awayTeam = "Tottenham";}
        else if (awayChoice == 9) {awayTeam = "Fulham";}
        else if (awayChoice == 10) {awayTeam = "Charlton";}
        else if (awayChoice == 11) {awayTeam = "West Ham";}
        else if (awayChoice == 12) {awayTeam = "Sunderland";}
        else if (awayChoice == 13) {awayTeam = "Ipswich";}
        else if (awayChoice == 14) {awayTeam = "Middlesbrough";}
        else if (awayChoice == 15) {awayTeam = "Southampton";}
        else if (awayChoice == 16) {awayTeam = "Everton";}
        else if (awayChoice == 17) {awayTeam = "Bolton";}
        else if (awayChoice == 18) {awayTeam = "Blackburn";}
        else if (awayChoice == 19) {awayTeam = "Derby";}
        else                       {awayTeam = "Leicester";}
                
        switch(choice)
        {
            case 1:
                System.out.println("\n\nPremier League - Match Entry");
                System.out.println("================================");
                System.out.println("Choose Home Team....");
                System.out.println("1. Manchester United | " + "2. Newcastle | " +
                                   "3. Arsenal | " + "4. Liverpool\n" +
                                   "5. Chelsea | " + "6. Leeds | " +
                                   "7. Aston Villa | " + "8. Tottenham\n" +
                                   "9. Fulham | " + "10. Charlton | " +
                                   "11. West Ham | " + "12. Sunderland\n" +
                                   "13. Ipswich | " + "14. Middlesbrough | " +
                                   "15. Southampton | " + "16. Everton\n" +
                                   "17. Bolton | " + "18. Blackburn | " +
                                   "19. Derby | " + "20. Leicester\n" );
                homeChoice = input.nextInt();
                System.out.println("Enter Home Team Score");
                homeScore = input.nextInt();
                
                System.out.println("Choose Away Team....");
                System.out.println("1. Manchester United | " + "2. Newcastle | " +
                                   "3. Arsenal | " + "4. Liverpool\n" +
                                   "5. Chelsea | " + "6. Leeds | " +
                                   "7. Aston Villa | " + "8. Tottenham\n" +
                                   "9. Fulham | " + "10. Charlton | " +
                                   "11. West Ham | " + "12. Sunderland\n" +
                                   "13. Ipswich | " + "14. Middlesbrough | " +
                                   "15. Southampton | " + "16. Everton\n" +
                                   "17. Bolton | " + "18. Blackburn | " +
                                   "19. Derby | " + "20. Leicester\n" );
                awayChoice = input.nextInt();
                System.out.println("Enter Away Team Score");
                awayScore = input.nextInt();
                
                while ( homeChoice == awayChoice )
                {
                    System.out.println("\n\nPremier League - Match Entry");
                    System.out.println("================================");
                    System.out.println("Sorry but 'Home Team' and 'Away Team' can't be the same.");
                    System.out.println("Choose Home Team....");
                    System.out.println("1. Manchester United | " + "2. Newcastle | " +
                                       "3. Arsenal | " + "4. Liverpool\n" +
                                       "5. Chelsea | " + "6. Leeds | " +
                                       "7. Aston Villa | " + "8. Tottenham\n" +
                                       "9. Fulham | " + "10. Charlton | " +
                                       "11. West Ham | " + "12. Sunderland\n" +
                                       "13. Ipswich | " + "14. Middlesbrough | " +
                                       "15. Southampton | " + "16. Everton\n" +
                                       "17. Bolton | " + "18. Blackburn | " +
                                       "19. Derby | " + "20. Leicester\n" );
                    homeChoice = input.nextInt();
                    System.out.println("Enter Home Team Score");
                    homeScore = input.nextInt();
                    
                    System.out.println("Choose Away Team....");
                    System.out.println("1. Manchester United | " + "2. Newcastle | " +
                                       "3. Arsenal | " + "4. Liverpool\n" +
                                       "5. Chelsea | " + "6. Leeds | " +
                                       "7. Aston Villa | " + "8. Tottenham\n" +
                                       "9. Fulham | " + "10. Charlton | " +
                                       "11. West Ham | " + "12. Sunderland\n" +
                                       "13. Ipswich | " + "14. Middlesbrough | " +
                                       "15. Southampton | " + "16. Everton\n" +
                                       "17. Bolton | " + "18. Blackburn | " +
                                       "19. Derby | " + "20. Leicester\n" );
                    awayChoice = input.nextInt();
                    System.out.println("Enter Away Team Score");
                    awayScore = input.nextInt();
                }
                
                System.out.println(homeTeam + ": " + homeScore);
                System.out.println(awayTeam + ": " + awayScore);
                break;
                
            case 2:
                System.out.println("\n\nPremier League - Recall a Match");
                System.out.println("================================");
                System.out.println("Choose Home Team....");
                System.out.println("1. Manchester United | " + "2. Newcastle | " +
                                   "3. Arsenal | " + "4. Liverpool\n" +
                                   "5. Chelsea | " + "6. Leeds | " +
                                   "7. Aston Villa | " + "8. Tottenham\n" +
                                   "9. Fulham | " + "10. Charlton | " +
                                   "11. West Ham | " + "12. Sunderland\n" +
                                   "13. Ipswich | " + "14. Middlesbrough | " +
                                   "15. Southampton | " + "16. Everton\n" +
                                   "17. Bolton | " + "18. Blackburn | " +
                                   "19. Derby | " + "20. Leicester\n" );
                homeChoice = input.nextInt();
                
                System.out.println("Choose Away Team....");
                System.out.println("1. Manchester United | " + "2. Newcastle | " +
                                   "3. Arsenal | " + "4. Liverpool\n" +
                                   "5. Chelsea | " + "6. Leeds | " +
                                   "7. Aston Villa | " + "8. Tottenham\n" +
                                   "9. Fulham | " + "10. Charlton | " +
                                   "11. West Ham | " + "12. Sunderland\n" +
                                   "13. Ipswich | " + "14. Middlesbrough | " +
                                   "15. Southampton | " + "16. Everton\n" +
                                   "17. Bolton | " + "18. Blackburn | " +
                                   "19. Derby | " + "20. Leicester\n" );
                awayChoice = input.nextInt();
                
                System.out.println(homeTeam + ": " + homeScore);
                System.out.println(awayTeam + ": " + awayScore);
                break;
                
            case 3:
                System.out.println("\n\nPremier League - League Table");
                break;
                
            case 4:
                System.out.println("\n\nPremier League - Club Details");
                break;
                
            case 0:
                System.exit(0);
                break;
        }
        }
        
        if (username == "user" && pw == "user")
        {
            while ( choice < 0 || choice > 4 )
            {
                System.out.println("\n\nPremier League - Main Menu");
                System.out.println("==========================");
                System.out.println("1. Recall Match");
                System.out.println("2. League Table");
                System.out.println("3. Club Details\n");
                System.out.println("0. Quit");
                System.out.println("==========================\n");
                System.out.println("Enter your choice");
                choice = input.nextInt();
            }
        }
    }
}
