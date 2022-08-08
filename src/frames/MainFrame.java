/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Oualid
 */
public class MainFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/facturation","app","root");
            //JOptionPane.showMessageDialog(null,"connected");
        }catch(Exception exception){
            exception.printStackTrace();
        }
    }
    public MainFrame() {
        initComponents();
        Connect();
        table();
    }
    public void table(){
        String[] clients = {"CIN","N° de compteur","NOM","ADRESSE","TELEPHONE"};
        Object[] affiche = new Object[5];
        DefaultTableModel model = new DefaultTableModel(null, clients);
        //TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tab.getModel());
        //tab.setRowSorter(sorter)
        try{
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery("select * from clients order by numCpt");
            while(rs.next()){
                affiche[0] = rs.getString("cin");
                affiche[1] = rs.getString("numCpt");
                affiche[2] = rs.getString("nom");
                affiche[3] = rs.getString("adresse");
                affiche[4] = rs.getString("tele");
                model.addRow(affiche);
                
            }
            tab.setModel(model);
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nord = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        reclamation = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        east = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        recu = new javax.swing.JLabel();
        west = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        center = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Centernord = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CinSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NomClt = new javax.swing.JLabel();
        CinClt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nbrFac = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NCpt = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LF = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sts = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        RelF = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        RelF3 = new javax.swing.JLabel();
        frais = new javax.swing.JLabel();
        totale = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ouiR = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        payer = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        nf = new javax.swing.JLabel();
        RelF4 = new javax.swing.JLabel();
        RelF5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ASSOCIATION AIT EL KHELF ");

        reclamation.setBackground(new java.awt.Color(255, 0, 0));
        reclamation.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        reclamation.setText("Reclamation");
        reclamation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        reclamation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reclamationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reclamationFocusLost(evt);
            }
        });
        reclamation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reclamationActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(78, 234, 84));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Lire les Factures");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(41, 12, 241));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Ajouter un client");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Imprimer Les Factures");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Details d'une facture");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nordLayout = new javax.swing.GroupLayout(nord);
        nord.setLayout(nordLayout);
        nordLayout.setHorizontalGroup(
            nordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nordLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reclamation, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        nordLayout.setVerticalGroup(
            nordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nordLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(nordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reclamation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(nord, java.awt.BorderLayout.PAGE_START);

        east.setBackground(new java.awt.Color(255, 255, 255));
        east.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Reçu de payment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setOpaque(false);

        recu.setBackground(new java.awt.Color(255, 255, 255));
        recu.setOpaque(true);
        jScrollPane5.setViewportView(recu);

        javax.swing.GroupLayout eastLayout = new javax.swing.GroupLayout(east);
        east.setLayout(eastLayout);
        eastLayout.setHorizontalGroup(
            eastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eastLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        eastLayout.setVerticalGroup(
            eastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eastLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(east, java.awt.BorderLayout.LINE_END);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Cin", "N° Compteur", "Adresse", "N° télé"
            }
        ));
        jScrollPane1.setViewportView(tab);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout westLayout = new javax.swing.GroupLayout(west);
        west.setLayout(westLayout);
        westLayout.setHorizontalGroup(
            westLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(westLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        westLayout.setVerticalGroup(
            westLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        getContentPane().add(west, java.awt.BorderLayout.LINE_START);

        center.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        Centernord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("N° de Facture");

        CinSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CinSearchCaretUpdate(evt);
            }
        });
        CinSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CinSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chercher un utilisateur");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Nom");

        NomClt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NomClt.setText("---");

        CinClt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CinClt.setText("---");

        jLabel9.setText("Cin");

        jLabel10.setText("Nombre de Facture");

        nbrFac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nbrFac.setText("---");

        jLabel12.setText("N° Compteur");

        NCpt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NCpt.setText("---");

        jLabel16.setText("Factures");

        LF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LF.setText("---");

        jLabel20.setText("Status");

        sts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sts.setText("---");

        jLabel15.setText("Montant ");

        RelF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RelF.setText("------");

        jLabel17.setText("frais de payement");

        jLabel19.setText("Totale ");

        RelF3.setText("DHs");

        frais.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        frais.setText("1.5 ");

        totale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totale.setText("------");

        jLabel18.setText("Voulez vous un reçu");

        buttonGroup1.add(ouiR);
        ouiR.setSelected(true);
        ouiR.setText("Oui");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Non");

        payer.setText("Payer");
        payer.setEnabled(false);
        payer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payerActionPerformed(evt);
            }
        });

        jLabel11.setText("N° facture");

        nf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nf.setText("---");

        RelF4.setText("DHs");

        RelF5.setText("DHs");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nbrFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NomClt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CinClt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LF, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sts, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(frais, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(RelF3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RelF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RelF4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RelF5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(payer, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(ouiR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomClt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CinClt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbrFac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sts, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RelF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RelF4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RelF3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totale, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RelF5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ouiR)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CenternordLayout = new javax.swing.GroupLayout(Centernord);
        Centernord.setLayout(CenternordLayout);
        CenternordLayout.setHorizontalGroup(
            CenternordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenternordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CenternordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CenternordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CenternordLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CinSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        CenternordLayout.setVerticalGroup(
            CenternordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenternordLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CenternordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CenternordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CinSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(Centernord);

        center.add(jScrollPane4);

        getContentPane().add(center, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reclamationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reclamationFocusGained
        reclamation.setBackground(Color.decode("#E44B2B"));
    }//GEN-LAST:event_reclamationFocusGained

    private void reclamationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reclamationFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_reclamationFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReadrFact R = new ReadrFact();
        R.setLocationRelativeTo(null);
        R.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JTextField  nom = new JTextField(),
                    cin = new JTextField(),
                    adresse = new JTextField(),
                    tele = new JTextField();
        Object objs[] = {new JLabel("Nom :"),nom,new JLabel("Cin : "),cin, new JLabel("Adresse : "), adresse, new JLabel("N° Téléphone"), tele };
        int r = JOptionPane.showOptionDialog(null, objs,"Ajouter un client", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        /*if(nom.getText().compareTo("")==0 || cin.getText().compareTo("")==0 || adresse.getText().compareTo("")==0 || tele.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(null, "Impossible d'ajouter un client avec ses information");
            return;
        }*/
        if(r== JOptionPane.OK_OPTION){
            try{
                Connect();
                PreparedStatement stmt = con.prepareStatement("INSERT INTO  clients ( nom ,  cin ,  adresse ,  tele ) VALUES(?,?,?,?)");
                stmt.setString(1, nom.getText());
                stmt.setString(2, cin.getText());
                stmt.setString(3, adresse.getText());
                stmt.setString(4, tele.getText());
                boolean rs = stmt.execute();
                if(rs){
                    JOptionPane.showMessageDialog(null, "Client Ajouter");
                }
                table();
                con.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void reclamationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reclamationActionPerformed
        Reclamation r = new Reclamation();
        r.setLocationRelativeTo(null);
        r.setVisible(true);
    }//GEN-LAST:event_reclamationActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        java.util.Date d = new java.util.Date();
        if(d.getDate()>0){
            try{
                Connect();
                Statement st = con.createStatement();
                rs = st.executeQuery("SELECT DISTINCT *  FROM clients JOIN facture on clients.numCpt = facture.NumCpt WHERE facture.Status = \"NP\" AND facture.Livred=0 ORDER by clients.numCpt");
                while(rs.next()){
                    Document doc = new Document(PageSize.A4, 50,50,50,50);
                    try {
                        PdfWriter ecraivan = PdfWriter.getInstance(doc, new FileOutputStream(/*"Factures/"+*/rs.getString("nom")+"_"+rs.getString("numCpt")+"_"+rs.getString("numFact")+".pdf"));
                        doc.open();
                        Image logo = Image.getInstance("./src/images/logo.png");
                        logo.setAlignment(Image.ALIGN_CENTER);
                        logo.setWidthPercentage(100);
                        logo.setBorderWidth(10);
                        logo.setBorderColorBottom(BaseColor.BLACK);
                        //doc.add(new Paragraph("<html>A-Ait<br> elkhelf</html>"));
                        doc.add(logo);
                        Paragraph p = new Paragraph("Facture d'EAU potable Pour " + rs.getString("DateFact") , new Font(Font.FontFamily.COURIER,20, 3));
                        p.setAlignment(Paragraph.ALIGN_CENTER);
                        doc.add(p); 
                       
                        Paragraph pnom = new Paragraph();        
                        Chunk c1 = new Chunk("\n\n\n\nNom du client  : " , new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        Chunk c2 = new Chunk(" " + rs.getString("nom") , new Font(Font.FontFamily.COURIER, 20, Font.NORMAL));
                        //Chunk a1 = new Chunk("الإسم : ", new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        pnom.setAlignment(Paragraph.ALIGN_LEFT);
                        pnom.setPaddingTop(0);
                        pnom.add(c1);
                        pnom.add(c2);
                        //pnom.add(a1);
                        doc.add(pnom);
                        Paragraph pcpt = new Paragraph();
                        Chunk c3 = new Chunk("\n\nN° de compteur : " , new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        Chunk c4 = new Chunk(" " + rs.getString("numcpt"), new Font(Font.FontFamily.COURIER, 20, Font.NORMAL));
                        pcpt.add(c3);pcpt.add(c4);
                        doc.add(pcpt);
                        Paragraph pfct = new Paragraph();
                        Chunk c5 = new Chunk("\n\nN° de Facture  : " , new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        Chunk c6 = new Chunk(" " + rs.getString("numFact"), new Font(Font.FontFamily.COURIER, 20, Font.NORMAL));
                        pfct.add(c5);pfct.add(c6);
                        doc.add(pfct);
                        Paragraph pttl = new Paragraph();
                        Chunk c7 = new Chunk("\n\nTotale à payer : " , new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        Chunk c8 = new Chunk(" " + rs.getString("RelFact")+"   DHs", new Font(Font.FontFamily.COURIER, 30, Font.NORMAL));
                        pttl.add(c7);pttl.add(c8);
                        doc.add(pttl);
                        PreparedStatement stmt = con.prepareStatement("UPDATE facture set Livred = 1 where numFact = ? LIMIT 1");
                        stmt.setString(1, rs.getString("numFact"));
                        boolean bool = stmt.execute();
                        Desktop desktop = Desktop.getDesktop();
                        
                        try {
                            //desktop.print(new File("DocXfile.docx"));
                            desktop.open(new File(/*"./Factures/"+*/rs.getString("nom")+"_"+rs.getString("numCpt")+"_"+rs.getString("numFact")+".pdf"));
                        
                        } catch (IOException e) {           
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                    
                    }
                    doc.close();
                }
                
            }catch(Exception ex1){
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "C'est pas le temps des facture. attendez jusqu'a 29eme jour ");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void payerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payerActionPerformed
        String nfact = nf.getText();
        try{
            Connect();
            String sql = "UPDATE  facture  SET  Status ='P' WHERE numFact = "+nfact+"";
            Statement st = con.createStatement();
            boolean e = st.execute(sql);
            //Statement select = con.createStatement();
            Document rec = new Document();
            System.err.println(ouiR.isSelected());
            //rs = select.executeQuery("Select * from * from clients where numCpt  = (select numCpt from facture where numFact ="+nfact+" order  )");
            //if(e){
                
                if(ouiR.isSelected()){
                    try {
                        PdfWriter ecraivan = PdfWriter.getInstance(rec, new FileOutputStream(/*"Factures/"+*/"Reçu_"+nfact+".pdf"));
                        rec.open();
                        Image logo = Image.getInstance("./src/images/logo.png");
                        logo.setAlignment(Image.ALIGN_CENTER);
                        logo.setWidthPercentage(100);
                        logo.setBorderWidth(10);
                        logo.setBorderColorBottom(BaseColor.BLACK);
                        //doc.add(new Paragraph("<html>A-Ait<br> elkhelf</html>"));
                        rec.add(new LineSeparator());
                        rec.add(logo);
                        Paragraph p = new Paragraph("Reçu de payement \n Facture N° " + nf.getText() +"\n\n" , new Font(Font.FontFamily.COURIER,20, 3));
                        p.setAlignment(Paragraph.ALIGN_CENTER);
                        p.setSpacingAfter(TOP_ALIGNMENT);
                        rec.add(p); 
                        rec.add(new LineSeparator());
                        Paragraph pnom = new Paragraph();        
                        Chunk c1 = new Chunk("\n\nNom du client  : " , new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        Chunk c2 = new Chunk(" " + NomClt.getText() , new Font(Font.FontFamily.COURIER, 20, Font.NORMAL));
                        rec.add(c1);rec.add(c2);
                        Chunk c3 = new Chunk("\n\nN° Compteur   : " , new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        Chunk c4 = new Chunk(" " + NCpt.getText() , new Font(Font.FontFamily.COURIER, 20, Font.NORMAL));
                        rec.add(c3);rec.add(c4);
                        Chunk c5 = new Chunk("\n\nDate de facture   : " , new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        Chunk c6 = new Chunk(" " + LF.getText() , new Font(Font.FontFamily.COURIER, 20, Font.NORMAL));
                        rec.add(c5);rec.add(c6);
                        Chunk c7 = new Chunk("\n\nTotale a payer   : " , new Font(Font.FontFamily.COURIER, 20, Font.BOLDITALIC));
                        Chunk c8 = new Chunk(" " + RelF.getText() + " + 1.5 = " + totale.getText() + "DHs" , new Font(Font.FontFamily.COURIER, 20, Font.NORMAL));
                        rec.add(c7);rec.add(c8);
                        SimpleDateFormat ft = 
                        new SimpleDateFormat ("dd/MM/yyyy  HH:mm:ss");
                        Paragraph pd = new Paragraph("\n\n\n" +ft.format(new java.util.Date()) , new Font(Font.FontFamily.COURIER,25, 3));
                        rec.add(pd);
                        //rec.add(new Paragraph("\n\n\n" +ft.format(new java.util.Date()), new Font(Font.FontFamily.COURIER,20, 3))));
                        rec.close();
                        Desktop desktop = Desktop.getDesktop();

                        try {
                            //desktop.print(new File("DocXfile.docx"));
                            desktop.open(new File(/*"./Factures/"+*/"Reçu_"+nfact+".pdf"));

                        } catch (IOException ed) {           
                            ed.printStackTrace();
                        }
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
            //}else{
            //    JOptionPane.showMessageDialog(null, "erreur ");
            //}
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_payerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cin = CinSearch.getText(),
//        ncpt = NCptSearch.getText(),
        sql = "";
        //if(cin.compareTo("")!=0){
            sql = "SELECT * FROM  facture  JOIN clients on facture.NumCpt = clients.numCpt WHERE facture.numFact = "+cin;
        //}else
           // return;
        /*else if(ncpt.compareTo("")!=0){
            sql = "SELECT * FROM  facture  JOIN clients on facture.NumCpt = clients.numCpt WHERE facture.numCpt = "+ ncpt +" ORDER BY facture.DateFact ASC LIMIT 1 ";
        }*/
        try{
            Connect();
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                NomClt.setText(rs.getString("nom")); 
                CinClt.setText(rs.getString("cin")); 
                NCpt.setText(rs.getString("numCpt"));
                nf.setText(rs.getString("numFact")); 
                if(rs.getString("status").compareTo("NP")==0){
                    sts.setText("Non payer");
                    payer.setEnabled(true);
                }else{
                    sts.setText("Payé");
                    payer.setEnabled(false);
                }            
            }else{
                NomClt.setText("");
                CinClt.setText("");
                NCpt.setText("");
                nbrFac.setText("---");
                RelF.setText("---");
                return;
            }
            rs = st.executeQuery("Select *, count(*) as XX from facture where numFact = "+ cin +" and status = 'NP' order by DateFact LIMIT 1");
            String[] facts = new String[10];
            int i =0;
            String rel="";
            if(rs.next()){
                nbrFac.setText(rs.getInt("XX")+"");
                facts[i++] = rs.getString("DateFact");
                rel = rs.getString("RelFact");
                totale.setText((Double.parseDouble(rel)+1.5)+"");
                RelF.setText(rel + "");
            }else{
                nbrFac.setText("---");
                RelF.setText("---");
                return;
            }
            while(rs.next()){
                facts[i] = rs.getString("DateFact");//.toString();
                System.out.println(facts[i]);
                i++;
            }
            String f = "";
            //for(int x=0; x<facts.length;x++){
                //if(facts[x]!=null)
                f+= facts[0] ;
            //}
            LF.setText(f);
            String recuT ="<html><center><h1>Ait elkhelf </h1></center>"
            + "<table><tr>"
            + "<tr><td>Client : </td><td>"+ NomClt.getText()+"</td></tr>"
            + "<tr><td>N° Compteur :</td><td>"+ NCpt.getText()+"</td></tr>"
            + "<td>Date du Facture :</td><td>"+facts[0]+"</td></tr>"
            + "<tr><td>Montant du facture :</td><td>"+rel+"</td></tr>"
            + "<tr><td>Payment : </td><td>Cache</td></tr></table></html>";
            this.recu.setText(recuT);
            //System.out.println(facts[0]);
            /*Statement stmt = con.createStatement();
            rs = stmt.executeQuery("Select * from clients where cin = " + cin + " or numCpt = "+ ncpt);
            NomClt.setText(rs.getString("nom"));
            *
            if(sts.getText().compareTo("Non payer")==0){
                payer.setEnabled(true);
            }else{
                payer.setEnabled(false);
            }*/
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CinSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CinSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CinSearchActionPerformed

    private void CinSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CinSearchCaretUpdate
        if(CinSearch.getText().compareTo("")!=0){
            //NCptSearch.setText("");
        }
    }//GEN-LAST:event_CinSearchCaretUpdate

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed


    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Centernord;
    private javax.swing.JLabel CinClt;
    private javax.swing.JTextField CinSearch;
    private javax.swing.JLabel LF;
    private javax.swing.JLabel NCpt;
    private javax.swing.JLabel NomClt;
    private javax.swing.JLabel RelF;
    private javax.swing.JLabel RelF3;
    private javax.swing.JLabel RelF4;
    private javax.swing.JLabel RelF5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel center;
    private javax.swing.JPanel east;
    private javax.swing.JLabel frais;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel nbrFac;
    private javax.swing.JLabel nf;
    private javax.swing.JPanel nord;
    private javax.swing.JRadioButton ouiR;
    private javax.swing.JButton payer;
    private javax.swing.JButton reclamation;
    private javax.swing.JLabel recu;
    private javax.swing.JLabel sts;
    private javax.swing.JTable tab;
    private javax.swing.JLabel totale;
    private javax.swing.JPanel west;
    // End of variables declaration//GEN-END:variables
}
