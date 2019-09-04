/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematical;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author Viets
 */
public class Main extends javax.swing.JFrame {

    private int a, b, c, countdown, point, checkquest;
    private Timer time;
    private boolean gameOver = true;

    /**
     * Creates new form Main
     */
    public Main() {
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
        jLabel2 = new javax.swing.JLabel();
        Progress = new javax.swing.JProgressBar();
        yes_btn = new javax.swing.JButton();
        no_btn = new javax.swing.JButton();
        start_btn = new javax.swing.JButton();
        question_lb = new javax.swing.JLabel();
        point_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ben-Math");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setResizable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mathematical");

        yes_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yes_btn.setForeground(new java.awt.Color(0, 0, 204));
        yes_btn.setText("Yes");
        yes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes_btnActionPerformed(evt);
            }
        });

        no_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        no_btn.setForeground(new java.awt.Color(255, 0, 0));
        no_btn.setText("No");
        no_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_btnActionPerformed(evt);
            }
        });

        start_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        start_btn.setText("START");
        start_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_btnActionPerformed(evt);
            }
        });

        question_lb.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        question_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_lb.setText("Question");

        point_lb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        point_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        point_lb.setText("Point: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(question_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(start_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(yes_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(no_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(point_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(point_lb)
                .addGap(18, 18, 18)
                .addComponent(question_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yes_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(start_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_btnActionPerformed
        gameOver = false;
        load();
        question_lb.setForeground(Color.BLACK);
        countdown = 100;
        point = 0;
        time = new Timer(50, new loadtime());
        time.start();
    }//GEN-LAST:event_start_btnActionPerformed

    private void no_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_btnActionPerformed
        if( !gameOver ){
            if(a - b != c){
                load();
                point ++;
                point_lb.setText("Point: " + point );
                countdown = 100;
                time.start();
            } else {
                gameOver = true;
                question_lb.setText("Lose!");
                question_lb.setForeground(Color.red);
            }
        }
        
    }//GEN-LAST:event_no_btnActionPerformed

    private void yes_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes_btnActionPerformed
        if( !gameOver ){
            if(a - b == c){
                load();
                point ++;
                point_lb.setText("Point: " + point );
                countdown = 100;
                time.start();
            } else {
                gameOver = true;
                question_lb.setText("Lose!");
                question_lb.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_yes_btnActionPerformed

    public void load(){
        Random rd = new Random();
        a = rd.nextInt(100) + 1;
        b = rd.nextInt(a);
        checkquest = rd.nextInt(5);
        if(checkquest % 2 == 0){
            c = a - b;
        }else{
            c = rd.nextInt(100);
        }
        question_lb.setText(a + " - " + b + " = " + c);
    }

    private void setIconImage(String iconpng) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public class loadtime implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(countdown > 0){
                countdown --;
                if(gameOver){
                    Progress.setValue(0);
                }else{
                    Progress.setValue(countdown);
                }
                
            }else{
                question_lb.setText("Lose!");
                question_lb.setForeground(Color.red);
            }
        }
        
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progress;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton no_btn;
    private javax.swing.JLabel point_lb;
    private javax.swing.JLabel question_lb;
    private javax.swing.JButton start_btn;
    private javax.swing.JButton yes_btn;
    // End of variables declaration//GEN-END:variables
}
