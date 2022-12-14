/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Toolkit;

/**
 *
 * @author gmg
 */
public class CalculadoraPertinax extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraPertinax
     */
    public CalculadoraPertinax() {
        initComponents();
        setIconImage();
        txt_espFolha.requestFocus();

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
        lb_espCanaletaPerpend = new javax.swing.JLabel();
        lb_espPertinax = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txt_espLamina = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt_espFolha = new javax.swing.JTextField();
        lb_espCanaletaParale = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(65, 65, 65));

        lb_espCanaletaPerpend.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_espCanaletaPerpend.setForeground(new java.awt.Color(102, 153, 255));
        lb_espCanaletaPerpend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_espCanaletaPerpend.setText("0,00");
        lb_espCanaletaPerpend.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Canaleta Perpendicular", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lb_espPertinax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_espPertinax.setForeground(new java.awt.Color(102, 153, 255));
        lb_espPertinax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_espPertinax.setText("0,00");
        lb_espPertinax.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espessura Pertinax", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(65, 65, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite a Espessura da L??mina", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txt_espLamina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_espLamina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_espLamina.setText("0,70");
        txt_espLamina.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_espLamina.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_espLaminaFocusGained(evt);
            }
        });
        txt_espLamina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_espLaminaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_espLaminaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_espLamina, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_espLamina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(63, 63, 63));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite a Espessura do Cart??o", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txt_espFolha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_espFolha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_espFolha.setText("0,00");
        txt_espFolha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_espFolha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_espFolha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_espFolhaFocusGained(evt);
            }
        });
        txt_espFolha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_espFolhaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_espFolhaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_espFolha, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_espFolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lb_espCanaletaParale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_espCanaletaParale.setForeground(new java.awt.Color(102, 153, 255));
        lb_espCanaletaParale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_espCanaletaParale.setText("0,00");
        lb_espCanaletaParale.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Canaleta Paralela", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addComponent(lb_espCanaletaPerpend, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_espCanaletaParale, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_espPertinax, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lb_espCanaletaPerpend)
                .addGap(1, 1, 1)
                .addComponent(lb_espCanaletaParale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_espPertinax)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_espLaminaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_espLaminaKeyReleased

        if ("".equals(txt_espFolha.getText())) {
            txt_espFolha.setText("0,00");
        }

        float folha = Float.parseFloat(txt_espFolha.getText().replace(",", "."));
        float lamina = Float.parseFloat(txt_espLamina.getText().replace(",", "."));
        float calc_esppertinax = (float) (folha + 0.1);
        float calc_espcanaletaperpend = (float) (1.5 * folha + lamina);
        float calc_espcanaletaparale = (float) (1.3 * folha + lamina);
        lb_espPertinax.setText(String.format("%.2f", calc_esppertinax));
        lb_espCanaletaPerpend.setText(String.format("%.2f", calc_espcanaletaperpend));
        lb_espCanaletaParale.setText(String.format("%.2f", calc_espcanaletaparale));
    }//GEN-LAST:event_txt_espLaminaKeyReleased

    private void txt_espFolhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_espFolhaKeyReleased

        if ("".equals(txt_espLamina.getText())) {
            txt_espLamina.setText("0,00");
        }

        float folha = Float.parseFloat(txt_espFolha.getText().replace(",", "."));
        float lamina = Float.parseFloat(txt_espLamina.getText().replace(",", "."));
        float calc_esppertinax = (float) (folha + 0.1);
        float calc_espcanaletaperpend = (float) (1.5 * folha + lamina);
        float calc_espcanaletaparale = (float) (1.3 * folha + lamina);
        lb_espPertinax.setText(String.format("%.2f", calc_esppertinax));
        lb_espCanaletaPerpend.setText(String.format("%.2f", calc_espcanaletaperpend));
        lb_espCanaletaParale.setText(String.format("%.2f", calc_espcanaletaparale));
    }//GEN-LAST:event_txt_espFolhaKeyReleased

    private void txt_espLaminaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_espLaminaKeyTyped
        String caracteres = "0987654321.,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_espLaminaKeyTyped

    private void txt_espFolhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_espFolhaKeyTyped
        String caracteres = "0987654321.,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_espFolhaKeyTyped

    private void txt_espLaminaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_espLaminaFocusGained
        txt_espLamina.selectAll();
    }//GEN-LAST:event_txt_espLaminaFocusGained

    private void txt_espFolhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_espFolhaFocusGained
        txt_espFolha.selectAll();
    }//GEN-LAST:event_txt_espFolhaFocusGained

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
            java.util.logging.Logger.getLogger(CalculadoraPertinax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPertinax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPertinax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPertinax.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraPertinax().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_espCanaletaParale;
    private javax.swing.JLabel lb_espCanaletaPerpend;
    private javax.swing.JLabel lb_espPertinax;
    private javax.swing.JTextField txt_espFolha;
    private javax.swing.JTextField txt_espLamina;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calculadora.png")));
    }
}
