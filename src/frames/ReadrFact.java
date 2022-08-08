package frames;

import Functions.Fonctions;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ReadrFact extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    final int tranch1 = 4, tranch2 = 6, tranch3 = 10;
    public ReadrFact() {
        initComponents();
    }
    public void Connect(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/facturation","root","");
            //JOptionPane.showMessageDialog(null,"connected");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        compteur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        quantite = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Factures");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("N° Compteur");

        compteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compteurActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantité Consommer");

        quantite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantiteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(65, 240, 21));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Lire a partire d'un fichier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantite, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(compteur, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compteur, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantite, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compteurActionPerformed
        
    }//GEN-LAST:event_compteurActionPerformed

    private void quantiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantiteActionPerformed
       
    }//GEN-LAST:event_quantiteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double qtt = Double.parseDouble(quantite.getText());
        int cpt = Integer.parseInt(compteur.getText());
        
        
        double solde = 0;
        double fihadb = qtt;
        /*if(qtt-4>0){
            solde+=4*tranch1;
        }
        if(qtt-6>20){
            solde+=(20-6)*tranch2;
        }else{
            solde+=(qtt-6)*tranch2;
        }
        if(qtt-20>0){
            solde+=(qtt-20)*tranch3;
        }
        */
        double kantfiha =0;
        try{
            Connect();
            Statement st = con.createStatement();
            //st.setString(1, cpt+"");
            
            rs = st.executeQuery("Select Quantite from facture where NumCpt = " + cpt + " ORDER BY DateFact DESC");
            if(rs.next())
                kantfiha = Double.valueOf(rs.getString("Quantite"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        solde = new Fonctions().solde(fihadb-kantfiha);
        Date d = new Date();
        java.sql.Date date = new java.sql.Date(d.getYear(), d.getMonth(), d.getDate());
        
        System.err.println(date.toString());
        try {
            Connect();
            //Date dat = new Date();
            DecimalFormat df = new DecimalFormat("#.00");
            df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ENGLISH));
            PreparedStatement stmt = con.prepareStatement("INSERT INTO  facture ( RelFact , Quantite ,  DateFact ,  NumCpt ) VALUES(?,?,?,?)");
            stmt.setDouble(1,Double.parseDouble(df.format(solde) ) );
            stmt.setDouble(2, qtt);
            stmt.setString(3, date.toString());
            stmt.setInt(4, cpt);
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", new String[]{"txt"});
        f.setFileFilter(filter);
        //f.setVisible(true);
        int r = f.showOpenDialog(null);
        try {
            Scanner scan = new Scanner(f.getSelectedFile());
            while(scan.hasNext()){
                int cpt = scan.nextInt();
                double qtt = scan.nextDouble();
        
        
                double solde = 0;
                double fihadb = qtt;

                double kantfiha =0;
                try{
                    Connect();
                    Statement st = con.createStatement();
                    //st.setString(1, cpt+"");

                    rs = st.executeQuery("Select Quantite from facture where NumCpt = " + cpt + " ORDER BY DateFact DESC");
                    if(rs.next())
                        kantfiha = Double.valueOf(rs.getString("Quantite"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                solde = new Fonctions().solde(fihadb-kantfiha);
                Date d = new Date();
                java.sql.Date date = new java.sql.Date(d.getYear(), d.getMonth(), d.getDate());

                System.err.println(date.toString());
                try {
                    Connect();
                    //Date dat = new Date();
                    DecimalFormat df = new DecimalFormat("#.00");
                    df.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.ENGLISH));
                    PreparedStatement stmt = con.prepareStatement("INSERT INTO  facture ( RelFact , Quantite ,  DateFact ,  NumCpt ) VALUES(?,?,?,?)");
                    stmt.setDouble(1,Double.parseDouble(df.format(solde) ) );
                    stmt.setDouble(2, qtt);
                    stmt.setString(3, date.toString());
                    stmt.setInt(4, cpt);
                    stmt.execute();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReadrFact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadrFact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadrFact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadrFact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadrFact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField compteur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField quantite;
    // End of variables declaration//GEN-END:variables
}
