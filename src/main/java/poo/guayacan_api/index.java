/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo.guayacan_api;

/**
 *
 * @author Diego Condemarin
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_clientes = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_estoque = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_usuarios = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_produtos = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_projetos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 228, 228));
        setPreferredSize(new java.awt.Dimension(1800, 900));
        setSize(new java.awt.Dimension(900, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 770, 750, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());

        btn_clientes.setBackground(new java.awt.Color(139, 61, 255));
        btn_clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/guayacan_api/imagem/icons8_people_30px.png"))); // NOI18N
        btn_clientes.setText("CLIENTES");
        jPanel4.add(btn_clientes, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 70));

        jPanel5.setBackground(new java.awt.Color(95, 95, 95));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        btn_estoque.setBackground(new java.awt.Color(139, 61, 255));
        btn_estoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/guayacan_api/imagem/icons8_trolley_30px.png"))); // NOI18N
        btn_estoque.setText("ESTOQUE");
        jPanel5.add(btn_estoque, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 200, 70));

        jPanel6.setBackground(new java.awt.Color(95, 95, 95));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new java.awt.BorderLayout());

        btn_usuarios.setBackground(new java.awt.Color(139, 61, 255));
        btn_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/guayacan_api/imagem/icons8_contact_30px_1.png"))); // NOI18N
        btn_usuarios.setText("USUARIOS");
        jPanel6.add(btn_usuarios, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 200, 70));

        jPanel7.setBackground(new java.awt.Color(95, 95, 95));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.BorderLayout());

        btn_produtos.setBackground(new java.awt.Color(139, 61, 255));
        btn_produtos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/guayacan_api/imagem/icons8_idea_sharing_30px.png"))); // NOI18N
        btn_produtos.setText("PRODUTOS");
        jPanel7.add(btn_produtos, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 200, 70));

        jPanel8.setBackground(new java.awt.Color(95, 95, 95));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new java.awt.BorderLayout());

        btn_projetos.setBackground(new java.awt.Color(139, 61, 255));
        btn_projetos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_projetos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/guayacan_api/imagem/icons8_choice_30px.png"))); // NOI18N
        btn_projetos.setText("PROJETOS");
        btn_projetos.setAlignmentY(0.8F);
        jPanel8.add(btn_projetos, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 200, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/guayacan_api/imagem/Guayacan 300px.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(600, 182));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 200, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 110));

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));
        jPanel2.setForeground(new java.awt.Color(228, 228, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(228, 228, 228));
        jTextField1.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(143, 143, 143));
        jTextField1.setText("Clientes");
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nome ", "Endere??o", "CPF", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 930, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1430, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_clientes;
    private javax.swing.JLabel btn_estoque;
    private javax.swing.JLabel btn_produtos;
    private javax.swing.JLabel btn_projetos;
    private javax.swing.JLabel btn_usuarios;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
