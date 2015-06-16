
import javax.swing.JScrollPane;
import model.Computer;
import store.Store;

public class main extends javax.swing.JFrame
{
    JDBConnector connector;
    
    public main()
    {
        initComponents();
        setLocationRelativeTo(null);
        dbTextArea.setEditable(false);
        storeList.setEditable(false);
        setSize(350, 150);
        setResizable(false);
        setTitle("Computer Distributor");
        
        Computer.setVisible(false);
        Stores.setVisible(false);
        Orders.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrontPanel = new javax.swing.JPanel();
        ProgramTitle = new javax.swing.JLabel();
        computerMenu = new javax.swing.JButton();
        orderMenu = new javax.swing.JButton();
        storeMenu = new javax.swing.JButton();
        Computer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dbTextArea = new javax.swing.JTextArea();
        showAllDB = new javax.swing.JButton();
        backToMenu_Computer = new javax.swing.JButton();
        Stores = new javax.swing.JPanel();
        backToMenu_Stores = new javax.swing.JButton();
        jScrollPaneStore = new javax.swing.JScrollPane();
        storeList = new javax.swing.JTextArea();
        Orders = new javax.swing.JPanel();
        backToMenu_Orders = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProgramTitle.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        ProgramTitle.setText("Computer Distributor");

        computerMenu.setText("Computer List");
        computerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerMenuActionPerformed(evt);
            }
        });

        orderMenu.setText("Your Orders");
        orderMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderMenuActionPerformed(evt);
            }
        });

        storeMenu.setText("Our Stores");
        storeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrontPanelLayout = new javax.swing.GroupLayout(FrontPanel);
        FrontPanel.setLayout(FrontPanelLayout);
        FrontPanelLayout.setHorizontalGroup(
            FrontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(computerMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrontPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProgramTitle)
                .addGap(62, 62, 62))
        );
        FrontPanelLayout.setVerticalGroup(
            FrontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrontPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ProgramTitle)
                .addGap(18, 18, 18)
                .addGroup(FrontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computerMenu)
                    .addComponent(orderMenu)
                    .addComponent(storeMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dbTextArea.setColumns(20);
        dbTextArea.setRows(5);
        jScrollPane1.setViewportView(dbTextArea);

        showAllDB.setText("Show Computer DB");
        showAllDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllDBActionPerformed(evt);
            }
        });

        backToMenu_Computer.setText("Menu");
        backToMenu_Computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_ComputerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ComputerLayout = new javax.swing.GroupLayout(Computer);
        Computer.setLayout(ComputerLayout);
        ComputerLayout.setHorizontalGroup(
            ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(ComputerLayout.createSequentialGroup()
                        .addComponent(backToMenu_Computer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(showAllDB)))
                .addContainerGap())
        );
        ComputerLayout.setVerticalGroup(
            ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComputerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ComputerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAllDB)
                    .addComponent(backToMenu_Computer))
                .addContainerGap())
        );

        backToMenu_Stores.setText("Menu");
        backToMenu_Stores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_StoresActionPerformed(evt);
            }
        });

        storeList.setColumns(20);
        storeList.setRows(5);
        jScrollPaneStore.setViewportView(storeList);

        javax.swing.GroupLayout StoresLayout = new javax.swing.GroupLayout(Stores);
        Stores.setLayout(StoresLayout);
        StoresLayout.setHorizontalGroup(
            StoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoresLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(StoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(StoresLayout.createSequentialGroup()
                        .addComponent(backToMenu_Stores)
                        .addGap(318, 318, 318))
                    .addGroup(StoresLayout.createSequentialGroup()
                        .addComponent(jScrollPaneStore)
                        .addContainerGap())))
        );
        StoresLayout.setVerticalGroup(
            StoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoresLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPaneStore, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(backToMenu_Stores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backToMenu_Orders.setText("Menu");
        backToMenu_Orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenu_OrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OrdersLayout = new javax.swing.GroupLayout(Orders);
        Orders.setLayout(OrdersLayout);
        OrdersLayout.setHorizontalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backToMenu_Orders)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        OrdersLayout.setVerticalGroup(
            OrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrdersLayout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(backToMenu_Orders)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 21, Short.MAX_VALUE)
                    .addComponent(FrontPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Computer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Stores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(FrontPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Computer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Stores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showAllDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllDBActionPerformed
        JDBConnector bean = new JDBConnector();
        Computer cpu = bean.getTables_Computer();
        dbTextArea.append("Computer Lists: " + "\n" +
                           "------------------------------------" + "\n" +
                           "Computer ID         : " + cpu.getComputer_ID() + "\n" +
                           "Computer Model Code : " + cpu.getComputer_Model_Code()+ "\n" +
                           "Computer Model Name : " + cpu.getComputer_Model_Name() + "\n" +
                           "Computer Name       : " + cpu.getComputer_Name() + "\n" +
                           "Factory             : " + cpu.getFactory() + "\n" +
                           "Computer Brand Code : " + cpu.getComputer_Brand_Code() + "\n" +
                           "Computer Brand Name : " + cpu.getComputer_Brand_Name() + "\n\n");
    }//GEN-LAST:event_showAllDBActionPerformed

    private void computerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerMenuActionPerformed
        FrontPanel.setVisible(false);
        setSize(405, 310);
        setTitle("Computer List");
        Computer.setVisible(true);
    }//GEN-LAST:event_computerMenuActionPerformed

    private void backToMenu_ComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_ComputerActionPerformed
        Computer.setVisible(false);
        dbTextArea.setText(null);
        setSize(350, 150);
        setTitle("Computer Distributor");
        FrontPanel.setVisible(true);
    }//GEN-LAST:event_backToMenu_ComputerActionPerformed

    private void storeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeMenuActionPerformed
        FrontPanel.setVisible(false);
        setSize(405, 310);
        setTitle("Our Stores..");
        
        int s = 1;
        JDBConnector bean = new JDBConnector();
        Store str = bean.getTables_Store();
        storeList.append( "Our Stores: " + "\n" +
                          "------------------------------------" + "\n" +
                          "Store " + s + "\n" +
                          "Store ID   : " + str.getStore_ID() + "\n" +
                          "Store Name : " + str.getStore_Name() + "\n" +
                          "Address    : " + str.getAddress() + ", " + str.getCity_Store() + "\n\n");
        s++;
        Stores.setVisible(true);
    }//GEN-LAST:event_storeMenuActionPerformed

    private void backToMenu_StoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_StoresActionPerformed
        Stores.setVisible(false);
        storeList.setText(null);
        setSize(350, 150);
        setTitle("Computer Distributor");
        FrontPanel.setVisible(true);
    }//GEN-LAST:event_backToMenu_StoresActionPerformed

    private void orderMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderMenuActionPerformed
        FrontPanel.setVisible(false);
        setSize(405, 310);
        setTitle("Your Orders..");
        Orders.setVisible(true);
    }//GEN-LAST:event_orderMenuActionPerformed

    private void backToMenu_OrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenu_OrdersActionPerformed
        Orders.setVisible(false);
        setSize(350, 150);
        setTitle("Computer Distributor");
        FrontPanel.setVisible(true);
    }//GEN-LAST:event_backToMenu_OrdersActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Computer;
    private javax.swing.JPanel FrontPanel;
    private javax.swing.JPanel Orders;
    private javax.swing.JLabel ProgramTitle;
    private javax.swing.JPanel Stores;
    private javax.swing.JButton backToMenu_Computer;
    private javax.swing.JButton backToMenu_Orders;
    private javax.swing.JButton backToMenu_Stores;
    private javax.swing.JButton computerMenu;
    private javax.swing.JTextArea dbTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneStore;
    private javax.swing.JButton orderMenu;
    private javax.swing.JButton showAllDB;
    private javax.swing.JTextArea storeList;
    private javax.swing.JButton storeMenu;
    // End of variables declaration//GEN-END:variables
}
