/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeoncrawler;

import static java.lang.Math.random;
import java.util.Random;

public class Combat extends javax.swing.JFrame {

    public static int Level = 1;
    public static int PlayerHP = 100;
    public static int EnemyHP = 1;
    public static int block = 0;
    public static int EnemyDead = 0;
    public static int EnemyDMG = 4;

    public Combat() {
        initComponents();

        Slash.setVisible(false);
        Block.setVisible(false);
        helmetGoblin.setVisible(false);
        Display.setVisible(false);
        GoblinWizard.setVisible(false);
        Wizard.setVisible(false);
        Wolf.setVisible(false);
        EvilWizard.setVisible(false);
        Win.setVisible(false);

//        String filepath = "\"D:\\coding college\\DungeonCrawler\\2019-01-02_-_8_Bit_Menu_-_David_Renda_-_FesliyanStudios.com.wav\"";
//        music musicObject = new music();
//        musicObject.playMusic(filepath);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helmetGoblin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        XPlevel = new javax.swing.JTextField();
        PlayerHealth = new javax.swing.JTextField();
        EnemyHealth = new javax.swing.JTextField();
        welcome = new javax.swing.JLabel();
        Battle = new javax.swing.JButton();
        Slash = new javax.swing.JButton();
        Display = new javax.swing.JLabel();
        Block = new javax.swing.JButton();
        EvilWizard = new javax.swing.JLabel();
        ETaken = new javax.swing.JLabel();
        GoblinWizard = new javax.swing.JLabel();
        Wizard = new javax.swing.JLabel();
        Wolf = new javax.swing.JLabel();
        Win = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PTaken = new javax.swing.JLabel();
        Ptaken = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        helmetGoblin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dungeoncrawler/helmetgoblin.jpg"))); // NOI18N
        getContentPane().add(helmetGoblin);
        helmetGoblin.setBounds(1680, 550, 300, 230);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dungeoncrawler/skulldude.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 530, 280, 260);

        XPlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XPlevelActionPerformed(evt);
            }
        });
        getContentPane().add(XPlevel);
        XPlevel.setBounds(40, 40, 73, 24);

        PlayerHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerHealthActionPerformed(evt);
            }
        });
        getContentPane().add(PlayerHealth);
        PlayerHealth.setBounds(10, 780, 230, 24);

        EnemyHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnemyHealthActionPerformed(evt);
            }
        });
        getContentPane().add(EnemyHealth);
        EnemyHealth.setBounds(1680, 780, 220, 24);

        welcome.setText("Welcome to the Dungeon");
        getContentPane().add(welcome);
        welcome.setBounds(850, 800, 150, 16);

        Battle.setText("Battle");
        Battle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BattleActionPerformed(evt);
            }
        });
        getContentPane().add(Battle);
        Battle.setBounds(870, 830, 90, 32);

        Slash.setText("Slash");
        Slash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlashActionPerformed(evt);
            }
        });
        getContentPane().add(Slash);
        Slash.setBounds(750, 830, 80, 32);
        getContentPane().add(Display);
        Display.setBounds(770, 870, 290, 16);

        Block.setText("Block");
        Block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockActionPerformed(evt);
            }
        });
        getContentPane().add(Block);
        Block.setBounds(1002, 830, 80, 32);

        EvilWizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dungeoncrawler/evil wizard.jpg"))); // NOI18N
        EvilWizard.setText("jLabel2");
        getContentPane().add(EvilWizard);
        EvilWizard.setBounds(1680, 530, 220, 250);
        getContentPane().add(ETaken);
        ETaken.setBounds(1760, 820, 50, 20);

        GoblinWizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dungeoncrawler/goblin wizard.jpg"))); // NOI18N
        getContentPane().add(GoblinWizard);
        GoblinWizard.setBounds(1680, 520, 250, 290);

        Wizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dungeoncrawler/wizard.jpg"))); // NOI18N
        Wizard.setText("jLabel2");
        getContentPane().add(Wizard);
        Wizard.setBounds(1680, 530, 230, 270);

        Wolf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dungeoncrawler/wolf.jpg"))); // NOI18N
        Wolf.setText("jLabel4");
        getContentPane().add(Wolf);
        Wolf.setBounds(1680, 560, 220, 270);

        Win.setText(" YOU WIN");
        Win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WinActionPerformed(evt);
            }
        });
        getContentPane().add(Win);
        Win.setBounds(890, 180, 73, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dungeoncrawler/Dungeon Room.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1935, 778);
        getContentPane().add(PTaken);
        PTaken.setBounds(100, 810, 0, 0);
        getContentPane().add(Ptaken);
        Ptaken.setBounds(90, 810, 60, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnemyHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnemyHealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnemyHealthActionPerformed

    private void BattleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BattleActionPerformed
        Random random = new Random();
        Ptaken.setVisible(false);
        ETaken.setVisible(false);
        int min1 = 1;
        int max1 = 5;
        int WhichEnemy = random.nextInt((max1 - min1) + 1) + min1;
        if (EnemyDead <= 10) {
            if (WhichEnemy == 1) {
                helmetGoblin.setVisible(true);
            } else if (WhichEnemy == 2) {
                GoblinWizard.setVisible(true);
            } else if (WhichEnemy == 3) {
                Wizard.setVisible(true);
            } else if (WhichEnemy == 4) {
                Wolf.setVisible(true);
            } else if (WhichEnemy == 5) {
                EvilWizard.setVisible(true);
            }

            if (PlayerHP <= 100) {
                int min = 8;
                int max = 20;
                int EnemyHP2 = random.nextInt((max - min) + 1) + min;
                EnemyHP = EnemyHP + EnemyHP2;
                EnemyHealth.setText("Enemy Health = " + EnemyHP);

            } 
            
            PlayerHealth.setText("Health = " + PlayerHP);
            XPlevel.setText("Level = " + Level);
            welcome.setText("               Attack!");
            Battle.setVisible(false);
            Slash.setVisible(true);
            Block.setVisible(true);

        }else{
           Win.setVisible(true);
           
        }
    }//GEN-LAST:event_BattleActionPerformed

    private void XPlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XPlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XPlevelActionPerformed

    private void SlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlashActionPerformed
        Random random = new Random();
        Ptaken.setVisible(true);
        ETaken.setVisible(true);
        int SlashDMG = 8;
        int min = 0;
        int max = 5;
        int Crit = random.nextInt((max - min) + 1) + min;
        if (Crit == 2) {
            SlashDMG = SlashDMG * 2;
            
            Display.setVisible(true);
            Display.setText("              Critical hit!");

        } else {
        }

        EnemyHP = EnemyHP - SlashDMG;
        EnemyHealth.setText("Enemy Health = " + EnemyHP);
        ETaken.setText("- " + SlashDMG);
        if (EnemyHP <= 0) {
            EnemyHealth.setText("Enemy Health = " + 0);

            EnemyDead = EnemyDead + 1;
            helmetGoblin.setVisible(false);
            Slash.setVisible(false);
            Block.setVisible(false);
            Battle.setVisible(true);
            Display.setVisible(false);
            GoblinWizard.setVisible(false);
            Wizard.setVisible(false);
            Wolf.setVisible(false);
            EvilWizard.setVisible(false);
            
            Level = Level+1;
       
        }else{
            
           PlayerHP = PlayerHP - EnemyDMG; 
           PlayerHealth.setText("Health = "+ PlayerHP);
           Ptaken.setText("- " + EnemyDMG);
        }
        
        
        
        

    }//GEN-LAST:event_SlashActionPerformed

    private void BlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockActionPerformed
        Display.setVisible(true);
        block = 1;
        Display.setText("THE ENEMIES NEXT ATTACK WILL BE BLOCKED!");

    }//GEN-LAST:event_BlockActionPerformed

    private void WinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WinActionPerformed

    private void PlayerHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerHealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayerHealthActionPerformed

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
            java.util.logging.Logger.getLogger(Combat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Battle;
    private javax.swing.JButton Block;
    private javax.swing.JLabel Display;
    private javax.swing.JLabel ETaken;
    private javax.swing.JTextField EnemyHealth;
    private javax.swing.JLabel EvilWizard;
    private javax.swing.JLabel GoblinWizard;
    private javax.swing.JLabel PTaken;
    private javax.swing.JTextField PlayerHealth;
    private javax.swing.JLabel Ptaken;
    private javax.swing.JButton Slash;
    private javax.swing.JTextField Win;
    private javax.swing.JLabel Wizard;
    private javax.swing.JLabel Wolf;
    private javax.swing.JTextField XPlevel;
    private javax.swing.JLabel helmetGoblin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
