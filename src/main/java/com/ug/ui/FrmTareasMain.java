/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ug.ui;

import java.awt.Color;

/**
 *
 * @author Luis
 */
public class FrmTareasMain extends javax.swing.JDialog {

    /**
     * Creates new form FrmUserMain
     */
    public FrmTareasMain(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sideMenuBg = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JPanel();
        btnAgregarTxt = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        btnModificarTxt = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        btnEliminarTxt = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        btnRegresarTxt = new javax.swing.JLabel();
        txtNombreModulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTareas = new javax.swing.JTable();
        txtTableTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tareas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideMenuBg.setBackground(new java.awt.Color(62, 88, 121));
        sideMenuBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setBackground(new java.awt.Color(157, 179, 204));

        btnAgregarTxt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnAgregarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarTxt.setText("Agregar");
        btnAgregarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarTxtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarTxtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
                btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgregarTxt, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE));
        btnAgregarLayout.setVerticalGroup(
                btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgregarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));

        sideMenuBg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 190, 30));

        btnModificar.setBackground(new java.awt.Color(157, 179, 204));

        btnModificarTxt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnModificarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificarTxt.setText("Modificar");
        btnModificarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarTxtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarTxtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
                btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnModificarTxt, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE));
        btnModificarLayout.setVerticalGroup(
                btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnModificarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));

        sideMenuBg.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, 30));

        btnEliminar.setBackground(new java.awt.Color(157, 179, 204));

        btnEliminarTxt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEliminarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarTxt.setText("Eliminar");
        btnEliminarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarTxtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarTxtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
                btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEliminarTxt, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE));
        btnEliminarLayout.setVerticalGroup(
                btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEliminarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));

        sideMenuBg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, 30));

        btnRegresar.setBackground(new java.awt.Color(157, 179, 204));

        btnRegresarTxt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRegresarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresarTxt.setText("Regresar");
        btnRegresarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarTxtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarTxtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
                btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRegresarTxt, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE));
        btnRegresarLayout.setVerticalGroup(
                btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRegresarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));

        sideMenuBg.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 190, 30));

        txtNombreModulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNombreModulo.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreModulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombreModulo.setText("Módulo Tareas");
        sideMenuBg.add(txtNombreModulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 40, 280, -1));

        bg.add(sideMenuBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 450));

        tblTareas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTareas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        tblTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblTareas);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 550, 340));

        txtTableTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTableTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTableTitle.setText("Registros actuales");
        txtTableTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        bg.add(txtTableTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarTxtMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAgregarTxtMouseEntered
        // color resalte
        btnAgregar.setBackground(new Color(185, 201, 219));
    }// GEN-LAST:event_btnAgregarTxtMouseEntered

    private void btnAgregarTxtMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAgregarTxtMouseExited
        // reestablecer color original
        btnAgregar.setBackground(new Color(157, 179, 204));
        btnAgregarTxt.setForeground(Color.black);
    }// GEN-LAST:event_btnAgregarTxtMouseExited

    private void btnModificarTxtMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnModificarTxtMouseEntered
        btnModificar.setBackground(new Color(185, 201, 219));
    }// GEN-LAST:event_btnModificarTxtMouseEntered

    private void btnModificarTxtMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnModificarTxtMouseExited
        // reestablecer color original
        btnModificar.setBackground(new Color(157, 179, 204));
    }// GEN-LAST:event_btnModificarTxtMouseExited

    private void btnEliminarTxtMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnEliminarTxtMouseEntered
        btnEliminar.setBackground(new Color(185, 201, 219));
    }// GEN-LAST:event_btnEliminarTxtMouseEntered

    private void btnEliminarTxtMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnEliminarTxtMouseExited
        // reestablecer color original
        btnEliminar.setBackground(new Color(157, 179, 204));
    }// GEN-LAST:event_btnEliminarTxtMouseExited

    private void btnRegresarTxtMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnRegresarTxtMouseEntered
        btnRegresar.setBackground(new Color(185, 201, 219));
    }// GEN-LAST:event_btnRegresarTxtMouseEntered

    private void btnRegresarTxtMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnRegresarTxtMouseExited
        // reestablecer color original
        btnRegresar.setBackground(new Color(157, 179, 204));
    }// GEN-LAST:event_btnRegresarTxtMouseExited

    private void btnAgregarTxtMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAgregarTxtMouseClicked
        boolean ParaAgregar = true; // llamar a la versión de frm agregar

        FrmAddEditTarea frm = new FrmAddEditTarea(this, true, ParaAgregar);
        frm.setVisible(true);
    }// GEN-LAST:event_btnAgregarTxtMouseClicked

    private void btnModificarTxtMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnModificarTxtMouseClicked
        boolean ParaAgregar = false; // llamar a la versión de frm modificar

        FrmAddEditTarea frm = new FrmAddEditTarea(this, true, ParaAgregar);
        frm.setVisible(true);
    }// GEN-LAST:event_btnModificarTxtMouseClicked

    private void btnEliminarTxtMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnEliminarTxtMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_btnEliminarTxtMouseClicked

    private void btnRegresarTxtMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnRegresarTxtMouseClicked

        this.dispose();
    }// GEN-LAST:event_btnRegresarTxtMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnAgregar;
    private javax.swing.JLabel btnAgregarTxt;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JLabel btnEliminarTxt;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JLabel btnModificarTxt;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel btnRegresarTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel sideMenuBg;
    private javax.swing.JTable tblTareas;
    private javax.swing.JLabel txtNombreModulo;
    private javax.swing.JLabel txtTableTitle;
    // End of variables declaration//GEN-END:variables
}
