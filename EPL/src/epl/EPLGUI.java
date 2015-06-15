package epl;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.PopupMenu;
import java.io.*;
import java.net.URL;
import javax.swing.*;

public class EPLGUI extends javax.swing.JFrame {
    static String uGUI; //Strings for checking username & password
    static String pGUI;
    static String uAddGUI; //Strings for adding a user
    static String pAddGUI;
    static String userDBGet; //String for user database in "Delete User"
    static String userDBSet;
    static String uDelGUI;
    static String pDelGUI;
    static String htRecallGUI; //Strings for a Match Recall on Admin (Teams & Scores)
    static String atRecallGUI;
    static String htScoreRecallGUI;
    static String atScoreRecallGUI;
    static String htRecallUserGUI; //Strings for a Match Recall on User (Teams & Scores)
    static String atRecallUserGUI;
    static String htScoreRecallUserGUI;
    static String atScoreRecallUserGUI;
    static String htEntryGUI; //Strings for a Match Entry on Admin (Teams & Scores)
    static String atEntryGUI;
    static String htScoreEntryGUI;
    static String atScoreEntryGUI;
    
    public EPLGUI() throws IOException
    {
        initComponents();
        setResizable(false);  //Frame will be unable to be resized
        setTitle("EPL - Login");
        setSize(257, 158);
        setLocationRelativeTo(null); //Center the JFrame

        //Just some initialization with the frame objects
        statusText.setEditable(false);
        statusTextRecall.setEditable(false);
        userDatabase.setEditable(false);
        groundText.setEditable(false);      groundText_User.setEditable(false);
        emblemIMG.setIcon(null);            emblemIMG_User.setIcon(null);
        clubNickname.setText(null);         clubNickname_User.setText(null);
        clubFounded.setText(null);          clubFounded_User.setText(null);
        clubStdCapacity.setText(null);      clubStdCapacity_User.setText(null);  
        clubManager.setText(null);          clubManager_User.setText(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginForm = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        notifText = new javax.swing.JLabel();
        loginConfirm = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();
        MainMenuAdmin = new javax.swing.JPanel();
        matchEntry = new javax.swing.JButton();
        matchRecall = new javax.swing.JButton();
        pointTable = new javax.swing.JButton();
        clubDetails = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        exitButtonMainMenu = new javax.swing.JButton();
        signoutButton = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        MatchEntry = new javax.swing.JPanel();
        statusText = new javax.swing.JTextField();
        homeTeamPanelEntry = new javax.swing.JPanel();
        homeTeam_Entry = new javax.swing.JComboBox();
        homeTeam = new javax.swing.JLabel();
        homeTeamScore_Entry = new javax.swing.JComboBox();
        homeTeamScore = new javax.swing.JLabel();
        exitButtonmatchEntry = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        matchEntryConfirm = new javax.swing.JButton();
        backToMenu_Entry = new javax.swing.JButton();
        awayTeamPanelEntry = new javax.swing.JPanel();
        awayTeam = new javax.swing.JLabel();
        awayTeam_Entry = new javax.swing.JComboBox();
        awayTeamScore = new javax.swing.JLabel();
        awayTeamScore_Entry = new javax.swing.JComboBox();
        MatchRecall = new javax.swing.JPanel();
        homeTeamPanel1 = new javax.swing.JPanel();
        homeTeam_Recall = new javax.swing.JComboBox();
        homeTeam1 = new javax.swing.JLabel();
        homeTeamScore1 = new javax.swing.JLabel();
        homeTeamScore_Recall = new javax.swing.JComboBox();
        recallMatchConfirm = new javax.swing.JButton();
        statusTextRecall = new javax.swing.JTextField();
        awayTeamPanel1 = new javax.swing.JPanel();
        awayTeam1 = new javax.swing.JLabel();
        awayTeam_Recall = new javax.swing.JComboBox();
        awayTeamScore1 = new javax.swing.JLabel();
        awayTeamScore_Recall = new javax.swing.JComboBox();
        recallStatus = new javax.swing.JLabel();
        exitButtonRecall = new javax.swing.JButton();
        backToMenu_Recall = new javax.swing.JButton();
        PointTable = new javax.swing.JPanel();
        exitButtonPoint = new javax.swing.JButton();
        backToMenu_Point = new javax.swing.JButton();
        ptsText = new javax.swing.JLabel();
        ptsText1 = new javax.swing.JLabel();
        ptsText2 = new javax.swing.JLabel();
        ptsText3 = new javax.swing.JLabel();
        ptsText4 = new javax.swing.JLabel();
        ptsText5 = new javax.swing.JLabel();
        ptsText6 = new javax.swing.JLabel();
        ptsText7 = new javax.swing.JLabel();
        ptsText8 = new javax.swing.JLabel();
        ptsText9 = new javax.swing.JLabel();
        ptsText10 = new javax.swing.JLabel();
        ptsText11 = new javax.swing.JLabel();
        ptsText12 = new javax.swing.JLabel();
        ptsText13 = new javax.swing.JLabel();
        ptsText14 = new javax.swing.JLabel();
        ptsText15 = new javax.swing.JLabel();
        ptsText16 = new javax.swing.JLabel();
        ptsText17 = new javax.swing.JLabel();
        ptsText18 = new javax.swing.JLabel();
        ptsText19 = new javax.swing.JLabel();
        ptsText20 = new javax.swing.JLabel();
        ptsText21 = new javax.swing.JLabel();
        ClubDetails = new javax.swing.JPanel();
        clubNameMenu = new javax.swing.JComboBox();
        backToMenu_Club = new javax.swing.JButton();
        exitButtonClub = new javax.swing.JButton();
        groundText = new javax.swing.JTextField();
        clubName = new javax.swing.JLabel();
        ground = new javax.swing.JLabel();
        clubEmblem = new javax.swing.JLabel();
        emblemIMG = new javax.swing.JLabel();
        details = new javax.swing.JLabel();
        clubNickname = new javax.swing.JLabel();
        clubFounded = new javax.swing.JLabel();
        clubStdCapacity = new javax.swing.JLabel();
        clubManager = new javax.swing.JLabel();
        founded = new javax.swing.JLabel();
        stdCapacity = new javax.swing.JLabel();
        manager = new javax.swing.JLabel();
        nickname = new javax.swing.JLabel();
        AddUser = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        addConfirm = new javax.swing.JButton();
        fieldPanel = new javax.swing.JPanel();
        username1 = new javax.swing.JLabel();
        usernameAdd = new javax.swing.JTextField();
        passwordAdd = new javax.swing.JTextField();
        password1 = new javax.swing.JLabel();
        DeleteUser = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userDatabase = new javax.swing.JTextArea();
        exitButton_delUser = new javax.swing.JButton();
        backToMenu_delUser = new javax.swing.JButton();
        deleteUserConfirm = new javax.swing.JButton();
        MainMenuUser = new javax.swing.JPanel();
        matchRecallUser = new javax.swing.JButton();
        pointTableUser = new javax.swing.JButton();
        clubDetailsUser = new javax.swing.JButton();
        exitButtonUser = new javax.swing.JButton();
        signoutButtonUser = new javax.swing.JButton();
        MatchRecallUser = new javax.swing.JPanel();
        homeTeamPanel_MR_User = new javax.swing.JPanel();
        homeTeamRecall_User = new javax.swing.JComboBox();
        homeTeam_User = new javax.swing.JLabel();
        homeTeamScore_User = new javax.swing.JLabel();
        homeTeamScoreRecall_User = new javax.swing.JComboBox();
        recallMatchConfirm_User = new javax.swing.JButton();
        statusTextRecall_User = new javax.swing.JTextField();
        awayTeamPanel_MR_User = new javax.swing.JPanel();
        awayTeam_User = new javax.swing.JLabel();
        awayTeamRecall_User = new javax.swing.JComboBox();
        awayTeamScore_User = new javax.swing.JLabel();
        awayTeamScoreRecall_User = new javax.swing.JComboBox();
        status_User = new javax.swing.JLabel();
        exitButtonRecall_User = new javax.swing.JButton();
        backToMenu_MR_User = new javax.swing.JButton();
        PointTableUser = new javax.swing.JPanel();
        exitButtonPointUser = new javax.swing.JButton();
        backToMenu_PointUser = new javax.swing.JButton();
        ptsText2_User = new javax.swing.JLabel();
        ptsText3_User = new javax.swing.JLabel();
        ptsText4_User = new javax.swing.JLabel();
        ptsText5_User = new javax.swing.JLabel();
        ptsText6_User = new javax.swing.JLabel();
        ptsText7_User = new javax.swing.JLabel();
        ptsText8_User = new javax.swing.JLabel();
        ptsText9_User = new javax.swing.JLabel();
        ptsText10_User = new javax.swing.JLabel();
        ptsText_User = new javax.swing.JLabel();
        ptsText11_User = new javax.swing.JLabel();
        ptsText1_User = new javax.swing.JLabel();
        ptsText12_User = new javax.swing.JLabel();
        ptsText13_User = new javax.swing.JLabel();
        ptsText14_User = new javax.swing.JLabel();
        ptsText15_User = new javax.swing.JLabel();
        ptsText16_User = new javax.swing.JLabel();
        ptsText17_User = new javax.swing.JLabel();
        ptsText18_User = new javax.swing.JLabel();
        ptsText19_User = new javax.swing.JLabel();
        ptsText20_User = new javax.swing.JLabel();
        ptsText21_User = new javax.swing.JLabel();
        ClubDetailsUser = new javax.swing.JPanel();
        backToMenu_ClubUser = new javax.swing.JButton();
        exitButtonClubUser = new javax.swing.JButton();
        clubNickname_User = new javax.swing.JLabel();
        clubFounded_User = new javax.swing.JLabel();
        clubNameMenu_User = new javax.swing.JComboBox();
        clubStdCapacity_User = new javax.swing.JLabel();
        clubManager_User = new javax.swing.JLabel();
        founded1 = new javax.swing.JLabel();
        groundText_User = new javax.swing.JTextField();
        stdCapacity1 = new javax.swing.JLabel();
        clubName2 = new javax.swing.JLabel();
        manager1 = new javax.swing.JLabel();
        ground2 = new javax.swing.JLabel();
        nickname1 = new javax.swing.JLabel();
        clubEmblem2 = new javax.swing.JLabel();
        details1 = new javax.swing.JLabel();
        emblemIMG_User = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        LoginForm.setPreferredSize(new java.awt.Dimension(464, 404));
        LoginForm.setLayout(null);
        LoginForm.add(usernameField);
        usernameField.setBounds(66, 11, 171, 20);

        username.setText("Username:");
        LoginForm.add(username);
        username.setBounds(10, 14, 52, 14);

        password.setText("Password:");
        password.setMaximumSize(new java.awt.Dimension(54, 15));
        password.setMinimumSize(new java.awt.Dimension(54, 15));
        LoginForm.add(password);
        password.setBounds(10, 45, 50, 14);
        LoginForm.add(notifText);
        notifText.setBounds(10, 68, 227, 16);

        loginConfirm.setText("Login");
        loginConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginConfirmActionPerformed(evt);
            }
        });
        LoginForm.add(loginConfirm);
        loginConfirm.setBounds(123, 96, 57, 23);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        LoginForm.add(exitButton);
        exitButton.setBounds(186, 96, 51, 23);

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        LoginForm.add(passwordField);
        passwordField.setBounds(66, 42, 171, 20);

        getContentPane().add(LoginForm, "card2");

        MainMenuAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder("Football"));
        MainMenuAdmin.setToolTipText("");
        MainMenuAdmin.setPreferredSize(new java.awt.Dimension(464, 404));

        matchEntry.setText("Match Entry");
        matchEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchEntryActionPerformed(evt);
            }
        });

        matchRecall.setText("Recall Match");
        matchRecall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchRecallActionPerformed(evt);
            }
        });

        pointTable.setText("Point Table");
        pointTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointTableActionPerformed(evt);
            }
        });

        clubDetails.setText("Club Details");
        clubDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubDetailsActionPerformed(evt);
            }
        });

        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        exitButtonMainMenu.setText("Exit");
        exitButtonMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonMainMenuActionPerformed(evt);
            }
        });

        signoutButton.setText("Sign Out");
        signoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonActionPerformed(evt);
            }
        });

        deleteUser.setText("Delete User");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuAdminLayout = new javax.swing.GroupLayout(MainMenuAdmin);
        MainMenuAdmin.setLayout(MainMenuAdminLayout);
        MainMenuAdminLayout.setHorizontalGroup(
            MainMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matchEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matchRecall)
                    .addComponent(deleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pointTable, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(signoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButtonMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        MainMenuAdminLayout.setVerticalGroup(
            MainMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matchEntry)
                    .addComponent(matchRecall)
                    .addComponent(pointTable)
                    .addComponent(clubDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUser)
                    .addComponent(signoutButton)
                    .addComponent(exitButtonMainMenu)
                    .addComponent(deleteUser))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        getContentPane().add(MainMenuAdmin, "card2");

        MatchEntry.setPreferredSize(new java.awt.Dimension(464, 404));

        statusText.setText("Enter match details");

        homeTeamPanelEntry.setBorder(javax.swing.BorderFactory.createTitledBorder("Home Team"));

        homeTeam_Entry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manchester_United", "Newcastle", "Arsenal", "Liverpool", "Chelsea", "Leeds", "Aston_Villa", "Tottenham", "Fulham", "Charlton", "West Ham", "Sunderland", "Ipswich", "Middlesbrough", "Southampton", "Everton", "Bolton", "Blackburn", "Derby", "Leicester" }));
        homeTeam_Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeTeam_EntryActionPerformed(evt);
            }
        });

        homeTeam.setText("Team Name");

        homeTeamScore_Entry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        homeTeamScore.setText("Home Team Score");

        javax.swing.GroupLayout homeTeamPanelEntryLayout = new javax.swing.GroupLayout(homeTeamPanelEntry);
        homeTeamPanelEntry.setLayout(homeTeamPanelEntryLayout);
        homeTeamPanelEntryLayout.setHorizontalGroup(
            homeTeamPanelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTeamPanelEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeTeamPanelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeTeam_Entry, 0, 174, Short.MAX_VALUE)
                    .addGroup(homeTeamPanelEntryLayout.createSequentialGroup()
                        .addGroup(homeTeamPanelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeTeam)
                            .addComponent(homeTeamScore))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(homeTeamScore_Entry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        homeTeamPanelEntryLayout.setVerticalGroup(
            homeTeamPanelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTeamPanelEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeTeam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeTeam_Entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeTeamScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeTeamScore_Entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        exitButtonmatchEntry.setText("Exit");
        exitButtonmatchEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonmatchEntryActionPerformed(evt);
            }
        });

        status.setText("Status:");

        matchEntryConfirm.setText("Enter a match");
        matchEntryConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchEntryConfirmActionPerformed(evt);
            }
        });

        backToMenu_Entry.setText("Back to Menu");
        backToMenu_Entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_EntryActionPerformed(evt);
            }
        });

        awayTeamPanelEntry.setBorder(javax.swing.BorderFactory.createTitledBorder("Away Team"));

        awayTeam.setText("Away Team");

        awayTeam_Entry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manchester_United", "Newcastle", "Arsenal", "Liverpool", "Chelsea", "Leeds", "Aston_Villa", "Tottenham", "Fulham", "Charlton", "West Ham", "Sunderland", "Ipswich", "Middlesbrough", "Southampton", "Everton", "Bolton", "Blackburn", "Derby", "Leicester" }));

        awayTeamScore.setText("Away Team Score");

        awayTeamScore_Entry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        javax.swing.GroupLayout awayTeamPanelEntryLayout = new javax.swing.GroupLayout(awayTeamPanelEntry);
        awayTeamPanelEntry.setLayout(awayTeamPanelEntryLayout);
        awayTeamPanelEntryLayout.setHorizontalGroup(
            awayTeamPanelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awayTeamPanelEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(awayTeamPanelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(awayTeam_Entry, 0, 186, Short.MAX_VALUE)
                    .addGroup(awayTeamPanelEntryLayout.createSequentialGroup()
                        .addGroup(awayTeamPanelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(awayTeamScore)
                            .addComponent(awayTeam))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(awayTeamScore_Entry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        awayTeamPanelEntryLayout.setVerticalGroup(
            awayTeamPanelEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, awayTeamPanelEntryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(awayTeam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(awayTeam_Entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(awayTeamScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(awayTeamScore_Entry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MatchEntryLayout = new javax.swing.GroupLayout(MatchEntry);
        MatchEntry.setLayout(MatchEntryLayout);
        MatchEntryLayout.setHorizontalGroup(
            MatchEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatchEntryLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(matchEntryConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MatchEntryLayout.createSequentialGroup()
                .addGroup(MatchEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatchEntryLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(MatchEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MatchEntryLayout.createSequentialGroup()
                                .addComponent(status)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusText))
                            .addGroup(MatchEntryLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(homeTeamPanelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(awayTeamPanelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatchEntryLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backToMenu_Entry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButtonmatchEntry)))
                .addContainerGap())
        );
        MatchEntryLayout.setVerticalGroup(
            MatchEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatchEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MatchEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeTeamPanelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(awayTeamPanelEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matchEntryConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatchEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status)
                    .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(MatchEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMenu_Entry)
                    .addComponent(exitButtonmatchEntry))
                .addContainerGap())
        );

        getContentPane().add(MatchEntry, "card4");

        MatchRecall.setPreferredSize(new java.awt.Dimension(464, 404));

        homeTeamPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Home Team"));

        homeTeam_Recall.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manchester United", "Newcastle", "Arsenal", "Liverpool", "Chelsea", "Leeds", "Aston Villa", "Tottenham", "Fulham", "Charlton", "West Ham", "Sunderland", "Ipswich", "Middlesbrough", "Southampton", "Everton", "Bolton", "Blackburn", "Derby", "Leicester" }));
        homeTeam_Recall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeTeam_RecallActionPerformed(evt);
            }
        });

        homeTeam1.setText("Team Name");

        homeTeamScore1.setText("Home Team Score");

        homeTeamScore_Recall.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        javax.swing.GroupLayout homeTeamPanel1Layout = new javax.swing.GroupLayout(homeTeamPanel1);
        homeTeamPanel1.setLayout(homeTeamPanel1Layout);
        homeTeamPanel1Layout.setHorizontalGroup(
            homeTeamPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTeamPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeTeamPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeTeam_Recall, 0, 178, Short.MAX_VALUE)
                    .addGroup(homeTeamPanel1Layout.createSequentialGroup()
                        .addGroup(homeTeamPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeTeam1)
                            .addComponent(homeTeamScore1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(homeTeamScore_Recall, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        homeTeamPanel1Layout.setVerticalGroup(
            homeTeamPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTeamPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeTeam1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeTeam_Recall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(homeTeamScore1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeTeamScore_Recall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        recallMatchConfirm.setText("Recall Match");
        recallMatchConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recallMatchConfirmActionPerformed(evt);
            }
        });

        statusTextRecall.setText("Enter match details");

        awayTeamPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Away Team"));

        awayTeam1.setText("Away Team");

        awayTeam_Recall.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manchester United", "Newcastle", "Arsenal", "Liverpool", "Chelsea", "Leeds", "Aston Villa", "Tottenham", "Fulham", "Charlton", "West Ham", "Sunderland", "Ipswich", "Middlesbrough", "Southampton", "Everton", "Bolton", "Blackburn", "Derby", "Leicester" }));

        awayTeamScore1.setText("Away Team Score");

        awayTeamScore_Recall.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        javax.swing.GroupLayout awayTeamPanel1Layout = new javax.swing.GroupLayout(awayTeamPanel1);
        awayTeamPanel1.setLayout(awayTeamPanel1Layout);
        awayTeamPanel1Layout.setHorizontalGroup(
            awayTeamPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awayTeamPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(awayTeamPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(awayTeamPanel1Layout.createSequentialGroup()
                        .addGroup(awayTeamPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(awayTeamScore1)
                            .addComponent(awayTeam1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(awayTeam_Recall, 0, 196, Short.MAX_VALUE)
                    .addComponent(awayTeamScore_Recall, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        awayTeamPanel1Layout.setVerticalGroup(
            awayTeamPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, awayTeamPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(awayTeam1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(awayTeam_Recall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(awayTeamScore1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(awayTeamScore_Recall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        recallStatus.setText("Status:");

        exitButtonRecall.setText("Exit");
        exitButtonRecall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonRecallActionPerformed(evt);
            }
        });

        backToMenu_Recall.setText("Back to Menu");
        backToMenu_Recall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_RecallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MatchRecallLayout = new javax.swing.GroupLayout(MatchRecall);
        MatchRecall.setLayout(MatchRecallLayout);
        MatchRecallLayout.setHorizontalGroup(
            MatchRecallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatchRecallLayout.createSequentialGroup()
                .addGroup(MatchRecallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatchRecallLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MatchRecallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MatchRecallLayout.createSequentialGroup()
                                .addComponent(recallStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusTextRecall))
                            .addGroup(MatchRecallLayout.createSequentialGroup()
                                .addComponent(homeTeamPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(awayTeamPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(MatchRecallLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(recallMatchConfirm)
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatchRecallLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backToMenu_Recall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButtonRecall)))
                .addContainerGap())
        );
        MatchRecallLayout.setVerticalGroup(
            MatchRecallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatchRecallLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MatchRecallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(awayTeamPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeTeamPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recallMatchConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatchRecallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recallStatus)
                    .addComponent(statusTextRecall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(MatchRecallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMenu_Recall)
                    .addComponent(exitButtonRecall))
                .addContainerGap())
        );

        getContentPane().add(MatchRecall, "card5");

        PointTable.setPreferredSize(new java.awt.Dimension(464, 404));

        exitButtonPoint.setText("Exit");
        exitButtonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonPointActionPerformed(evt);
            }
        });

        backToMenu_Point.setText("Back to Menu");
        backToMenu_Point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_PointActionPerformed(evt);
            }
        });

        ptsText.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText.setText("Line 1");

        ptsText1.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText1.setText("Line 2");

        ptsText2.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText2.setText("Line 3");

        ptsText3.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText3.setText("Line 4");

        ptsText4.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText4.setText("Line 5");

        ptsText5.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText5.setText("Line 6");

        ptsText6.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText6.setText("Line 7");

        ptsText7.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText7.setText("Line 8");

        ptsText8.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText8.setText("Line 9");

        ptsText9.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText9.setText("Line 10");

        ptsText10.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText10.setText("Line 11");

        ptsText11.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText11.setText("Line 12");

        ptsText12.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText12.setText("Line 13");

        ptsText13.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText13.setText("Line 14");

        ptsText14.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText14.setText("Line 15");

        ptsText15.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText15.setText("Line 16");

        ptsText16.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText16.setText("Line 17");

        ptsText17.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText17.setText("Line 18");

        ptsText18.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText18.setText("Line 19");

        ptsText19.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText19.setText("Line 20");

        ptsText20.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText20.setText("Line 21");

        ptsText21.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText21.setText("Line 22");

        javax.swing.GroupLayout PointTableLayout = new javax.swing.GroupLayout(PointTable);
        PointTable.setLayout(PointTableLayout);
        PointTableLayout.setHorizontalGroup(
            PointTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PointTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PointTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PointTableLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backToMenu_Point)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButtonPoint))
                    .addGroup(PointTableLayout.createSequentialGroup()
                        .addGroup(PointTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ptsText)
                            .addComponent(ptsText1)
                            .addComponent(ptsText2)
                            .addComponent(ptsText3)
                            .addComponent(ptsText4)
                            .addComponent(ptsText5)
                            .addComponent(ptsText6)
                            .addComponent(ptsText7)
                            .addComponent(ptsText8)
                            .addComponent(ptsText9)
                            .addComponent(ptsText10)
                            .addComponent(ptsText11)
                            .addComponent(ptsText12)
                            .addComponent(ptsText14)
                            .addComponent(ptsText13)
                            .addComponent(ptsText15)
                            .addComponent(ptsText16)
                            .addComponent(ptsText17)
                            .addComponent(ptsText18)
                            .addComponent(ptsText21)
                            .addComponent(ptsText20)
                            .addComponent(ptsText19))
                        .addGap(0, 392, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PointTableLayout.setVerticalGroup(
            PointTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PointTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ptsText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PointTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMenu_Point)
                    .addComponent(exitButtonPoint))
                .addContainerGap())
        );

        getContentPane().add(PointTable, "card6");

        ClubDetails.setPreferredSize(new java.awt.Dimension(464, 404));

        clubNameMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Club ...", "Manchester United", "Newcastle", "Arsenal", "Liverpool", "Chelsea", "Leeds", "Aston Villa", "Tottenham", "Fulham", "Charlton", "West Ham", "Sunderland", "Ipswich", "Middlesbrough", "Southampton", "Everton", "Bolton", "Blackburn", "Derby", "Leicester" }));
        clubNameMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubNameMenuActionPerformed(evt);
            }
        });

        backToMenu_Club.setText("Back to Menu");
        backToMenu_Club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_ClubActionPerformed(evt);
            }
        });

        exitButtonClub.setText("Exit");
        exitButtonClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonClubActionPerformed(evt);
            }
        });

        clubName.setText("Club Name");

        ground.setText("Ground");

        clubEmblem.setText("Emblem");

        emblemIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/epl/logo/")));

        details.setText("Details:");

        clubNickname.setText("[Nickname]");

        clubFounded.setText("[Founded]");

        clubStdCapacity.setText("[StdCpcity]");

        clubManager.setText("[Manager]");

        founded.setText("Founded:");

        stdCapacity.setText("Stadium Capacity:");

        manager.setText("Manager:");

        nickname.setText("Nickname:");

        javax.swing.GroupLayout ClubDetailsLayout = new javax.swing.GroupLayout(ClubDetails);
        ClubDetails.setLayout(ClubDetailsLayout);
        ClubDetailsLayout.setHorizontalGroup(
            ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClubDetailsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emblemIMG)
                    .addComponent(clubEmblem)
                    .addComponent(clubName)
                    .addComponent(clubNameMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClubDetailsLayout.createSequentialGroup()
                        .addGroup(ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ground)
                            .addComponent(details)
                            .addGroup(ClubDetailsLayout.createSequentialGroup()
                                .addGroup(ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manager)
                                    .addComponent(stdCapacity)
                                    .addComponent(founded)
                                    .addComponent(nickname))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clubManager)
                                    .addComponent(clubStdCapacity)
                                    .addComponent(clubFounded)
                                    .addComponent(clubNickname))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ClubDetailsLayout.createSequentialGroup()
                        .addComponent(groundText, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClubDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenu_Club)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButtonClub)
                .addContainerGap())
        );
        ClubDetailsLayout.setVerticalGroup(
            ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClubDetailsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClubDetailsLayout.createSequentialGroup()
                        .addComponent(clubName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clubNameMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clubEmblem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emblemIMG))
                    .addGroup(ClubDetailsLayout.createSequentialGroup()
                        .addComponent(ground)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(groundText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(details)
                        .addGap(8, 8, 8)
                        .addGroup(ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClubDetailsLayout.createSequentialGroup()
                                .addComponent(clubNickname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clubFounded)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clubStdCapacity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clubManager))
                            .addGroup(ClubDetailsLayout.createSequentialGroup()
                                .addComponent(nickname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(founded)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stdCapacity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manager)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(ClubDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMenu_Club)
                    .addComponent(exitButtonClub))
                .addContainerGap())
        );

        getContentPane().add(ClubDetails, "card7");

        AddUser.setPreferredSize(new java.awt.Dimension(464, 404));
        AddUser.setLayout(null);

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        AddUser.add(cancel);
        cancel.setBounds(219, 92, 65, 23);

        addConfirm.setText("Add");
        addConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConfirmActionPerformed(evt);
            }
        });
        AddUser.add(addConfirm);
        addConfirm.setBounds(154, 92, 51, 23);

        username1.setText("Username:");

        password1.setText("Password:");

        javax.swing.GroupLayout fieldPanelLayout = new javax.swing.GroupLayout(fieldPanel);
        fieldPanel.setLayout(fieldPanelLayout);
        fieldPanelLayout.setHorizontalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username1)
                    .addComponent(password1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordAdd)
                    .addComponent(usernameAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fieldPanelLayout.setVerticalGroup(
            fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username1)
                    .addComponent(usernameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fieldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AddUser.add(fieldPanel);
        fieldPanel.setBounds(12, 12, 262, 73);

        getContentPane().add(AddUser, "card8");

        userDatabase.setColumns(20);
        userDatabase.setRows(5);
        jScrollPane1.setViewportView(userDatabase);

        exitButton_delUser.setText("Exit");
        exitButton_delUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton_delUserActionPerformed(evt);
            }
        });

        backToMenu_delUser.setText("Back to Menu");
        backToMenu_delUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_delUserActionPerformed(evt);
            }
        });

        deleteUserConfirm.setText("Delete");
        deleteUserConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeleteUserLayout = new javax.swing.GroupLayout(DeleteUser);
        DeleteUser.setLayout(DeleteUserLayout);
        DeleteUserLayout.setHorizontalGroup(
            DeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteUserConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(backToMenu_delUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton_delUser)
                .addContainerGap())
        );
        DeleteUserLayout.setVerticalGroup(
            DeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteUserLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMenu_delUser)
                    .addComponent(exitButton_delUser)
                    .addComponent(deleteUserConfirm))
                .addContainerGap())
        );

        getContentPane().add(DeleteUser, "card13");

        MainMenuUser.setBorder(javax.swing.BorderFactory.createTitledBorder("Football"));
        MainMenuUser.setToolTipText("");
        MainMenuUser.setPreferredSize(new java.awt.Dimension(464, 404));

        matchRecallUser.setText("Recall Match");
        matchRecallUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchRecallUserActionPerformed(evt);
            }
        });

        pointTableUser.setText("Point Table");
        pointTableUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointTableUserActionPerformed(evt);
            }
        });

        clubDetailsUser.setText("Club Details");
        clubDetailsUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubDetailsUserActionPerformed(evt);
            }
        });

        exitButtonUser.setText("Exit");
        exitButtonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonUserActionPerformed(evt);
            }
        });

        signoutButtonUser.setText("Sign Out");
        signoutButtonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutButtonUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuUserLayout = new javax.swing.GroupLayout(MainMenuUser);
        MainMenuUser.setLayout(MainMenuUserLayout);
        MainMenuUserLayout.setHorizontalGroup(
            MainMenuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(matchRecallUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenuUserLayout.createSequentialGroup()
                        .addComponent(signoutButtonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButtonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainMenuUserLayout.createSequentialGroup()
                        .addComponent(pointTableUser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clubDetailsUser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainMenuUserLayout.setVerticalGroup(
            MainMenuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matchRecallUser)
                    .addComponent(pointTableUser)
                    .addComponent(clubDetailsUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainMenuUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButtonUser)
                    .addComponent(signoutButtonUser))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        getContentPane().add(MainMenuUser, "card2");

        MatchRecallUser.setPreferredSize(new java.awt.Dimension(464, 404));

        homeTeamPanel_MR_User.setBorder(javax.swing.BorderFactory.createTitledBorder("Home Team"));

        homeTeamRecall_User.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manchester United", "Newcastle", "Arsenal", "Liverpool", "Chelsea", "Leeds", "Aston Villa", "Tottenham", "Fulham", "Charlton", "West Ham", "Sunderland", "Ipswich", "Middlesbrough", "Southampton", "Everton", "Bolton", "Blackburn", "Derby", "Leicester" }));

        homeTeam_User.setText("Team Name");

        homeTeamScore_User.setText("Home Team Score");

        homeTeamScoreRecall_User.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        javax.swing.GroupLayout homeTeamPanel_MR_UserLayout = new javax.swing.GroupLayout(homeTeamPanel_MR_User);
        homeTeamPanel_MR_User.setLayout(homeTeamPanel_MR_UserLayout);
        homeTeamPanel_MR_UserLayout.setHorizontalGroup(
            homeTeamPanel_MR_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTeamPanel_MR_UserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeTeamPanel_MR_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeTeamRecall_User, 0, 178, Short.MAX_VALUE)
                    .addGroup(homeTeamPanel_MR_UserLayout.createSequentialGroup()
                        .addGroup(homeTeamPanel_MR_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeTeam_User)
                            .addComponent(homeTeamScore_User))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(homeTeamScoreRecall_User, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        homeTeamPanel_MR_UserLayout.setVerticalGroup(
            homeTeamPanel_MR_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTeamPanel_MR_UserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeTeam_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeTeamRecall_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(homeTeamScore_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeTeamScoreRecall_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        recallMatchConfirm_User.setText("Recall Match");
        recallMatchConfirm_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recallMatchConfirm_UserActionPerformed(evt);
            }
        });

        statusTextRecall_User.setText("Enter match details");

        awayTeamPanel_MR_User.setBorder(javax.swing.BorderFactory.createTitledBorder("Away Team"));

        awayTeam_User.setText("Away Team");

        awayTeamRecall_User.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manchester United", "Newcastle", "Arsenal", "Liverpool", "Chelsea", "Leeds", "Aston Villa", "Tottenham", "Fulham", "Charlton", "West Ham", "Sunderland", "Ipswich", "Middlesbrough", "Southampton", "Everton", "Bolton", "Blackburn", "Derby", "Leicester" }));

        awayTeamScore_User.setText("Away Team Score");

        awayTeamScoreRecall_User.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        javax.swing.GroupLayout awayTeamPanel_MR_UserLayout = new javax.swing.GroupLayout(awayTeamPanel_MR_User);
        awayTeamPanel_MR_User.setLayout(awayTeamPanel_MR_UserLayout);
        awayTeamPanel_MR_UserLayout.setHorizontalGroup(
            awayTeamPanel_MR_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awayTeamPanel_MR_UserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(awayTeamPanel_MR_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(awayTeamPanel_MR_UserLayout.createSequentialGroup()
                        .addGroup(awayTeamPanel_MR_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(awayTeamScore_User)
                            .addComponent(awayTeam_User))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(awayTeamRecall_User, 0, 196, Short.MAX_VALUE)
                    .addComponent(awayTeamScoreRecall_User, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        awayTeamPanel_MR_UserLayout.setVerticalGroup(
            awayTeamPanel_MR_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, awayTeamPanel_MR_UserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(awayTeam_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(awayTeamRecall_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(awayTeamScore_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(awayTeamScoreRecall_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        status_User.setText("Status:");

        exitButtonRecall_User.setText("Exit");
        exitButtonRecall_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonRecall_UserActionPerformed(evt);
            }
        });

        backToMenu_MR_User.setText("Back to Menu");
        backToMenu_MR_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_MR_UserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MatchRecallUserLayout = new javax.swing.GroupLayout(MatchRecallUser);
        MatchRecallUser.setLayout(MatchRecallUserLayout);
        MatchRecallUserLayout.setHorizontalGroup(
            MatchRecallUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatchRecallUserLayout.createSequentialGroup()
                .addGroup(MatchRecallUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatchRecallUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MatchRecallUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MatchRecallUserLayout.createSequentialGroup()
                                .addComponent(homeTeamPanel_MR_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(awayTeamPanel_MR_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MatchRecallUserLayout.createSequentialGroup()
                                .addComponent(status_User)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusTextRecall_User))))
                    .addGroup(MatchRecallUserLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(recallMatchConfirm_User)
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatchRecallUserLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backToMenu_MR_User)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButtonRecall_User)))
                .addContainerGap())
        );
        MatchRecallUserLayout.setVerticalGroup(
            MatchRecallUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatchRecallUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MatchRecallUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(awayTeamPanel_MR_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeTeamPanel_MR_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recallMatchConfirm_User, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MatchRecallUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status_User)
                    .addComponent(statusTextRecall_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(MatchRecallUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMenu_MR_User)
                    .addComponent(exitButtonRecall_User))
                .addContainerGap())
        );

        getContentPane().add(MatchRecallUser, "card5");

        PointTableUser.setPreferredSize(new java.awt.Dimension(464, 404));

        exitButtonPointUser.setText("Exit");
        exitButtonPointUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonPointUserActionPerformed(evt);
            }
        });

        backToMenu_PointUser.setText("Back to Menu");
        backToMenu_PointUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_PointUserActionPerformed(evt);
            }
        });

        ptsText2_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText2_User.setText("Line 3");

        ptsText3_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText3_User.setText("Line 4");

        ptsText4_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText4_User.setText("Line 5");

        ptsText5_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText5_User.setText("Line 6");

        ptsText6_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText6_User.setText("Line 7");

        ptsText7_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText7_User.setText("Line 8");

        ptsText8_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText8_User.setText("Line 9");

        ptsText9_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText9_User.setText("Line 10");

        ptsText10_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText10_User.setText("Line 11");

        ptsText_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText_User.setText("Line 1");

        ptsText11_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText11_User.setText("Line 12");

        ptsText1_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText1_User.setText("Line 2");

        ptsText12_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText12_User.setText("Line 13");

        ptsText13_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText13_User.setText("Line 14");

        ptsText14_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText14_User.setText("Line 15");

        ptsText15_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText15_User.setText("Line 16");

        ptsText16_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText16_User.setText("Line 17");

        ptsText17_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText17_User.setText("Line 18");

        ptsText18_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText18_User.setText("Line 19");

        ptsText19_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText19_User.setText("Line 20");

        ptsText20_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText20_User.setText("Line 21");

        ptsText21_User.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        ptsText21_User.setText("Line 22");

        javax.swing.GroupLayout PointTableUserLayout = new javax.swing.GroupLayout(PointTableUser);
        PointTableUser.setLayout(PointTableUserLayout);
        PointTableUserLayout.setHorizontalGroup(
            PointTableUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PointTableUserLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(backToMenu_PointUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButtonPointUser)
                .addContainerGap())
            .addGroup(PointTableUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PointTableUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ptsText1_User)
                    .addComponent(ptsText2_User)
                    .addComponent(ptsText3_User)
                    .addComponent(ptsText4_User)
                    .addComponent(ptsText5_User)
                    .addComponent(ptsText6_User)
                    .addComponent(ptsText7_User)
                    .addComponent(ptsText8_User)
                    .addComponent(ptsText9_User)
                    .addComponent(ptsText10_User)
                    .addComponent(ptsText11_User)
                    .addComponent(ptsText12_User)
                    .addComponent(ptsText14_User)
                    .addComponent(ptsText13_User)
                    .addComponent(ptsText15_User)
                    .addComponent(ptsText16_User)
                    .addComponent(ptsText17_User)
                    .addComponent(ptsText18_User)
                    .addComponent(ptsText21_User)
                    .addComponent(ptsText20_User)
                    .addComponent(ptsText19_User)
                    .addComponent(ptsText_User))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PointTableUserLayout.setVerticalGroup(
            PointTableUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PointTableUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ptsText_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText1_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText2_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText3_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText4_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText5_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText6_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText7_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText8_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText9_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText10_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText11_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText12_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText13_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText14_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText15_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText16_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText17_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText18_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText19_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText20_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptsText21_User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PointTableUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMenu_PointUser)
                    .addComponent(exitButtonPointUser))
                .addContainerGap())
        );

        getContentPane().add(PointTableUser, "card6");

        ClubDetailsUser.setPreferredSize(new java.awt.Dimension(464, 404));

        backToMenu_ClubUser.setText("Back to Menu");
        backToMenu_ClubUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_ClubUserActionPerformed(evt);
            }
        });

        exitButtonClubUser.setText("Exit");
        exitButtonClubUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonClubUserActionPerformed(evt);
            }
        });

        clubNickname_User.setText("[Nickname]");

        clubFounded_User.setText("[Founded]");

        clubNameMenu_User.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Club ...", "Manchester United", "Newcastle", "Arsenal", "Liverpool", "Chelsea", "Leeds", "Aston Villa", "Tottenham", "Fulham", "Charlton", "West Ham", "Sunderland", "Ipswich", "Middlesbrough", "Southampton", "Everton", "Bolton", "Blackburn", "Derby", "Leicester" }));
        clubNameMenu_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubNameMenu_UserActionPerformed(evt);
            }
        });

        clubStdCapacity_User.setText("[StdCpcity]");

        clubManager_User.setText("[Manager]");

        founded1.setText("Founded:");

        stdCapacity1.setText("Stadium Capacity:");

        clubName2.setText("Club Name");

        manager1.setText("Manager:");

        ground2.setText("Ground");

        nickname1.setText("Nickname:");

        clubEmblem2.setText("Emblem");

        details1.setText("Details:");

        emblemIMG_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/epl/logo/")));

        javax.swing.GroupLayout ClubDetailsUserLayout = new javax.swing.GroupLayout(ClubDetailsUser);
        ClubDetailsUser.setLayout(ClubDetailsUserLayout);
        ClubDetailsUserLayout.setHorizontalGroup(
            ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClubDetailsUserLayout.createSequentialGroup()
                        .addContainerGap(300, Short.MAX_VALUE)
                        .addComponent(backToMenu_ClubUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButtonClubUser))
                    .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clubEmblem2)
                            .addComponent(clubName2)
                            .addComponent(clubNameMenu_User, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emblemIMG_User))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ground2)
                            .addComponent(details1)
                            .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                                .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manager1)
                                    .addComponent(stdCapacity1)
                                    .addComponent(founded1)
                                    .addComponent(nickname1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clubManager_User)
                                    .addComponent(clubStdCapacity_User)
                                    .addComponent(clubFounded_User)
                                    .addComponent(clubNickname_User)))
                            .addComponent(groundText_User, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ClubDetailsUserLayout.setVerticalGroup(
            ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                        .addComponent(clubName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clubNameMenu_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                        .addComponent(ground2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(groundText_User)))
                .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(details1)
                        .addGap(8, 8, 8)
                        .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                                .addComponent(clubNickname_User)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clubFounded_User)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clubStdCapacity_User)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clubManager_User))
                            .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                                .addComponent(nickname1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(founded1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stdCapacity1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manager1))))
                    .addGroup(ClubDetailsUserLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(clubEmblem2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emblemIMG_User)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addGroup(ClubDetailsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMenu_ClubUser)
                    .addComponent(exitButtonClubUser))
                .addContainerGap())
        );

        getContentPane().add(ClubDetailsUser, "card7");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void loginConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginConfirmActionPerformed
        try {
            uGUI = usernameField.getText(); //Get username and password from the EPLGUI
            pGUI = passwordField.getText();
            
            if ( uGUI.equalsIgnoreCase("admin") && pGUI.equals("admin") ) //Admin menu will show if user & pass entered "admin"
            {
                String uF = new LoginRobot().getUserF(); //get userF & passF from class LoginRobot
                String pF = new LoginRobot().getPassF();
                if ( uGUI.equalsIgnoreCase(uF) && pGUI.equals(pF) ) //Compare user & pass in EPLGUI & LoginRobot
                {
                    LoginForm.setVisible(false);
                    usernameField.setText("");
                    passwordField.setText("");
                    notifText.setText("");
                    setTitle("EPL - Admin Menu");
                    setSize(428, 114);
                    MainMenuAdmin.setVisible(true);
                }
            }
            else if ( uGUI.equalsIgnoreCase("user") && pGUI.equals("user") ) //User menu will show if user & pass entered "user"
            {
                String uF = new LoginRobot().getUserF(); //get userF & passF from class LoginRobot
                String pF = new LoginRobot().getPassF();
                if ( uGUI.equalsIgnoreCase(uF) && pGUI.equals(pF) ) //Compare user & pass in EPLGUI & LoginRobot
                {
                    LoginForm.setVisible(false);
                    usernameField.setText("");
                    passwordField.setText("");
                    notifText.setText("");
                    setTitle("EPL - User Menu");
                    setSize(327, 112);
                    MainMenuUser.setVisible(true);
                }
            }
            
            //Showing login error if the login properties doesn't match with the Login Database
            else 
                { JOptionPane.showMessageDialog(null, "Wrong username or password", "Error", JOptionPane.OK_OPTION); }
        } catch (IOException ex) {
            Logger.getLogger(EPLGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginConfirmActionPerformed

    private void matchEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchEntryActionPerformed
        MainMenuAdmin.setVisible(false);
        setTitle("EPL - Enter a Match");
        setSize(464, 267);
        MatchEntry.setVisible(true); // Match Entry Frame to show after the Main Menu Frame
    }//GEN-LAST:event_matchEntryActionPerformed

    private void matchRecallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchRecallActionPerformed
        MainMenuAdmin.setVisible(false);
        setTitle("EPL - Recall a Match");
        setSize(464, 267);
        MatchRecall.setVisible(true); // Match Recall Frame to show after the Main Menu Frame
    }//GEN-LAST:event_matchRecallActionPerformed

    private void pointTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointTableActionPerformed
        try
        {
            String ptsOutput;
            File readPtsTable = new File("PtsTable.txt");
            Scanner fileReader = new Scanner(readPtsTable);
            
            int readonce = 0;
            while (readonce != 1)
            {
                if (readPtsTable.exists() && !readPtsTable.isDirectory())
                {
                    MainMenuAdmin.setVisible(false);
                    setTitle("EPL - League Table");
                    setSize(464, 547);

                    ptsOutput = fileReader.nextLine();
                    ptsText.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText1.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText2.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText3.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText4.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText5.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText6.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText7.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText8.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText9.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText10.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText11.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText12.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText13.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText14.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText15.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText16.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText17.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText18.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText19.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText20.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText21.setText(ptsOutput);
                    PointTable.setVisible(true); // Point Table Frame to show after the Main Menu Frame
                }
                readonce++;
            }
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(EPLGUI.class.getName()).log(Level.SEVERE, null, ex);
            ptsText.setText(null); ptsText1.setText(null);
            ptsText2.setText(null); ptsText3.setText(null);
            ptsText4.setText(null); ptsText5.setText(null);
            ptsText6.setText(null); ptsText7.setText(null);
            ptsText8.setText(null); ptsText9.setText(null);
            ptsText10.setText(null); ptsText11.setText(null);
            ptsText12.setText(null); ptsText13.setText(null);
            ptsText14.setText(null); ptsText15.setText(null);
            ptsText16.setText(null); ptsText17.setText(null);
            ptsText18.setText(null); ptsText19.setText(null);
            ptsText20.setText(null); ptsText21.setText(null);
            JOptionPane.showMessageDialog(null, "The system cannot find the file specified:\n<html><b>LoginDatabase.txt</b></html>", "Error", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_pointTableActionPerformed

    private void clubDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubDetailsActionPerformed
        MainMenuAdmin.setVisible(false);
        setTitle("EPL - Club Details");
        setSize(500, 342);
        ClubDetails.setVisible(true); // Club Detail Frame to show after the Main Menu Frame
    }//GEN-LAST:event_clubDetailsActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        MainMenuAdmin.setVisible(false);
        setTitle("EPL - Add a User");
        setSize(300, 152);
        AddUser.setVisible(true);
    }//GEN-LAST:event_addUserActionPerformed

    private void exitButtonMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonMainMenuActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonMainMenuActionPerformed

    private void homeTeam_EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeTeam_EntryActionPerformed

    }//GEN-LAST:event_homeTeam_EntryActionPerformed

    private void exitButtonmatchEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonmatchEntryActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonmatchEntryActionPerformed

    private void matchEntryConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchEntryConfirmActionPerformed
        try
        {
            htEntryGUI = (String) homeTeam_Entry.getSelectedItem(); //Get all the selected index of the Match Entry GUI items
            atEntryGUI = (String) awayTeam_Entry.getSelectedItem();
            htScoreEntryGUI = (String) homeTeamScore_Entry.getSelectedItem();
            atScoreEntryGUI = (String) awayTeamScore_Entry.getSelectedItem();
            
            String htEntryF = new MatchEntry().getHomeTeamEntryF();
            String atEntryF = new MatchEntry().getAwayTeamEntryF();
            String htScoreEntryF = new MatchEntry().getHomeTeamScoreEntryF();
            String atScoreEntryF = new MatchEntry().getAwayTeamScoreEntryF();
            
            if ( (htEntryGUI == atEntryGUI) ) //One team cannot play themselves :)
            {
                JOptionPane.showMessageDialog(null, "Sorry, but Home Team can't be the same as Away Team", "Error", JOptionPane.OK_OPTION);
            }
            else if ( htEntryGUI.equalsIgnoreCase(htEntryF) && atEntryGUI.equalsIgnoreCase(atEntryF) ) //Compare selected Home Team & Away Team with the database
            {
                if ( htScoreEntryGUI.equals(htScoreEntryF) && atScoreEntryGUI.equals(atScoreEntryF) ) //Compare selected scores with the database
                { JOptionPane.showMessageDialog(null, "Entered match is already exist", "Error", JOptionPane.OK_OPTION); }
            }
            else if ( htEntryGUI != htEntryF && atEntryGUI != atEntryF )
            {
                if ( htScoreEntryGUI != htScoreEntryF && atScoreEntryGUI != atScoreEntryF )
                { PrintWriter entryConfirm = new PrintWriter("MatchEntry.txt"); }
            }
        }
        catch (IOException ex) { Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex); }
    }//GEN-LAST:event_matchEntryConfirmActionPerformed

    private void backToMenu_EntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_EntryActionPerformed
        MatchEntry.setVisible(false);
        setTitle("EPL - Admin Menu");
        setSize(428, 114);
        MainMenuAdmin.setVisible(true); // Back to Menu
    }//GEN-LAST:event_backToMenu_EntryActionPerformed

    private void homeTeam_RecallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeTeam_RecallActionPerformed

    }//GEN-LAST:event_homeTeam_RecallActionPerformed

    private void recallMatchConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recallMatchConfirmActionPerformed
        try
        {
            //htRecallGUI = homeTeam_Recall.getSelectedIndex(); //Get all the selected index of the Match Entry GUI items
            //atRecallGUI = awayTeam_Recall.getSelectedIndex();
            //htScoreRecallGUI = homeTeamScore_Recall.getSelectedIndex();
            //atScoreRecallGUI = awayTeamScore_Recall.getSelectedIndex();
            
            epl.MatchRecall mRecallGUI = new MatchRecall();
            PrintWriter entryConfirm = new PrintWriter("MatchEntry.txt");
            if ( (htRecallGUI == atRecallGUI) )
            {
                JOptionPane.showMessageDialog(null, "Sorry, but Home Team can't be the same as Away Team", "Error", JOptionPane.OK_OPTION);
            }
            entryConfirm = null;
        }
        catch (IOException ex) { Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex); }
    }//GEN-LAST:event_recallMatchConfirmActionPerformed

    private void exitButtonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonPointActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonPointActionPerformed

    private void backToMenu_PointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_PointActionPerformed
        PointTable.setVisible(false);
        setTitle("EPL - Admin Menu");
        setSize(428, 114);
        MainMenuAdmin.setVisible(true); // Back to Menu
    }//GEN-LAST:event_backToMenu_PointActionPerformed

    private void clubNameMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubNameMenuActionPerformed
        int club = clubNameMenu.getSelectedIndex();
                
        if (club == 0) {
            groundText.setText("");
            emblemIMG.setIcon(null);
            clubNickname.setText(null);
            clubFounded.setText(null);
            clubStdCapacity.setText(null);
            clubManager.setText(null);
        } else if (club == 1) {
            groundText.setText("Old Trafford");  //For the ground text
            URL iconURL = getClass().getResource("logo\\mu.png");  //For the emblem's image
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Red Devils"); //For the club detail text
            clubFounded.setText("First at 1878");
            clubStdCapacity.setText("75,635");
            clubManager.setText("Louis van Gaal");
        } else if (club == 2) {
            groundText.setText("St James' Park");
            URL iconURL = getClass().getResource("logo\\newcastle.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Magpies, The Toon, Geordies");
            clubFounded.setText("9 December 1892");
            clubStdCapacity.setText("52,405");
            clubManager.setText("John Carver");
        } else if (club == 3) {
            groundText.setText("Emirates Stadium");
            URL iconURL = getClass().getResource("logo\\arsenal.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Gunners");
            clubFounded.setText("1886");
            clubStdCapacity.setText("60,338");
            clubManager.setText("Arsène Wenger");
        } else if (club == 4) {
            groundText.setText("Anfield");
            URL iconURL = getClass().getResource("logo\\liverpool.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Reds");
            clubFounded.setText("3 June 1892");
            clubStdCapacity.setText("45,276");
            clubManager.setText("Brendan Rodgers");
        } else if (club == 5) {
            groundText.setText("Stamford Bridge");
            URL iconURL = getClass().getResource("logo\\chelsea.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("Blue Lions, The Blues, The Pensioners");
            clubFounded.setText("10 March 1905");
            clubStdCapacity.setText("41,837");
            clubManager.setText("José Mourinho");
        } else if (club == 6) {
            groundText.setText("Elland Road");
            URL iconURL = getClass().getResource("logo\\leeds.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Peacocks, United, The Whites");
            clubFounded.setText("1919");
            clubStdCapacity.setText("37,890");
            clubManager.setText("Uwe Rösler");
        } else if (club == 7) {
            groundText.setText("Villa Park");
            URL iconURL = getClass().getResource("logo\\astonvilla.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Villans, The Claret & Blue Army");
            clubFounded.setText("November 1874");
            clubStdCapacity.setText("42,682");
            clubManager.setText("Tim Sherwood");
        } else if (club == 8) {
            groundText.setText("White Hart Lane");
            URL iconURL = getClass().getResource("logo\\tottenham.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("Spurs, The Lilywhites");
            clubFounded.setText("5 September 1882");
            clubStdCapacity.setText("36,284");
            clubManager.setText("Mauricio Pochettino");
        } else if (club == 9) {
            groundText.setText("Craven Cottage");
            URL iconURL = getClass().getResource("logo\\fulham.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Cottagers, The Lilywhites");
            clubFounded.setText("16 August 1879");
            clubStdCapacity.setText("25,700");
            clubManager.setText("Kit Symons");
        } else if (club == 10) {
            groundText.setText("The Valley");
            URL iconURL = getClass().getResource("logo\\charlton.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Addicks, Red Robins, The Valiants");
            clubFounded.setText("9 June 1905");
            clubStdCapacity.setText("27,111");
            clubManager.setText("Guy Luzon");
        } else if (club == 11) {
            groundText.setText("The Boleyn Ground");
            URL iconURL = getClass().getResource("logo\\westham.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Irons, The Academy of Football");
            clubFounded.setText("1895");
            clubStdCapacity.setText("35,016");
            clubManager.setText("<html><font color='red'><b><i>Vacant</i></b></font></html>");
        } else if (club == 12) {
            groundText.setText("Stadium of Light");
            URL iconURL = getClass().getResource("logo\\sunderland.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Black Cats");
            clubFounded.setText("1879");
            clubStdCapacity.setText("49,000");
            clubManager.setText("<html><font color='red'><b><i>Vacant</i></b></font></html>");
        } else if (club == 13) {
            groundText.setText("Portman Road, Ipswich");
            URL iconURL = getClass().getResource("logo\\ipswich.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Blues, The Tractor Boys");
            clubFounded.setText("1878");
            clubStdCapacity.setText("30,311");
            clubManager.setText("Mick McCarthy");
        } else if (club == 14) {
            groundText.setText("Riverside Stadium, Middlesbrough");
            URL iconURL = getClass().getResource("logo\\middlesbrough.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Boro, Smoggies");
            clubFounded.setText("1876");
            clubStdCapacity.setText("34,742");
            clubManager.setText("Aitor Karanka");
        } else if (club == 15) {
            groundText.setText("St Mary's Stadium");
            URL iconURL = getClass().getResource("logo\\southampton.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Saints");
            clubFounded.setText("21 November 1885");
            clubStdCapacity.setText("32,505");
            clubManager.setText("Ronald Koeman");
        } else if (club == 16) {
            groundText.setText("Goodison Park, Walton, Liverpool");
            URL iconURL = getClass().getResource("logo\\everton.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Toffees, The People's Club");
            clubFounded.setText("1878");
            clubStdCapacity.setText("39,573");
            clubManager.setText("Roberto Martínez");
        } else if (club == 17) {
            groundText.setText("Macron Stadium, Bolton, Greater Manchester");
            URL iconURL = getClass().getResource("logo\\bolton.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Trotters, The Wanderers");
            clubFounded.setText("1874");
            clubStdCapacity.setText("28,723");
            clubManager.setText("Neil Lennon");
        } else if (club == 18) {
            groundText.setText("Ewood Park, Blackburn, Lancashire");
            URL iconURL = getClass().getResource("logo\\blackburn.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Blue and Whites, The Riversiders");
            clubFounded.setText("1875");
            clubStdCapacity.setText("31,367");
            clubManager.setText("Gary Bowyer");
        } else if (club == 19) {
            groundText.setText("Pride Park Stadium, Derby");
            URL iconURL = getClass().getResource("logo\\derby.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Rams");
            clubFounded.setText("February 5, 1884");
            clubStdCapacity.setText("33,500");
            clubManager.setText("Paul Clement");
        } else if (club == 20) {
            groundText.setText("King Power Stadium, Leicester (Filbert Way)");
            URL iconURL = getClass().getResource("logo\\leicester.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG.setIcon(icon);
            clubNickname.setText("The Foxes, City, Blue Army");
            clubFounded.setText("1884");
            clubStdCapacity.setText("32,262");
            clubManager.setText("Nigel Pearson");
        }
    }//GEN-LAST:event_clubNameMenuActionPerformed

    private void backToMenu_ClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_ClubActionPerformed
        ClubDetails.setVisible(false);
        clubNameMenu.setSelectedIndex(0);
        groundText.setText(null);
        emblemIMG.setIcon(null);
        clubNickname.setText(null);
        clubFounded.setText(null);
        clubStdCapacity.setText(null);
        clubManager.setText(null);
        setTitle("EPL - Admin Menu");
        setSize(428, 114);
        MainMenuAdmin.setVisible(true); // Back to Menu
    }//GEN-LAST:event_backToMenu_ClubActionPerformed

    private void exitButtonClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonClubActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonClubActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        AddUser.setVisible(false);
        setTitle("EPL - Admin Menu");
        setSize(428, 114);
        MainMenuAdmin.setVisible(true); // Back to Menu
    }//GEN-LAST:event_cancelActionPerformed

    private void addConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConfirmActionPerformed
        try
        {
            uAddGUI = usernameAdd.getText();
            pAddGUI = passwordAdd.getText();
            String uAF = new AddUser().getuAddF();
            String pAF = new AddUser().getpAddF();
            
            PrintWriter prtWrite = new PrintWriter(new BufferedWriter (new FileWriter("LoginDB.txt", true) ) );
            BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
            if (uAddGUI == null && pAddGUI == null)
            {
                JOptionPane.showMessageDialog(null, "Username and/or password cannot be empty", "Error", JOptionPane.OK_OPTION);
            }
            else if (pAF != null) //This will check whether the last line (password line) on txt is filled or not
            {
                prtWrite.println(); //Print breakline to txt
                prtWrite.println(uAddGUI); //Print String "uAddGUI" to txt and set breakline
                prtWrite.print(pAddGUI);//Print String "pAddGUI" to txt
                prtWrite.close(); //Close the printWriter cmd and show message below
                JOptionPane.showMessageDialog(null, "User \"" + uAddGUI + "\" is added to database", "Done", JOptionPane.OK_OPTION);
            }
            else if (uAF == "\n") //This will check whether the 'username line' on txt is filled with 'breakline' or not
            {
                prtWrite.println(uAddGUI); //Print String "uAddGUI" to txt and set breakline
                prtWrite.print(pAddGUI); //Print String "pAddGUI" to txt
                prtWrite.close(); //Close the printWriter cmd and show message below
                JOptionPane.showMessageDialog(null, "User \"" + uAddGUI + "\" is added to database", "Done", JOptionPane.OK_OPTION);
            }
                
        }
        catch (IOException ex) { Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex); }
    }//GEN-LAST:event_addConfirmActionPerformed

    private void exitButtonRecallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonRecallActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonRecallActionPerformed

    private void backToMenu_RecallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_RecallActionPerformed
        MatchRecall.setVisible(false);
        setTitle("EPL - Admin Menu");
        setSize(428, 114);
        MainMenuAdmin.setVisible(true); // Back to Menu
    }//GEN-LAST:event_backToMenu_RecallActionPerformed

    private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonActionPerformed
        notifText.setText("");
        MainMenuAdmin.setVisible(false);
        setTitle("EPL - Login");
        setSize(257, 158);
        LoginForm.setVisible(true); // Back to Login Form
    }//GEN-LAST:event_signoutButtonActionPerformed

    private void matchRecallUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchRecallUserActionPerformed
        MainMenuUser.setVisible(false);
        setTitle("EPL - Recall a Match");
        setSize(464, 267);
        MatchRecallUser.setVisible(true); // Match Recall (User) Frame to show after the Main Menu Frame
    }//GEN-LAST:event_matchRecallUserActionPerformed

    private void pointTableUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointTableUserActionPerformed
        try
        {
            String ptsOutput = null;
            File readPtsTable = new File("PtsTable.txt");
            Scanner fileReader = new Scanner(readPtsTable);
            
            int readonce = 0;
            while (readonce != 1)
            {
                if (readPtsTable.exists() && !readPtsTable.isDirectory())
                {
                    MainMenuUser.setVisible(false);
                    setTitle("EPL - League Table");
                    setSize(464, 547);

                    ptsOutput = fileReader.nextLine();
                    ptsText_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText1_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText2_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText3_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText4_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText5_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText6_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText7_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText8_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText9_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText10_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText11_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText12_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText13_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText14_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText15_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText16_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText17_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText18_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText19_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText20_User.setText(ptsOutput);
                    ptsOutput = fileReader.nextLine();
                    ptsText21_User.setText(ptsOutput);
                    PointTableUser.setVisible(true); // Point Table (User) Frame to show after the Main Menu Frame
                }
                readonce++;
            }
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(EPLGUI.class.getName()).log(Level.SEVERE, null, ex);
            ptsText_User.setText(null); ptsText1_User.setText(null);
            ptsText2_User.setText(null); ptsText3_User.setText(null);
            ptsText4_User.setText(null); ptsText5_User.setText(null);
            ptsText6_User.setText(null); ptsText7_User.setText(null);
            ptsText8_User.setText(null); ptsText9_User.setText(null);
            ptsText10_User.setText(null); ptsText11_User.setText(null);
            ptsText12_User.setText(null); ptsText13_User.setText(null);
            ptsText14_User.setText(null); ptsText15_User.setText(null);
            ptsText16_User.setText(null); ptsText17_User.setText(null);
            ptsText18_User.setText(null); ptsText19_User.setText(null);
            ptsText20_User.setText(null); ptsText21_User.setText(null);
            JOptionPane.showMessageDialog(null, "The system cannot find the file specified:\n<html><b>LoginDatabase.txt</b></html>", "Error", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_pointTableUserActionPerformed

    private void clubDetailsUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubDetailsUserActionPerformed
        MainMenuUser.setVisible(false);
        setTitle("EPL - Club Details");
        setSize(500, 342);
        ClubDetailsUser.setVisible(true); // Club Details (User) Frame to show after the Main Menu Frame
    }//GEN-LAST:event_clubDetailsUserActionPerformed

    private void exitButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonUserActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonUserActionPerformed

    private void signoutButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonUserActionPerformed
        notifText.setText("");
        MainMenuUser.setVisible(false);
        setTitle("EPL - Login");
        setSize(257, 158);
        LoginForm.setVisible(true); // Back to Login Form
    }//GEN-LAST:event_signoutButtonUserActionPerformed

    private void recallMatchConfirm_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recallMatchConfirm_UserActionPerformed
        try
        {
            htRecallUserGUI = (String) homeTeamRecall_User.getSelectedItem(); //Get all the selected index of the Match Entry GUI items
            atRecallUserGUI = (String) awayTeamRecall_User.getSelectedItem();
            htScoreRecallUserGUI = (String) homeTeamScoreRecall_User.getSelectedItem();
            atScoreRecallUserGUI = (String) homeTeamScoreRecall_User.getSelectedItem();
            
            PrintWriter entryConfirm = new PrintWriter("MatchEntry.txt");
            if ( (htRecallUserGUI == atRecallUserGUI) )
            {
                JOptionPane.showMessageDialog(null, "Sorry, but Home Team can't be the same as Away Team", "Error", JOptionPane.OK_OPTION);
            }
            entryConfirm = null;
        }
        catch (IOException ex) { Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex); }
    }//GEN-LAST:event_recallMatchConfirm_UserActionPerformed

    private void exitButtonRecall_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonRecall_UserActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonRecall_UserActionPerformed

    private void backToMenu_MR_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_MR_UserActionPerformed
        MatchRecallUser.setVisible(false);
        setTitle("EPL - User Menu");
        setSize(327, 112);
        MainMenuUser.setVisible(true); // Match Recall Frame to show after the Main Menu Frame
    }//GEN-LAST:event_backToMenu_MR_UserActionPerformed

    private void exitButtonPointUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonPointUserActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonPointUserActionPerformed

    private void backToMenu_PointUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_PointUserActionPerformed
        PointTableUser.setVisible(false);
        setTitle("EPL - User Menu");
        setSize(327, 112);
        MainMenuUser.setVisible(true);
    }//GEN-LAST:event_backToMenu_PointUserActionPerformed

    private void backToMenu_ClubUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_ClubUserActionPerformed
        ClubDetailsUser.setVisible(false);
        clubNameMenu_User.setSelectedIndex(0);
        groundText_User.setText(null);
        emblemIMG_User.setIcon(null);
        clubNickname_User.setText(null);
        clubFounded_User.setText(null);
        clubStdCapacity_User.setText(null);
        clubManager_User.setText(null);
        setTitle("EPL - User Menu");
        setSize(327, 112);
        MainMenuUser.setVisible(true);
    }//GEN-LAST:event_backToMenu_ClubUserActionPerformed

    private void exitButtonClubUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonClubUserActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButtonClubUserActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed

    }//GEN-LAST:event_passwordFieldActionPerformed

    private void clubNameMenu_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubNameMenu_UserActionPerformed
        int club = clubNameMenu_User.getSelectedIndex();
                
        if (club == 0) {
            groundText_User.setText("");
            emblemIMG_User.setIcon(null);
            clubNickname_User.setText(null);
            clubFounded_User.setText(null);
            clubStdCapacity_User.setText(null);
            clubManager_User.setText(null);
        } else if (club == 1) {
            groundText_User.setText("Old Trafford");  //For the ground text
            URL iconURL = getClass().getResource("logo\\mu.png");  //For the emblem's image
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Red Devils"); //For the club detail text
            clubFounded_User.setText("First at 1878");
            clubStdCapacity_User.setText("75,635");
            clubManager_User.setText("Louis van Gaal");
        } else if (club == 2) {
            groundText_User.setText("St James' Park");
            URL iconURL = getClass().getResource("logo\\newcastle.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Magpies, The Toon, Geordies");
            clubFounded_User.setText("9 December 1892");
            clubStdCapacity_User.setText("52,405");
            clubManager_User.setText("John Carver");
        } else if (club == 3) {
            groundText_User.setText("Emirates Stadium");
            URL iconURL = getClass().getResource("logo\\arsenal.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Gunners");
            clubFounded_User.setText("1886");
            clubStdCapacity_User.setText("60,338");
            clubManager_User.setText("Arsène Wenger");
        } else if (club == 4) {
            groundText_User.setText("Anfield");
            URL iconURL = getClass().getResource("logo\\liverpool.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Reds");
            clubFounded_User.setText("3 June 1892");
            clubStdCapacity_User.setText("45,276");
            clubManager_User.setText("Brendan Rodgers");
        } else if (club == 5) {
            groundText_User.setText("Stamford Bridge");
            URL iconURL = getClass().getResource("logo\\chelsea.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("Blue Lions, The Blues, The Pensioners");
            clubFounded_User.setText("10 March 1905");
            clubStdCapacity_User.setText("41,837");
            clubManager_User.setText("José Mourinho");
        } else if (club == 6) {
            groundText_User.setText("Elland Road");
            URL iconURL = getClass().getResource("logo\\leeds.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Peacocks, United, The Whites");
            clubFounded_User.setText("1919");
            clubStdCapacity_User.setText("37,890");
            clubManager_User.setText("Uwe Rösler");
        } else if (club == 7) {
            groundText_User.setText("Villa Park");
            URL iconURL = getClass().getResource("logo\\astonvilla.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Villans, The Claret & Blue Army");
            clubFounded_User.setText("November 1874");
            clubStdCapacity_User.setText("42,682");
            clubManager_User.setText("Tim Sherwood");
        } else if (club == 8) {
            groundText_User.setText("White Hart Lane");
            URL iconURL = getClass().getResource("logo\\tottenham.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("Spurs, The Lilywhites");
            clubFounded_User.setText("5 September 1882");
            clubStdCapacity_User.setText("36,284");
            clubManager_User.setText("Mauricio Pochettino");
        } else if (club == 9) {
            groundText_User.setText("Craven Cottage");
            URL iconURL = getClass().getResource("logo\\fulham.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Cottagers, The Lilywhites");
            clubFounded_User.setText("16 August 1879");
            clubStdCapacity_User.setText("25,700");
            clubManager_User.setText("Kit Symons");
        } else if (club == 10) {
            groundText_User.setText("The Valley");
            URL iconURL = getClass().getResource("logo\\charlton.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Addicks, Red Robins, The Valiants");
            clubFounded_User.setText("9 June 1905");
            clubStdCapacity_User.setText("27,111");
            clubManager_User.setText("Guy Luzon");
        } else if (club == 11) {
            groundText_User.setText("The Boleyn Ground");
            URL iconURL = getClass().getResource("logo\\westham.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Irons, The Academy of Football");
            clubFounded_User.setText("1895");
            clubStdCapacity_User.setText("35,016");
            clubManager_User.setText("<html><font color='red'><b><i>Vacant</i></b></font></html>");
        } else if (club == 12) {
            groundText_User.setText("Stadium of Light");
            URL iconURL = getClass().getResource("logo\\sunderland.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Black Cats");
            clubFounded_User.setText("1879");
            clubStdCapacity_User.setText("49,000");
            clubManager_User.setText("<html><font color='red'><b><i>Vacant</i></b></font></html>");
        } else if (club == 13) {
            groundText_User.setText("Portman Road, Ipswich");
            URL iconURL = getClass().getResource("logo\\ipswich.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Blues, The Tractor Boys");
            clubFounded_User.setText("1878");
            clubStdCapacity_User.setText("30,311");
            clubManager_User.setText("Mick McCarthy");
        } else if (club == 14) {
            groundText_User.setText("Riverside Stadium, Middlesbrough");
            URL iconURL = getClass().getResource("logo\\middlesbrough.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Boro, Smoggies");
            clubFounded_User.setText("1876");
            clubStdCapacity_User.setText("34,742");
            clubManager_User.setText("Aitor Karanka");
        } else if (club == 15) {
            groundText_User.setText("St Mary's Stadium");
            URL iconURL = getClass().getResource("logo\\southampton.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Saints");
            clubFounded_User.setText("21 November 1885");
            clubStdCapacity_User.setText("32,505");
            clubManager_User.setText("Ronald Koeman");
        } else if (club == 16) {
            groundText_User.setText("Goodison Park, Walton, Liverpool");
            URL iconURL = getClass().getResource("logo\\everton.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Toffees, The People's Club");
            clubFounded_User.setText("1878");
            clubStdCapacity_User.setText("39,573");
            clubManager_User.setText("Roberto Martínez");
        } else if (club == 17) {
            groundText_User.setText("Macron Stadium, Bolton, Greater Manchester");
            URL iconURL = getClass().getResource("logo\\bolton.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Trotters, The Wanderers");
            clubFounded_User.setText("1874");
            clubStdCapacity_User.setText("28,723");
            clubManager_User.setText("Neil Lennon");
        } else if (club == 18) {
            groundText_User.setText("Ewood Park, Blackburn, Lancashire");
            URL iconURL = getClass().getResource("logo\\blackburn.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Blue and Whites, The Riversiders");
            clubFounded_User.setText("1875");
            clubStdCapacity_User.setText("31,367");
            clubManager_User.setText("Gary Bowyer");
        } else if (club == 19) {
            groundText_User.setText("Pride Park Stadium, Derby");
            URL iconURL = getClass().getResource("logo\\derby.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Rams");
            clubFounded_User.setText("February 5, 1884");
            clubStdCapacity_User.setText("33,500");
            clubManager_User.setText("Paul Clement");
        } else if (club == 20) {
            groundText_User.setText("King Power Stadium, Leicester (Filbert Way)");
            URL iconURL = getClass().getResource("logo\\leicester.png");
            ImageIcon icon = new ImageIcon(iconURL);
            emblemIMG_User.setIcon(icon);
            clubNickname_User.setText("The Foxes, City, Blue Army");
            clubFounded_User.setText("1884");
            clubStdCapacity_User.setText("32,262");
            clubManager_User.setText("Nigel Pearson");
        }
    }//GEN-LAST:event_clubNameMenu_UserActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        try {
            MainMenuAdmin.setVisible(false);
            setTitle("EPL - Delete User");
            setSize(270, 265);
            
            userDBGet = userDatabase.getText();
            userDBSet = userDBGet;
            //String uDF = new DeleteUser().getuDelF();
            //String pDF = new DeleteUser().getpDelF();
            int userNo = 1;
            
            BufferedReader br = new BufferedReader(new FileReader("LoginDB.txt"));
            br.readLine();
            br.readLine();
            uDelGUI = br.readLine();
            pDelGUI = br.readLine();
            while (uDelGUI != null && pDelGUI != null)
            {
                userDatabase.append("User " + userNo + "\n");
                userNo += 1;
                userDatabase.append("Username: " + uDelGUI + "\n");
                userDatabase.append("Password: " + pDelGUI + "\n\n");
                uDelGUI = br.readLine();
                pDelGUI = br.readLine();
            }
            
            DeleteUser.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(EPLGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_deleteUserActionPerformed

    private void exitButton_delUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton_delUserActionPerformed
        int exitPopUp = JOptionPane.showConfirmDialog(null, "Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (exitPopUp == JOptionPane.YES_OPTION) { System.exit(0); }
    }//GEN-LAST:event_exitButton_delUserActionPerformed

    private void backToMenu_delUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_delUserActionPerformed
        DeleteUser.setVisible(false);
        setTitle("EPL - Admin Menu");
        setSize(428, 114);
        MainMenuAdmin.setVisible(true); // Back to Menu
    }//GEN-LAST:event_backToMenu_delUserActionPerformed

    private void deleteUserConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserConfirmActionPerformed
        
    }//GEN-LAST:event_deleteUserConfirmActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EPLGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new EPLGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EPLGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddUser;
    private javax.swing.JPanel ClubDetails;
    private javax.swing.JPanel ClubDetailsUser;
    private javax.swing.JPanel DeleteUser;
    private javax.swing.JPanel LoginForm;
    private javax.swing.JPanel MainMenuAdmin;
    private javax.swing.JPanel MainMenuUser;
    private javax.swing.JPanel MatchEntry;
    private javax.swing.JPanel MatchRecall;
    private javax.swing.JPanel MatchRecallUser;
    private javax.swing.JPanel PointTable;
    private javax.swing.JPanel PointTableUser;
    private javax.swing.JButton addConfirm;
    private javax.swing.JButton addUser;
    private javax.swing.JLabel awayTeam;
    private javax.swing.JLabel awayTeam1;
    private javax.swing.JPanel awayTeamPanel1;
    private javax.swing.JPanel awayTeamPanelEntry;
    private javax.swing.JPanel awayTeamPanel_MR_User;
    private javax.swing.JComboBox awayTeamRecall_User;
    private javax.swing.JLabel awayTeamScore;
    private javax.swing.JLabel awayTeamScore1;
    private javax.swing.JComboBox awayTeamScoreRecall_User;
    private javax.swing.JComboBox awayTeamScore_Entry;
    private javax.swing.JComboBox awayTeamScore_Recall;
    private javax.swing.JLabel awayTeamScore_User;
    private javax.swing.JComboBox awayTeam_Entry;
    private javax.swing.JComboBox awayTeam_Recall;
    private javax.swing.JLabel awayTeam_User;
    private javax.swing.JButton backToMenu_Club;
    private javax.swing.JButton backToMenu_ClubUser;
    private javax.swing.JButton backToMenu_Entry;
    private javax.swing.JButton backToMenu_MR_User;
    private javax.swing.JButton backToMenu_Point;
    private javax.swing.JButton backToMenu_PointUser;
    private javax.swing.JButton backToMenu_Recall;
    private javax.swing.JButton backToMenu_delUser;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clubDetails;
    private javax.swing.JButton clubDetailsUser;
    private javax.swing.JLabel clubEmblem;
    private javax.swing.JLabel clubEmblem2;
    private javax.swing.JLabel clubFounded;
    private javax.swing.JLabel clubFounded_User;
    private javax.swing.JLabel clubManager;
    private javax.swing.JLabel clubManager_User;
    private javax.swing.JLabel clubName;
    private javax.swing.JLabel clubName2;
    private javax.swing.JComboBox clubNameMenu;
    private javax.swing.JComboBox clubNameMenu_User;
    private javax.swing.JLabel clubNickname;
    private javax.swing.JLabel clubNickname_User;
    private javax.swing.JLabel clubStdCapacity;
    private javax.swing.JLabel clubStdCapacity_User;
    private javax.swing.JButton deleteUser;
    private javax.swing.JButton deleteUserConfirm;
    private javax.swing.JLabel details;
    private javax.swing.JLabel details1;
    private javax.swing.JLabel emblemIMG;
    private javax.swing.JLabel emblemIMG_User;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButtonClub;
    private javax.swing.JButton exitButtonClubUser;
    private javax.swing.JButton exitButtonMainMenu;
    private javax.swing.JButton exitButtonPoint;
    private javax.swing.JButton exitButtonPointUser;
    private javax.swing.JButton exitButtonRecall;
    private javax.swing.JButton exitButtonRecall_User;
    private javax.swing.JButton exitButtonUser;
    private javax.swing.JButton exitButton_delUser;
    private javax.swing.JButton exitButtonmatchEntry;
    private javax.swing.JPanel fieldPanel;
    private javax.swing.JLabel founded;
    private javax.swing.JLabel founded1;
    private javax.swing.JLabel ground;
    private javax.swing.JLabel ground2;
    private javax.swing.JTextField groundText;
    private javax.swing.JTextField groundText_User;
    private javax.swing.JLabel homeTeam;
    private javax.swing.JLabel homeTeam1;
    private javax.swing.JPanel homeTeamPanel1;
    private javax.swing.JPanel homeTeamPanelEntry;
    private javax.swing.JPanel homeTeamPanel_MR_User;
    private javax.swing.JComboBox homeTeamRecall_User;
    private javax.swing.JLabel homeTeamScore;
    private javax.swing.JLabel homeTeamScore1;
    private javax.swing.JComboBox homeTeamScoreRecall_User;
    private javax.swing.JComboBox homeTeamScore_Entry;
    private javax.swing.JComboBox homeTeamScore_Recall;
    private javax.swing.JLabel homeTeamScore_User;
    private javax.swing.JComboBox homeTeam_Entry;
    private javax.swing.JComboBox homeTeam_Recall;
    private javax.swing.JLabel homeTeam_User;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginConfirm;
    private javax.swing.JLabel manager;
    private javax.swing.JLabel manager1;
    private javax.swing.JButton matchEntry;
    private javax.swing.JButton matchEntryConfirm;
    private javax.swing.JButton matchRecall;
    private javax.swing.JButton matchRecallUser;
    private javax.swing.JLabel nickname;
    private javax.swing.JLabel nickname1;
    private javax.swing.JLabel notifText;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JTextField passwordAdd;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton pointTable;
    private javax.swing.JButton pointTableUser;
    private javax.swing.JLabel ptsText;
    private javax.swing.JLabel ptsText1;
    private javax.swing.JLabel ptsText10;
    private javax.swing.JLabel ptsText10_User;
    private javax.swing.JLabel ptsText11;
    private javax.swing.JLabel ptsText11_User;
    private javax.swing.JLabel ptsText12;
    private javax.swing.JLabel ptsText12_User;
    private javax.swing.JLabel ptsText13;
    private javax.swing.JLabel ptsText13_User;
    private javax.swing.JLabel ptsText14;
    private javax.swing.JLabel ptsText14_User;
    private javax.swing.JLabel ptsText15;
    private javax.swing.JLabel ptsText15_User;
    private javax.swing.JLabel ptsText16;
    private javax.swing.JLabel ptsText16_User;
    private javax.swing.JLabel ptsText17;
    private javax.swing.JLabel ptsText17_User;
    private javax.swing.JLabel ptsText18;
    private javax.swing.JLabel ptsText18_User;
    private javax.swing.JLabel ptsText19;
    private javax.swing.JLabel ptsText19_User;
    private javax.swing.JLabel ptsText1_User;
    private javax.swing.JLabel ptsText2;
    private javax.swing.JLabel ptsText20;
    private javax.swing.JLabel ptsText20_User;
    private javax.swing.JLabel ptsText21;
    private javax.swing.JLabel ptsText21_User;
    private javax.swing.JLabel ptsText2_User;
    private javax.swing.JLabel ptsText3;
    private javax.swing.JLabel ptsText3_User;
    private javax.swing.JLabel ptsText4;
    private javax.swing.JLabel ptsText4_User;
    private javax.swing.JLabel ptsText5;
    private javax.swing.JLabel ptsText5_User;
    private javax.swing.JLabel ptsText6;
    private javax.swing.JLabel ptsText6_User;
    private javax.swing.JLabel ptsText7;
    private javax.swing.JLabel ptsText7_User;
    private javax.swing.JLabel ptsText8;
    private javax.swing.JLabel ptsText8_User;
    private javax.swing.JLabel ptsText9;
    private javax.swing.JLabel ptsText9_User;
    private javax.swing.JLabel ptsText_User;
    private javax.swing.JButton recallMatchConfirm;
    private javax.swing.JButton recallMatchConfirm_User;
    private javax.swing.JLabel recallStatus;
    private javax.swing.JButton signoutButton;
    private javax.swing.JButton signoutButtonUser;
    private javax.swing.JLabel status;
    private javax.swing.JTextField statusText;
    private javax.swing.JTextField statusTextRecall;
    private javax.swing.JTextField statusTextRecall_User;
    private javax.swing.JLabel status_User;
    private javax.swing.JLabel stdCapacity;
    private javax.swing.JLabel stdCapacity1;
    private javax.swing.JTextArea userDatabase;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    private javax.swing.JTextField usernameAdd;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private static class emblemIMG extends PopupMenu
    {
        public emblemIMG(ImageIcon imageIcon) {}
    }
}
