/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg36b.pkgfinal;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SelfServe {

    public static void main(String args[]) {
        // tries to set the program to Nimbus font
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelfServe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelfServe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelfServe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelfServe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
}

class GUI extends JFrame {

    private boolean userOption;
    ArrayList<Items> list = new ArrayList<>();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        start = new JPanel();
        jPanel5 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jPanel6 = new JPanel();
        jLabel4 = new JLabel();
        jLabel7 = new JLabel();
        options = new JPanel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel1 = new JLabel();
        jLabel8 = new JLabel();
        jPanel8 = new JPanel();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
        menu = new JPanel();
        menu_header = new JPanel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jPanel3 = new JPanel();
        jPanel1 = new JPanel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        burger_maker = new JPanel();
        jLabel18 = new JLabel();
        jLabel17 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jCheckBox1 = new JCheckBox();
        jCheckBox2 = new JCheckBox();
        jCheckBox3 = new JCheckBox();
        jCheckBox4 = new JCheckBox();
        jCheckBox5 = new JCheckBox();
        jButton3 = new JButton();
        sides = new JPanel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel28 = new JLabel();
        jCheckBox6 = new JCheckBox();
        jCheckBox8 = new JCheckBox();
        jCheckBox10 = new JCheckBox();
        jButton4 = new JButton();
        cart_list = new JPanel();
        jLabel48 = new JLabel();
        jButton7 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        final_stage = new JPanel();
        jLabel47 = new JLabel();
        jLabel51 = new JLabel();
        payment = new JPanel();
        jLabel40 = new JLabel();
        jButton6 = new JButton();
        jLabel41 = new JLabel();
        jLabel42 = new JLabel();
        jLabel45 = new JLabel();
        jButton8 = new JButton();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jLabel43 = new JLabel();
        jLabel44 = new JLabel();
        beverages = new JPanel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jCheckBox7 = new JCheckBox();
        jCheckBox9 = new JCheckBox();
        jCheckBox11 = new JCheckBox();
        jButton5 = new JButton();
        jLabel33 = new JLabel();
        jLabel34 = new JLabel();
        jLabel35 = new JLabel();
        jLabel36 = new JLabel();
        jCheckBox12 = new JCheckBox();
        jCheckBox13 = new JCheckBox();
        jCheckBox14 = new JCheckBox();
        jCheckBox15 = new JCheckBox();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Burger Place Self Serve");
        setBackground(new java.awt.Color(32, 47, 90));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 500));

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));
        jPanel2.setLayout(new java.awt.CardLayout());

        start.setBackground(new java.awt.Color(0, 18, 50));
        start.setForeground(new java.awt.Color(0, 18, 50));

        jPanel5.setBackground(new java.awt.Color(0, 18, 50));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("CLICK TO START");

        jLabel3.setIcon(new ImageIcon(getClass().getResource("burger_logo.png"))); // NOI18N

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(32, 47, 90));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("BURGER PLACE");

        jLabel7.setIcon(new ImageIcon(getClass().getResource("burger_meal.png"))); // NOI18N

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(193, 193, 193))
        );

        jLabel4.getAccessibleContext().setAccessibleName("");

        GroupLayout startLayout = new GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(start, "card4");

        options.setBackground(new java.awt.Color(32, 47, 90));

        jLabel5.setIcon(new ImageIcon(getClass().getResource("to_go.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new ImageIcon(getClass().getResource("burger_meal.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Eat In");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Take Out");

        jPanel8.setBackground(new java.awt.Color(0, 18, 50));

        jLabel31.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 204, 0));
        jLabel31.setText("Burger Place Menu");

        jLabel32.setIcon(new ImageIcon(getClass().getResource("burger_logo.png"))); // NOI18N

        GroupLayout jPanel8Layout = new GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel32)
                .addGap(35, 35, 35)
                .addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
        );

        GroupLayout optionsLayout = new GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addComponent(jLabel8))
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addComponent(jLabel5))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(optionsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(optionsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jPanel2.add(options, "card3");

        menu.setBackground(new java.awt.Color(32, 47, 90));

        menu_header.setBackground(new java.awt.Color(0, 18, 50));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("Burger Place Menu");

        jLabel10.setIcon(new ImageIcon(getClass().getResource("burger_logo.png"))); // NOI18N

        GroupLayout menu_headerLayout = new GroupLayout(menu_header);
        menu_header.setLayout(menu_headerLayout);
        menu_headerLayout.setHorizontalGroup(
            menu_headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menu_headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_headerLayout.setVerticalGroup(
            menu_headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menu_headerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(menu_headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(32, 47, 90));

        jLabel11.setIcon(new ImageIcon(getClass().getResource("beverages_menu.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new ImageIcon(getClass().getResource("sides_menu.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new ImageIcon(getClass().getResource("burger_menu.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setText("Beverages");

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setText("Burgers");

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 0));
        jLabel16.setText("Sides");

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("DONE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setText("CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel15)
                .addGap(97, 97, 97)
                .addComponent(jLabel16)
                .addGap(95, 95, 95)
                .addComponent(jLabel14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addComponent(jLabel11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.add(jPanel1, "card3");

        burger_maker.setBackground(new java.awt.Color(32, 47, 90));

        jLabel18.setIcon(new ImageIcon(getClass().getResource("cheese.png"))); // NOI18N
        jLabel18.setText("jLabel18");

        jLabel17.setIcon(new ImageIcon(getClass().getResource("lettuce.png"))); // NOI18N
        jLabel17.setText("jLabel17");

        jLabel19.setIcon(new ImageIcon(getClass().getResource("pickle.png"))); // NOI18N
        jLabel19.setText("jLabel19");

        jLabel20.setIcon(new ImageIcon(getClass().getResource("tomato.png"))); // NOI18N
        jLabel20.setText("jLabel20");

        jLabel21.setIcon(new ImageIcon(getClass().getResource("onion.png"))); // NOI18N
        jLabel21.setText("jLabel21");

        jLabel22.setBackground(new java.awt.Color(255, 204, 0));
        jLabel22.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 204, 0));
        jLabel22.setText("$2 Burger and $0.10 each Condiment");

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout burger_makerLayout = new GroupLayout(burger_maker);
        burger_maker.setLayout(burger_makerLayout);
        burger_makerLayout.setHorizontalGroup(
            burger_makerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(burger_makerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel22, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
            .addGroup(burger_makerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jCheckBox5)
                .addGap(42, 42, 42)
                .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jCheckBox4)
                .addGap(42, 42, 42)
                .addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
            .addGroup(burger_makerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jCheckBox3)
                .addGap(32, 32, 32)
                .addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jCheckBox2)
                .addGap(42, 42, 42)
                .addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
            .addGroup(burger_makerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jCheckBox1)
                .addGap(22, 22, 22)
                .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
        );
        burger_makerLayout.setVerticalGroup(
            burger_makerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(burger_makerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel22, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGroup(burger_makerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addGroup(burger_makerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(burger_makerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox4))))
                .addGap(6, 6, 6)
                .addGroup(burger_makerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(burger_makerLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jCheckBox3))
                    .addComponent(jLabel19)
                    .addGroup(burger_makerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jCheckBox2))
                    .addComponent(jLabel20))
                .addGap(26, 26, 26)
                .addGroup(burger_makerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(burger_makerLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jCheckBox1))
                    .addComponent(jLabel17)
                    .addGroup(burger_makerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))))
        );

        jPanel3.add(burger_maker, "card3");

        sides.setBackground(new java.awt.Color(32, 47, 90));

        jLabel23.setIcon(new ImageIcon(getClass().getResource("onion-rings.png"))); // NOI18N
        jLabel23.setText("jLabel18");

        jLabel24.setIcon(new ImageIcon(getClass().getResource("salad.png"))); // NOI18N
        jLabel24.setText("jLabel17");

        jLabel25.setIcon(new ImageIcon(getClass().getResource("fries.png"))); // NOI18N
        jLabel25.setText("jLabel19");

        jLabel28.setBackground(new java.awt.Color(255, 204, 0));
        jLabel28.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 204, 0));
        jLabel28.setText("$1.50 Each");

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        GroupLayout sidesLayout = new GroupLayout(sides);
        sides.setLayout(sidesLayout);
        sidesLayout.setHorizontalGroup(
            sidesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(sidesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
            .addGroup(sidesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jCheckBox10)
                .addGap(42, 42, 42)
                .addComponent(jLabel23, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jCheckBox6)
                .addGap(52, 52, 52)
                .addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
            .addGroup(sidesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jCheckBox8)
                .addGap(32, 32, 32)
                .addComponent(jLabel25, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        );
        sidesLayout.setVerticalGroup(
            sidesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(sidesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGroup(sidesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addGroup(sidesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(sidesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox6))))
                .addGap(6, 6, 6)
                .addGroup(sidesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(sidesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jCheckBox8))
                    .addComponent(jLabel25)
                    .addGroup(sidesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
        );

        jPanel3.add(sides, "card3");

        cart_list.setBackground(new java.awt.Color(32, 47, 90));

        jLabel48.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 204, 0));
        jLabel48.setText("Cart:");

        jButton7.setBackground(new java.awt.Color(255, 204, 0));
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
		jTextArea1.setBackground(new java.awt.Color(32, 47, 90));
		jTextArea1.setForeground(new java.awt.Color(255, 204, 0));
		jScrollPane1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        GroupLayout cart_listLayout = new GroupLayout(cart_list);
        cart_list.setLayout(cart_listLayout);
        cart_listLayout.setHorizontalGroup(
            cart_listLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(cart_listLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cart_listLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)))
            .addGroup(cart_listLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        );
        cart_listLayout.setVerticalGroup(
            cart_listLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(cart_listLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(cart_listLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGroup(cart_listLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(cart_list, "card3");

        final_stage.setBackground(new java.awt.Color(32, 47, 90));

        jLabel47.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 204, 0));
        jLabel47.setText("Come again soon!");

        jLabel51.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 204, 0));
        jLabel51.setText("Thank You for your Order!");

        GroupLayout final_stageLayout = new GroupLayout(final_stage);
        final_stage.setLayout(final_stageLayout);
        final_stageLayout.setHorizontalGroup(
            final_stageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(final_stageLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(final_stageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)))
        );
        final_stageLayout.setVerticalGroup(
            final_stageLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(final_stageLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel51, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel47, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(final_stage, "card3");

        payment.setBackground(new java.awt.Color(32, 47, 90));

        jLabel40.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 204, 0));

        jButton6.setBackground(new java.awt.Color(255, 204, 0));
        jButton6.setText("PLACE ORDER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 204, 0));
        jLabel41.setText("3 Digits:");

        jLabel42.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 204, 0));
        jLabel42.setText("Expiration:");

        jLabel45.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 204, 0));
        jLabel45.setText("Payment:");

        jButton8.setBackground(new java.awt.Color(255, 204, 0));
        jButton8.setText("BACK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 204, 0));
        jLabel43.setText("Credit Card Number:");

        jLabel44.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 204, 0));
        jLabel44.setText("Total:");

        GroupLayout paymentLayout = new GroupLayout(payment);
        payment.setLayout(paymentLayout);
        paymentLayout.setHorizontalGroup(
            paymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel45, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel43, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel42, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel41, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel44, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel40, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        );
        paymentLayout.setVerticalGroup(
            paymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel45, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(paymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGroup(paymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGroup(paymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGroup(paymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(paymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.add(payment, "card3");

        beverages.setBackground(new java.awt.Color(32, 47, 90));

        jLabel26.setIcon(new ImageIcon(getClass().getResource("coke.png"))); // NOI18N
        jLabel26.setText("jLabel18");

        jLabel27.setIcon(new ImageIcon(getClass().getResource("mtndew.png"))); // NOI18N
        jLabel27.setText("jLabel17");

        jLabel29.setIcon(new ImageIcon(getClass().getResource("drpepper.png"))); // NOI18N
        jLabel29.setText("jLabel19");

        jLabel30.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 204, 0));
        jLabel30.setText("$1.00 Each");

        jButton5.setBackground(new java.awt.Color(255, 204, 0));
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel33.setIcon(new ImageIcon(getClass().getResource("shake.png"))); // NOI18N
        jLabel33.setText("jLabel17");

        jLabel34.setIcon(new ImageIcon(getClass().getResource("water.png"))); // NOI18N
        jLabel34.setText("jLabel17");

        jLabel35.setIcon(new ImageIcon(getClass().getResource("fanta.png"))); // NOI18N
        jLabel35.setText("jLabel17");

        jLabel36.setIcon(new ImageIcon(getClass().getResource("sprite.png"))); // NOI18N
        jLabel36.setText("jLabel17");

        GroupLayout beveragesLayout = new GroupLayout(beverages);
        beverages.setLayout(beveragesLayout);
        beveragesLayout.setHorizontalGroup(
            beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(beveragesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
            .addGroup(beveragesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jCheckBox15)
                .addGap(12, 12, 12)
                .addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel36, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox12))
                .addGap(40, 40, 40)
                .addComponent(jCheckBox13)
                .addGap(2, 2, 2)
                .addComponent(jLabel33, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
            .addGroup(beveragesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jCheckBox9)
                .addGap(12, 12, 12)
                .addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
            .addGroup(beveragesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jCheckBox7)
                .addGap(12, 12, 12)
                .addComponent(jLabel35, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel34, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox14)))
        );
        beveragesLayout.setVerticalGroup(
            beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(beveragesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel30, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGroup(beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jCheckBox15))
                    .addComponent(jLabel26)
                    .addComponent(jLabel36)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jCheckBox12))
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jCheckBox13))
                    .addComponent(jLabel33))
                .addGap(6, 6, 6)
                .addGroup(beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jCheckBox9))
                    .addComponent(jLabel29)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jCheckBox11))
                    .addComponent(jLabel27)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addGroup(beveragesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(beveragesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox14)))))
        );

        jPanel3.add(beverages, "card3");

        GroupLayout menuLayout = new GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menu_header, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(menu_header, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(menu, "card2");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
		
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // cart button
            jPanel3.removeAll();
            jPanel3.add(cart_list);
            jPanel3.repaint();
            jPanel3.revalidate();
            //will create the list

            //removes everything from the arraylist
            list.removeAll(list);
            jTextArea1.setText("");

            if (jCheckBox5.isSelected()) list.add(new Items("Cheese", 0.10));
            if (jCheckBox3.isSelected()) list.add(new Items("Pickles", 0.10));          
            if (jCheckBox1.isSelected()) list.add(new Items("Lettuce", 0.10));
            if (jCheckBox4.isSelected()) list.add(new Items("Onion", 0.10));
            if (jCheckBox2.isSelected()) list.add(new Items("Tomato", 0.10));           
            if (jCheckBox10.isSelected()) list.add(new Items("Onion Rings", 1.50));
            if (jCheckBox8.isSelected()) list.add(new Items("Fries", 1.50));
            if (jCheckBox6.isSelected()) list.add(new Items("Salad", 1.50));            
            if (jCheckBox15.isSelected()) list.add(new Items("Coke", 1.00));           
            if (jCheckBox9.isSelected()) list.add(new Items("Dr. Pepper", 1.00));
            if (jCheckBox7.isSelected()) list.add(new Items("Fanta", 1.00));
            if (jCheckBox12.isSelected()) list.add(new Items("Sprite", 1.00));
            if (jCheckBox11.isSelected()) list.add(new Items("Mountain Dew", 1.00));
            if (jCheckBox14.isSelected()) list.add(new Items("Water", 1.00));
            if (jCheckBox13.isSelected()) list.add(new Items("Shake", 1.00));
            
            if (jCheckBox5.isSelected() || jCheckBox3.isSelected()
                    || jCheckBox1.isSelected() || jCheckBox4.isSelected()
                    || jCheckBox2.isSelected()) {
                jTextArea1.append("Burger with: \n");
            }

            for (int i = 0; i < list.size(); i++) {
                jTextArea1.append(list.get(i).getName() + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error in Cart List");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // done button
            jPanel3.removeAll();
            jPanel3.add(payment);
            jPanel3.repaint();
            jPanel3.revalidate();

            list.removeAll(list);

            double value = 0;

            if (jCheckBox5.isSelected()) list.add(new Items("Cheese", 0.10));
            if (jCheckBox3.isSelected()) list.add(new Items("Pickles", 0.10));          
            if (jCheckBox1.isSelected()) list.add(new Items("Lettuce", 0.10));
            if (jCheckBox4.isSelected()) list.add(new Items("Onion", 0.10));
            if (jCheckBox2.isSelected()) list.add(new Items("Tomato", 0.10));           
            if (jCheckBox10.isSelected()) list.add(new Items("Onion Rings", 1.50));
            if (jCheckBox8.isSelected()) list.add(new Items("Fries", 1.50));
            if (jCheckBox6.isSelected()) list.add(new Items("Salad", 1.50));            
            if (jCheckBox15.isSelected()) list.add(new Items("Coke", 1.00));           
            if (jCheckBox9.isSelected()) list.add(new Items("Dr. Pepper", 1.00));
            if (jCheckBox7.isSelected()) list.add(new Items("Fanta", 1.00));
            if (jCheckBox12.isSelected()) list.add(new Items("Sprite", 1.00));
            if (jCheckBox11.isSelected()) list.add(new Items("Mountain Dew", 1.00));
            if (jCheckBox14.isSelected()) list.add(new Items("Water", 1.00));
            if (jCheckBox13.isSelected()) list.add(new Items("Shake", 1.00));

            if (jCheckBox5.isSelected() || jCheckBox3.isSelected()
                    || jCheckBox1.isSelected() || jCheckBox4.isSelected()
                    || jCheckBox2.isSelected()) {
                jTextArea1.append("Burger with: \n");
                value += 2;
            }

            for (int i = 0; i < list.size(); i++) {
                value += list.get(i).getPrice();
            }

            //setting the total owed in payment panel
            jLabel40.setText("$" + String.format("%.2f", value * 1.075));
        } catch (Exception e) {
            System.out.println("Error with Done Button");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            // burger menu
            jPanel3.removeAll();
            jPanel3.add(burger_maker);
            jPanel3.repaint();
            jPanel3.revalidate();
        } catch (Exception e) {
            System.out.println("Error with Burger Menu");
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // burger ingredients back button
            jPanel3.removeAll();
            jPanel3.repaint();
            jPanel3.add(jPanel1);
            jPanel3.revalidate();
        } catch (Exception e) {
            System.out.println("Error with Back Button");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        try {
            // start
            jPanel2.removeAll();
            jPanel2.add(options);
            jPanel2.repaint();
            jPanel2.revalidate();
        } catch (Exception e) {
            System.out.println("Error with Start Menu");
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        //start
        jPanel5MouseClicked(evt);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // sides back
        jButton3ActionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        try {
            // sides menu
            jPanel3.removeAll();
            jPanel3.add(sides);
            jPanel3.repaint();
            jPanel3.revalidate();
        } catch (Exception e) {
            System.out.println("Error with Sides Menu");
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // beverages back
        jButton3ActionPerformed(evt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        try {
            // beverages menu
            jPanel3.removeAll();
            jPanel3.add(beverages);
            jPanel3.repaint();
            jPanel3.revalidate();
        } catch (Exception e) {
            System.out.println("Error with Beverages Menu");
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // payment place order
        jPanel3.removeAll();
        jPanel3.add(final_stage);
        jPanel3.repaint();
        jPanel3.revalidate();

        try {
            PrintWriter kitchen = new PrintWriter("kitchen.txt");
            kitchen.println("New Order");
            kitchen.println();
            kitchen.println("Customers Card Info:");
            kitchen.println(jTextField3.getText());
            kitchen.println(jTextField1.getText());
            kitchen.println(jTextField2.getText());
            kitchen.println();
            kitchen.println("Our Customer wants: ");

            for (int i = 0; i < list.size(); i++) {
                kitchen.println(list.get(i).getName());
            }

            kitchen.println();
            if (userOption == true) {
                kitchen.println("Customer wants the meal for here.");
            } else {
                kitchen.println("Customer wants the meal to go.");
            }
            kitchen.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error with Output Text File");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // cart back
        jButton3ActionPerformed(evt);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // payment back
        jButton3ActionPerformed(evt);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            //eat in method implement
            jPanel2.removeAll();
            jPanel2.add(menu);
            jPanel2.repaint();
            jPanel2.revalidate();

            //true == eat in
            userOption = true;
        } catch (Exception e) {
            System.out.println("Error with Eat In Option");
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            //togo method implement
            jPanel2.removeAll();
            jPanel2.add(menu);
            jPanel2.repaint();
            jPanel2.revalidate();

            //false == togo
            userOption = false;
        } catch (Exception e) {
            System.out.println("Error with To Go Option");
        }
    }//GEN-LAST:event_jLabel5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel beverages;
    private JPanel burger_maker;
    private JPanel cart_list;
    private JPanel final_stage;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox10;
    private JCheckBox jCheckBox11;
    private JCheckBox jCheckBox12;
    private JCheckBox jCheckBox13;
    private JCheckBox jCheckBox14;
    private JCheckBox jCheckBox15;
    private JCheckBox jCheckBox2;
    private JCheckBox jCheckBox3;
    private JCheckBox jCheckBox4;
    private JCheckBox jCheckBox5;
    private JCheckBox jCheckBox6;
    private JCheckBox jCheckBox7;
    private JCheckBox jCheckBox8;
    private JCheckBox jCheckBox9;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel44;
    private JLabel jLabel45;
    private JLabel jLabel47;
    private JLabel jLabel48;
    private JLabel jLabel5;
    private JLabel jLabel51;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel8;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JPanel menu;
    private JPanel menu_header;
    private JPanel options;
    private JPanel payment;
    private JPanel sides;
    private JPanel start;
    // End of variables declaration//GEN-END:variables
}
