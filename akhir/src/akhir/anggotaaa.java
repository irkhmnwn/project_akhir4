/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package akhir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import presisttt.Mahasiswa;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Irkhamnawan
 */
public class anggotaaa extends javax.swing.JPanel {

    /**
     * Creates new form bukuu
     */
    
    ArrayList<Mahasiswa> dataAnggota;
    public anggotaaa() {
        initComponents();
        tampilkan();
    }
    
    private void tampilkan() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("SELECT m FROM Mahasiswa m");
        List<Mahasiswa> results = query.getResultList();
        entityManager.getTransaction().commit();
//        
        DefaultTableModel tbl = (DefaultTableModel) jTable1.getModel();
        tbl.setRowCount(0);
        for(Mahasiswa mhs : results){
            Object[] ob = new Object[8];
            ob[0] = mhs.getIdMahasiswa();
            ob[1] = mhs.getNama();
            ob[2] = mhs.getNim();
            ob[3] = mhs.getProdi();
            ob[4] = mhs.getFakultas();
            ob[5] = mhs.getSemester();
            ob[6] = mhs.getEmail();
            ob[7] = mhs.getAlamat();
            tbl.addRow(ob);
        }
        entityManager.close();        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Mahasiswa", "Nama", "NIM", "Prodi", "Fakultas", "Semester", "Email", "Alamat"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("INPUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "ISBN", "JUDUL", "PENERBIT", "BAHASA", "TAHUN", "JUMLAH" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3)
                        .addGap(40, 40, 40)
                        .addComponent(jButton5)
                        .addGap(13, 13, 13)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inputAnggota ia = new inputAnggota(jTable1);
        ia.setVisible(true);
        tampilkan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
        entityManager.getTransaction().begin();
            Mahasiswa m = entityManager.find(Mahasiswa.class, s);
        entityManager.getTransaction().commit();        
        inputAnggota ia = new inputAnggota(m,jTable1);
        ia.setVisible(true);
        tampilkan();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String s = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
        entityManager.getTransaction().begin();
            Mahasiswa m = entityManager.find(Mahasiswa.class, s);
            entityManager.remove(m);
        entityManager.getTransaction().commit();
        tampilkan();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
        EntityManager entityManager = Persistence.createEntityManagerFactory("akhirPU").createEntityManager();
        entityManager.getTransaction().begin();

        int row = jTable1.getSelectedRow();
        String tabel_klik = (jTable1.getModel().getValueAt(row, 0).toString());

    // Ubah kode di bawah ini untuk mencari data yang diinginkan
    Mahasiswa m = entityManager.find(Mahasiswa.class, tabel_klik);
    if (m != null) {
        String idMahasiswa = m.getIdMahasiswa();
        String nama = m.getNama();
        String nim = m.getNim();
        String prodi = m.getProdi();
        String fakultas = m.getFakultas();
        Integer semester = m.getSemester();
        String email = m.getEmail();
        String alamat = m.getAlamat();
    }

    entityManager.getTransaction().commit();
} catch (Exception e) {
    // Handle exceptions appropriately
}
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            String selection = (String) jComboBox1.getSelectedItem();
            String searchTerm = jTextField1.getText().trim().toLowerCase();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT m FROM Maasiswa m WHERE ";

            switch (selection) {
                case "ID":
                    queryString += "LOWER(m.idMahasiswa) LIKE LOWER(:searchTerm)";
                    break;
                case "NAMA":
                    queryString += "LOWER(m.nama) LIKE LOWER(:searchTerm)";
                    break;
                case "NIM":
                    queryString += "LOWER(m.nim) LIKE LOWER(:searchTerm)";
                    break;
                case "PRODI":
                    queryString += "LOWER(m.prodi) LIKE LOWER(:searchTerm)";
                    break;
                case "FAKULTAS":
                    queryString += "LOWER(m.fakultas) LIKE LOWER(:searchTerm)";
                    break;
                case "SEMESTER":
                    queryString += "LOWER(m.semester) LIKE LOWER(:searchTerm)";
                    break;
                case "EMAIL":
                    queryString += "LOWER(m.email) LIKE LOWER(:searchTerm)";
                    break;
                case "ALAMAT":
                    queryString += "LOWER(m.alamat) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            // Create and execute the JPA query
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("akhirPU");
            EntityManager em = emf.createEntityManager();

            TypedQuery<Mahasiswa> query = em.createQuery(queryString, Mahasiswa.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Mahasiswa> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("ID Anggota");
            dataModel.addColumn("Nama");
            dataModel.addColumn("NIM");
            dataModel.addColumn("Prodi");
            dataModel.addColumn("Fakultas");
            dataModel.addColumn("Semester");
            dataModel.addColumn("Email");
            dataModel.addColumn("Alamat");

            // Add rows to the model
            for (Mahasiswa result : results) {
                Object[] rowData = {
                    result.getIdMahasiswa(),
                    result.getNama(),
                    result.getNim(),
                    result.getProdi(),
                    result.getFakultas(),
                    result.getSemester(),
                    result.getEmail(),
                    result.getAlamat()
                };
                dataModel.addRow(rowData);
            }

            // Set jTable1 with the created model
            jTable1.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String reportPath = "src/akhir/report1.jrxml";
            String selection = ((String) jComboBox1.getSelectedItem());
            String searchTerm = jTextField1.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT m FROM Mahasiswa m WHERE ";

                      switch (jComboBox1.getSelectedIndex()) {
                case 0:
                    queryString += "LOWER(m.idMahasiswa) LIKE LOWER(:searchTerm)";
                    break;
                case 1:
                    queryString += "LOWER(m.nama) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(m.nim) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(m.prodi) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(m.fakultas) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(m.semester) LIKE LOWER(:searchTerm)";
                    break;
                case 6:
                    queryString += "LOWER(m.email) LIKE LOWER(:searchTerm)";
                    break;
                case 7:
                    queryString += "LOWER(m.alamat) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("akhirPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Mahasiswa> cq = cb.createQuery(Mahasiswa.class);
            Root<Mahasiswa> mhs = cq.from(Mahasiswa.class);
            cq.select(mhs);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Mahasiswa> m = em.createQuery(cq);
            List<Mahasiswa> list = m.getResultList();
            Query query = em.createQuery(queryString);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Mahasiswa> results = query.getResultList();
            Map<String,Object> parameter = new HashMap<>();
            parameter.put("querySearch", searchTerm);
            parameter.put("searchBy", selection);
            // Menyiapkan data untuk laporan
            List<Object[]> data = new ArrayList<>();
            for (Mahasiswa result : results) {
                    Object[] rowData = {
                    result.getIdMahasiswa(),
                    result.getNama(),
                    result.getNim(),
                    result.getProdi(),
                    result.getFakultas(),
                    result.getSemester(),
                    result.getEmail(),
                    result.getAlamat()
                        };
                    data.add(rowData);
                }
             em.getTransaction().commit();
           em.close();
            emf.close();

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
   
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);
            
            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
                JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, dataSource);
                JasperViewer viewer = new JasperViewer(print, false);
                viewer.setVisible(true);

        } catch (JRException ex) {
                Logger.getLogger(anggotaaa.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}